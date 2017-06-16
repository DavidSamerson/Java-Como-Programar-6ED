package arquivos.Fluxos;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class writeRandomFile {

	private RandomAccessFile output;
	private static final int NUMBER_RECORDS = 100;

	public void openFile() {
		try {
			output = new RandomAccessFile("clients.bat", "rw");
		} catch (IOException e) {
			System.err.println("Arquivo não encontrado");
		}
	}

	public void closeFile() {
		try {
			if (output != null)
				output.close();
		} catch (IOException e) {
			System.err.println("Erro ao fechar o arquivo");
			System.exit(1);
		}
	}

	public void addRecords() {
		RandomAcessAccountRecord record = new RandomAcessAccountRecord();
		int accountNumber = 0;
		String firstName;
		String lastName;
		double balance;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite CTRL + Z para fechar o arquivo");
		System.out.println("Entre com seu numero de conta, primeiro nome, segundo nome e balanço.");

		while (input.hasNext()) {
			try {
				accountNumber = input.nextInt();
				firstName = input.next();
				lastName = input.next();
				balance = input.nextDouble();

				if (accountNumber > 0 && accountNumber <= NUMBER_RECORDS) {

					record.setAccount(accountNumber);
					record.setFirstName(firstName);
					record.setLastName(lastName);
					record.setBalance(balance);

					output.seek((accountNumber - 1) * RandomAcessAccountRecord.SIZE);
					record.write(output);
				} else
					System.out.println("A conta está entre 0 e 100");

			}

			catch (IOException e) {
				System.err.println("Erro ao gravar no arquivo");
				return;
			}
			
			catch (NoSuchElementException e) {
				System.err.println("Entrada inválida");
				input.nextLine();
			}
			
			System.out.println("Entre com seu numero de conta, primeiro nome, segundo nome e balanço.");

		}
	}
}

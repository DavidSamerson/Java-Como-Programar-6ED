package arquivos.Fluxos;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
	
	private Formatter output;

	public void openFile() {
		
		try {
			output = new Formatter("clients.txt");
		} catch (SecurityException se) {
			System.out.println("Você não tem acesso ao arquivo");
			System.exit(1);
		} catch (FileNotFoundException fnfe){
			System.out.println("Erro ao criar o arquivo");
			System.exit(1);
		}
	}
	
	public void addRecords(){
		
		AccountRecord record = new AccountRecord();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informações aqui...");
		
		while (input.hasNext()) {
			
			try {
				record.setAccount(input.nextInt());
				record.setFirstName(input.next());
				record.setLastName(input.next());
				record.setBalance(input.nextDouble());
				
				if (record.getAccount() > 0) {
					
					output.format("%d %s %s %.2f\n\n", 
							record.getAccount(), record.getFirstName(),
							record.getLastName(), record.getBalance());
				}
				else {
					System.out.println("Conta Zerada");
				}
			} catch (FormatterClosedException fce) {
				System.err.println("Erro ao GRAVAR. Classe CreateTextFile, Método: addRecords\n");
				return;
			} catch (NoSuchElementException nsee) {
				System.err.println("Erro na entrada, tente de novo\n");
				input.nextLine();
			}
			
			System.out.println("Entre com o numero da conta");
			
		}
		
	} 
	public void closeFile(){
			
			if( output != null){
				output.close();
			}
		
	}

}

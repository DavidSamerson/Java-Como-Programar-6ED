package arquivos.Fluxos;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadRandomFile {
	
	private RandomAccessFile input;
	
	public void openFile(){
		try {
			input = new RandomAccessFile("clients.bat","wr");
		} catch (IOException e) {
			System.out.println("Arquivo não foi encontrado");
		}
	}
	
	public void readRecords(){
		RandomAcessAccountRecord record = new RandomAcessAccountRecord();
		System.out.println("Account - FirstName - LastName - Balance");
		try {
			while (true) {
				do {
					record.read(input);
				} while (record.getAccount() == 0);
				
				System.out.println(record.getAccount() 
						+" "+ record.getFirstName()
						+" "+ record.getLastName()
						+" "+ record.getBalance());
			}
		} catch (EOFException e) {
			return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Erro ao gravar");
		}
	}
	
	public void closeFile(){
		try {
			if (input != null) {
				input.close();
			}
		} catch (IOException e) {
			System.err.println("Erro ao fechar");
			System.exit(1);
		}
	}
	
	
}

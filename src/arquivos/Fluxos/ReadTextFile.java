package arquivos.Fluxos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
	
	private Scanner input;
	
	public void openFile(){
		
		try {
			input = new Scanner(new File("clients.txt"));
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Erro ao Abrir o Arquivo");
			System.exit(1);
		}
		
	}
	
	public void readRecords(){
		
		AccountRecord record = new AccountRecord();
		
		System.out.println("Account - FirstName - LastName - Balance");
		
		try {
			
			while (input.hasNext()) {
				
				record.setAccount(input.nextInt());
				record.setFirstName(input.next());
				record.setLastName(input.next());
				record.setBalance(input.nextDouble());
				
				System.out.printf("%-10d%-12s%-12s%10.2f\n",
						record.getAccount(), record.getFirstName(),
						record.getLastName(), record.getBalance());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

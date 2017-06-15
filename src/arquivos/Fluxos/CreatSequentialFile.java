package arquivos.Fluxos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreatSequentialFile {
	
	private ObjectOutputStream  output;
	
	public void openFile(){
		
		try {
			output = new ObjectOutputStream(new FileOutputStream("clients.txt"));
		} catch (IOException e) {
			System.out.println("Erro ao abrir o arquivo");
		}
		
	}
	
	public void addRecords(){
		
		AccountRecordSerializable record;
		int accountNumber = 0;
		String firstName;
		String lastName;
		double balance;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite as informações e pressione <ctrl+z> pra sair: \n");
		
		while (input.hasNext()) {
			
			try {
				
				accountNumber = input.nextInt();
				firstName = input.next();
				lastName = input.next();
				balance = input.nextDouble();
				
				if(accountNumber > 0){
					
					record = new AccountRecordSerializable(accountNumber,firstName,lastName,balance);
					output.writeObject(record);
				}
				else {
					System.out.println("Conta zerada");
				}
				
			} catch (IOException e) {
				
				System.err.println("Conta zerada");
				return;
				
			} catch (NoSuchElementException e) {
				
				System.err.println("Formato Errado");
				input.nextLine();
				
			}
			
			System.out.println("Digite Novamente\n");
		}
		
	}
	
	public void closeFile(){
		
		try {
			
			if (output != null)
				output.close();
			
		} catch (IOException e) {
			
			System.err.println("Erro. fechando arquivo.");
			System.exit(1);
			
		}
	}

}

package arquivos.Fluxos;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.security.auth.callback.TextInputCallback;

public class CreditInquiry {

	private MenuOption accountType;
	private Scanner input;
	private MenuOption choices[] = {
			MenuOption.ZERO_BALANCE, MenuOption.CREDIT_BALANCE,
			MenuOption.DEBIT_BALANCE, MenuOption.END};
	
	public void readRecords(){
		
		AccountRecord account = new AccountRecord();
		
		try {
			
			input = new Scanner(new File("clients.txt"));
			
			while (input.hasNext()) {
				
				account.setAccount(input.nextInt());
				account.setFirstName(input.next());
				account.setLastName(input.next());
				account.setBalance(input.nextDouble());
				
				if (shouldDisplay(account.getBalance())){
					System.out.printf("%-10d%-12s%-12s%10.2f\n",
							account.getAccount(), account.getFirstName(),
							account.getLastName(), account.getBalance());
				}
				
			}
			
		} catch (NoSuchElementException e) {
			System.err.println("Formato Errado");
			input.close();
			System.exit(1);
		} catch (IllegalStateException e) {
			System.err.println("Erro de Leitura");
			System.exit(1);
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado");
			System.exit(1);
		} finally {
			if (input != null)
				input.close();
		}
		
	} 
	
	private boolean shouldDisplay(double balance){
		
		if((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0)){
			return true;
		} 
		else if  ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0)){
			return true;
		}
		else if ((accountType  == MenuOption.ZERO_BALANCE) && (balance == 0)){
			return true;
		}
		
		return false;
	
	}
	
	private MenuOption getRequest(){
		
		Scanner textIn = new Scanner (System.in);
		int request = 1;
		
		System.out.println("digite 1-Zero Balanço 2-credito balanço 3-debito balanço 4-sair");
		
		try {
			do {
				
				System.out.println("\n? ");
				request = textIn.nextInt();
				
			} while ((request < 1)&&(request > 4));
		} catch (NoSuchElementException e) {
			
			System.err.println("Entrada inválida");
			System.exit(1);
			
		}
		return choices[request-1];
	}
	
	public void processRequest(){
		
		accountType = getRequest();
		
		while (accountType != MenuOption.END) {
			
			switch (accountType) {
			case ZERO_BALANCE:
				System.out.println("\nZERO Balanço:\n");
				break;
			case CREDIT_BALANCE:
				System.out.println("\nCREDITO Balanço:\n");
				break;
			case DEBIT_BALANCE:
				System.out.println("\nDEBITO Balanço:\n");
				break;

			}
			
			readRecords();
			accountType = getRequest();
			
		}
		
	}
	
}

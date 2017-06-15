package arquivos.Fluxos;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.NoSuchElementException;
import java.util.Scanner;

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
		}
		
	}
	
}

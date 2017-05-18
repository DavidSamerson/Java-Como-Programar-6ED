package numeros.PontoFlutuante.Double;

import java.util.Scanner;

public class AccountTeste {

	public static void main(String[] args) {
		
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);
		
		System.out.printf("conta 1 saldo: %f\n",account1.getBalance());
		System.out.printf("conta 2 saldo: %f\n",account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		double depositAmount; //variavel que guarda o que o usuario digitar.
		
		System.out.println("Entre com o depósito da conta 1: ");
		depositAmount = input.nextDouble();
		
		System.out.printf("\n Adicionando %.2f... \nBalanço da conta 1: \n\n", depositAmount);
		account1.credit(depositAmount);
		
		System.out.printf("conta 1 saldo: %f\n",account1.getBalance());
		System.out.printf("conta 2 saldo: %f\n",account2.getBalance());
		
		
		System.out.println("\n Entre com o depósito da conta 2: ");
		depositAmount = input.nextDouble();
		
		System.out.printf("\n Adicionando %.2f... \nBalanço da conta 2: \n\n", depositAmount);
		account2.credit(depositAmount);
		
		System.out.printf("conta 1 saldo: %f\n",account1.getBalance());
		System.out.printf("conta 2 saldo: %f\n",account2.getBalance());
		
	}
}

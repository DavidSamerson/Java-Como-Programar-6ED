package numeros.PontoFlutuante.Double;
//Desenvolvido por David Samerson

public class Account {
	
	private double balance; //armazena o saldo
	
	public Account(Double initialBalance){
		
		if (initialBalance > 0.0){
			balance = initialBalance;
		}
	}
	
	//adiciona valor a conta
	public void credit (double amount){
		
		balance = balance + amount;
	}
	
	public double getBalance(){
		
		return balance;
	}
}

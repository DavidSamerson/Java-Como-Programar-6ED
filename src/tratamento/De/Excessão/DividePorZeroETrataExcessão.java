package tratamento.De.Excessão;

import java.security.GuardedObject;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZeroETrataExcessão {
	
	public static int Quotient(int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean continueLoop = true;
		
		do {
			
			try {
				
				System.out.printf("Entre com o numerador");
				int numerador = sc.nextInt();
				System.out.printf("Entre com o denominador");
				int denominador = sc.nextInt();
				
				int resultado = Quotient(numerador, denominador);
				
			} catch (InputMismatchException e) {
				// TODO: handle exception
				
				
			}catch (ArithmeticException e) {
				// TODO: handle exception
				
			}
			
		} while (continueLoop);

	}

}

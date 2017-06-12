package tratamento.De.Excessão;

import java.util.Scanner;

public class AssertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um numero de 1 a 10: ");
		int numero = input.nextInt();

		assert (numero >= 0 && numero <= 10) : "Numero Ruim " + numero;

		System.out.println("Você digitou: " + numero);

	}

}

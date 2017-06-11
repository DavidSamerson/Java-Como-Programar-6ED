package tratamento.De.Excessão;

import java.util.Scanner;

public class DivizaoPorZero {

	// TODO Auto-generated method stub

	public static int quotient(int numerador, int denominador) {
		return numerador / denominador;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Entre com o numerador");
		int numerador = sc.nextInt();
		System.out.printf("Entre com o denominador");
		int denominador = sc.nextInt();

		int result = quotient(numerador, denominador);

		System.out.printf("\nResultado: %d / %d  = %d\n", numerador, denominador, result);
	}
}

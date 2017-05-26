package arrays;

import java.util.Random;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random gerarNumeros = new Random();
		int Frequencia[] = new int[7];
		
		for( int roll=0; roll < 6000; roll++){
			++Frequencia[1+gerarNumeros.nextInt(6)];
		}
		
		System.out.printf("%s%10d\n","FACE","FREQUENCY");
		
		for ( int face = 1; face < Frequencia.length; face++){
			System.out.printf("%4d%10d\n",face,Frequencia[face]);
		}
	}

}

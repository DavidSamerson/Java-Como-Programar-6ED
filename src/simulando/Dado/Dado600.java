package simulando.Dado;

import java.util.Random;

public class Dado600 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random numeros = new Random();
		int face;
		
		for(int i=1; i<=20; i++){
			
			face = 1+numeros.nextInt(6);
			
			System.out.printf("%d", face);
			
			if (i % 5 == 0){
				System.out.println();
			}
		}

	}

}

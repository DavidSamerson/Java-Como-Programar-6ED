package simulando.Dado;

import java.util.Random;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random GerarNumero = new Random();
		
		int F1 = 0,F2 = 0,F3 = 0,F4 = 0,F5 = 0,F6 = 0,FACE;
		
		for(int roll=1; roll<=6000; roll++){
			
			FACE = 1+GerarNumero.nextInt(6);
			
			switch(FACE){
			
			case 1:++F1;
			case 2:++F2;
			case 3:++F3;
			case 4:++F4;
			case 5:++F5;
			case 6:++F6;

			}

		}
		
		System.out.println("FACE do DADO \t FREQUÊNCIA");
		System.out.printf("1\t\t\t%d\n"
							+"2\t\t\t%d\n"
							+"3\t\t\t%d\n"
							+"4\t\t\t%d\n"
							+"5\t\t\t%d\n"
							+"6\t\t\t%d\n", F1,F2,F3,F4,F5,F6);

	}

}

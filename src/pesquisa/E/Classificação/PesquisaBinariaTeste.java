package pesquisa.E.Classifica��o;

import java.util.Scanner;

public class PesquisaBinariaTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int searchInt;
		int position;
		
		PesquisaBinaria app = new PesquisaBinaria(15);
		System.out.println(app);
		
		System.out.println("entre com uma pesquisa (-1 sai)");
		searchInt = input.nextInt();
		System.out.println();
		
		while (searchInt != -1) {
			
			position = app.binarySearch(searchInt);
			
			if (position ==  -1) {
				System.out.println("N�o encontrado");
			}
			
			else
				System.out.println("Encontrado na posi��o " + position+ "\n");
			
			System.out.println("entre com uma pesquisa (-1 sai)");
			searchInt = input.nextInt();
			System.out.println();
		}
	}

}

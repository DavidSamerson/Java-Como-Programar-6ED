package pesquisa.E.Classificação;

import java.util.Scanner;

public class PesquisaLinearTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int searchInt;
		int position;
		
		PesquisaLinear app = new PesquisaLinear(10);
		System.out.println("Entre com um valor (-1 sai)");
		searchInt = input.nextInt();
		
		while (searchInt != -1) {
			position = app.linearSearch(searchInt);
			
			if (position == -1) {
				System.out.println("The Integer " + searchInt + "Não Foi Encontrada");
			}
			else {
				System.out.println("The Integer " + searchInt + " Encontrado na posição "+position+"\n");
			}
			
			System.out.println("Entre com um valor (-1 sai)");
			searchInt = input.nextInt();
		}
		
	}
}

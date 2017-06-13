package arquivos.Fluxos;

import java.util.Scanner;

public class FileDemonstrationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		FileDemonstration app = new FileDemonstration();
		
		System.out.println("Entre com o nome do diretorio: ");
		app.analizePath(sc.nextLine());

	}

}

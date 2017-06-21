package pesquisa.E.Classificação;

import java.util.Random;

public class ClassificacaoPorInsercao {

	private int[] data;
	private static Random gerador = new Random();
	
	public ClassificacaoPorInsercao(int size) {
		data = new int [size];
		for (int i = 0; i < size; i++) {
			 data[i] = 10 + gerador.nextInt(90);
		}
	}
	
	

}

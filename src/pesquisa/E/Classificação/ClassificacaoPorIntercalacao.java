package pesquisa.E.Classificação;

import java.util.Iterator;
import java.util.Random;

public class ClassificacaoPorIntercalacao {

	private int data[];
	private static Random gerador = new Random();

	public ClassificacaoPorIntercalacao(int size) {
		data = new int[size];
		for (int i = 0; i < size; i++) {
			data[i] = 10 + gerador.nextInt(90);
		}
	}

	public void sort() {
		sortArray(0, data.length - 1);
	}

	private void sortArray(int low, int high) {
		if ((high - low) >= 1) {
			int middle = (low + high)/2;
			int middle2 = middle + 1;
			
			System.out.println("Sprit:  "+subarray(low, high));
			System.out.println("        "+subarray(low, middle));
			System.out.println("        "+subarray(middle2, high));
			sortArray(low, middle);
			sortArray(middle2, high);
			merge (low, middle, middle2, high);
		}
	}

	private void merge(int low, int middle, int middle2, int high) {
		
	}

	private String subarray(int low, int high) {
		// TODO Auto-generated method stub
		return null;
	}

}

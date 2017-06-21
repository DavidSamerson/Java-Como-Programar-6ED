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
			int middle = (low + high) / 2;
			int middle2 = middle + 1;

			System.out.println("Sprit:  " + subarray(low, high));
			System.out.println("        " + subarray(low, middle));
			System.out.println("        " + subarray(middle2, high));
			sortArray(low, middle);
			sortArray(middle2, high);
			merge(low, middle, middle2, high);
		}
	}

	private void merge(int left, int middle, int middle2, int hight) {
		int leftIndex = left;
		int rightIndex = middle2;
		int combinedIndex = left;
		int[] combined = new int[data.length];

		System.out.println("Merge:  " + subarray(left, middle));
		System.out.println("        " + subarray(middle2, hight));

		while (leftIndex <= middle && rightIndex <= hight) {
			if(data[leftIndex] <= data[rightIndex])
				combined[combinedIndex++] = data[leftIndex++];
			else
				combined[combinedIndex++] = data[leftIndex++];
		}
		
		if(leftIndex == middle2)
			while(rightIndex <= hight)
				combined[combinedIndex++] = data[rightIndex++];
		else
			while(leftIndex <= middle)
				combined[combinedIndex++] = data[leftIndex++];
	}

	private String subarray(int low, int high) {
		// TODO Auto-generated method stub
		return null;
	}

}

package pesquisa.E.Classificação;

import java.util.Arrays;
import java.util.Random;

public class PesquisaBinaria {

	private int[] data;
	private static Random gerator = new Random();

	public PesquisaBinaria(int size) {
		data = new int[size];
		for (int i = 0; i < size; i++) {
			data[i] = 10 + gerator.nextInt(90);
		}
		Arrays.sort(data);
	}

	public int binarySearch(int searchElement) {
		int low = 0;
		int righ = data.length - 1;
		int middle = (low + righ + 1) / 2;
		int location = -1;

		do {
			System.out.printf(remaningElements(low, righ));
			for (int i = 0; i < middle; i++) {
				System.out.print(" ");
			}
			System.out.println(" * ");

			if (searchElement == data[middle]) {
				location = middle;
			} else if (searchElement < data[middle]) {
				righ = middle - 1;
			} else
				low = middle + 1;

			middle = (low + righ + 1) / 2;

		} while ((low <= righ) && (location == -1));
		
		return location;
	}

	private String remaningElements(int low, int righ) 
	{
		StringBuffer temporary = new StringBuffer();
		
		for (int i = 0; i < low; i++) {
			temporary.append("  ");
		}
		
		for (int i = low; i < righ ; i++) {
			temporary.append(data[i] + " ");
		}
		
		temporary.append("\n");
		
		return temporary.toString();
	}
	
	public String toString()
	{
		return remaningElements(0,data.length-1);
	}

}

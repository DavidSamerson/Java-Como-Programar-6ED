package pesquisa.E.Classifica��o;

import java.util.Arrays;
import java.util.Random;

public class PesquisaBinaria {
	
	private int [] data;
	private static Random gerator = new Random();

	public PesquisaBinaria(int size)
	{
			data = new int[size];
			for (int i = 0; i < size; i++) {
				data[i] = 10 + gerator.nextInt(90);
			}
			Arrays.sort(data);
	}
	
	public int binarySearch(int searchElement)
	{
		int low = 0;
		int righ = data.length - 1;
		int middle = (low + righ + 1) / 2;
		int location = -1;
	}

}

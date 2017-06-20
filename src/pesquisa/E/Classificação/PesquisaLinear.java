package pesquisa.E.Classificação;

import java.util.Random;

public class PesquisaLinear {
	
	private int [] data;
	private static Random generator = new Random();
	
	public PesquisaLinear(int size)
	{
		data = new int[size];
		
		for(int i = 0; i < size; i++)
		{
		data[i] = 10 + generator.nextInt(90);
		}
	}
	
	public int linearSearch(int searchKey)
	{
		for (int i = 0; i < data.length; i++) {
			if (data[i] == searchKey) {
				return i;
			}
		}
		return -1;
	}
	
	public String toString()
	{
		StringBuffer temporary = new StringBuffer();
		
		for (int i : data) {
			temporary.append( i + "");
		}
		
		temporary.append("\n");
		return temporary.toString();
	}

}

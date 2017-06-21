package pesquisa.E.Classificação;

import java.util.Random;

public class ClassificacaoPorSelecao {
	
	private int [] data;
	private static Random generator = new Random();

	public ClassificacaoPorSelecao(int size) 
	{
		data = new int[size];
		for (int i = 0; i < size; i++) {
			data[i] = 10 + generator.nextInt(90);
		}
	}
	
	public void sort()
	{
		int smallest;
		
		for (int i = 0; i < data.length -1; i++) {
			smallest = i;
			for (int j = i+1; j < data.length ; j++) {
				if (data[j]<data[smallest])
					smallest = j;
			}
			swap(i,smallest);
			printPass(i+1, smallest);
		}
	}

	private void printPass(int pass, int index) {
		// TODO Auto-generated method stub
		System.out.print(String.format("After Pass %2d: ", pass));
		
		for (int i = 0; i < index; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.print(data[index] + "* ");
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		System.out.println("\n            ");
		
		for (int i = 0; i < pass; i++) {
			System.out.print("-- ");
		}
		System.out.println("\n");
	}
	
	public String toString(){
		StringBuffer temporary = new StringBuffer();
		for (int i : data) {
			temporary.append(i + " ");
		}
		temporary.append("\n");
		return temporary.toString();
	}

	private void swap(int first, int second) {
		// TODO Auto-generated method stub
		int temporary = data[first];
		data[first] = data[second];
		data[second] = temporary;
	}

}

package pesquisa.E.Classificação;

import java.util.Random;

public class ClassificacaoPorInsercao {

	private int[] data;
	private static Random gerador = new Random();

	public ClassificacaoPorInsercao(int size) {
		data = new int[size];
		for (int i = 0; i < size; i++) {
			data[i] = 10 + gerador.nextInt(90);
		}
	}

	public void sort() {
		int insert;
		for (int i = 1; i < data.length; i++) {
			insert = data[i];
			int moverItem = i;
			while (moverItem > 0 && data[moverItem - 1] > insert) {
				data[moverItem] = data[moverItem-1];
				moverItem--;
			}
			data[moverItem] = insert;
			printPass(i,moverItem);
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

}

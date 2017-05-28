package arrays;

public class forAprimorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		for ( int number : array ){
			total += number;
		}
		System.out.printf("Elementos totais do array: %d\n", total);

	}

}

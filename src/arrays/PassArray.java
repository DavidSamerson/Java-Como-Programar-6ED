package arrays;

public class PassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {1,2,3,4,5};
		
		System.out.println("Effects of passing reference to entire array: \n"
				+ "The Values of the original array are: ");
		
		for( int value: array)
			System.out.printf("    %d", value);
		
		modifyArray( array );
		System.out.printf("\n\nEffects of passing array element value: \n"
				+ "Array [3] before modifyElement: %d\n", array[3]);
		
		modifyElement( array[3] );
		System.out.printf("Array[3] after modifyElement: %d\n", array[3]);

	}

	private static void modifyElement(int element) {
		// TODO Auto-generated method stub
		
		element *= 2;
		System.out.println("Value of element in modifyElement: %d\n", element);
		
	}

	private static void modifyArray(int[] array) {
		// TODO Auto-generated method stub
		
	}

}

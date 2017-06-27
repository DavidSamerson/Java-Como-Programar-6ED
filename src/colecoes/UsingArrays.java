package colecoes;

import java.util.Arrays;

public class UsingArrays {
	
	private int intArray[] = {1,2,3,4,5,6};
	private double doubleArray[] = {8.4, 9.3, 0.2, 7.9, 3.4};
	private int filledIntArray[], intArrayCopy[];

	public UsingArrays() {
		filledIntArray = new int [10];
		intArrayCopy = new int [intArray.length];
		Arrays.fill(filledIntArray, 7);
		Arrays.sort(doubleArray);
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

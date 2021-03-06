package colecoes;

import java.util.Arrays;

public class UsingArrays {

	private int intArray[] = { 1, 2, 3, 4, 5, 6 };
	private double doubleArray[] = { 8.4, 9.3, 0.2, 7.9, 3.4 };
	private int filledIntArray[], intArrayCopy[];

	public UsingArrays() {
		filledIntArray = new int[10];
		intArrayCopy = new int[intArray.length];
		Arrays.fill(filledIntArray, 7);
		Arrays.sort(doubleArray);
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
	}

	public void printArray() {

		System.out.println("Double Array: ");
		for (double d : doubleArray) {
			System.out.printf("%.1f", d);
		}

		System.out.println("\nInt Array: ");
		for (int i : intArray) {
			System.out.printf("%d", i);
		}

		System.out.println("\nFilled Int Array: ");
		for (int i : filledIntArray) {
			System.out.printf("%d", i);
		}

		System.out.println("\nInt Array Copy: ");
		for (int i : intArrayCopy) {
			System.out.printf("%d", i);
		}

		System.out.println("\n");
	}

	public int searchForInt(int value) {
		return Arrays.binarySearch(intArray, value);
	}

	public void printEquality() {
		
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("IntArray %s IntArrayCopy", (b ? "==" : "!="));
		
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("IntArray %s filledIntArray", (b ? "==" : "!="));
	}

	public static void main(String[] args) {
		
		UsingArrays app = new UsingArrays();
		
		app.printArray();
		app.printEquality();
		
		int location = app.searchForInt(5);
		if(location >=0)
			System.out.printf("Fount 5 at element %d for IntArray\n",location);
		else
			System.out.println("5 not found");
		
		location = app.searchForInt(8763);
		if(location >=0)
			System.out.printf("Fount 8763 at element %d for IntArray\n",location);
		else
			System.out.println("8763 not found");
	}

}

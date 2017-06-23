package genericos;

public class OverloadMethods {
	
	public static void printArray(Integer[] inputArray)
	{
		for(Integer element : inputArray){
			System.out.printf("%s",inputArray);
		}
		System.out.println();
	}
	
	public static void printArray(Double[] inputArray)
	{
		for(Double element : inputArray){
			System.out.printf("%s",inputArray);
		}
		System.out.println();
	}
	
	public static void printArray(Character[] inputArray)
	{
		for(Character element : inputArray){
			System.out.printf("%s",inputArray);
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Integer[] integerArray = {1,2,3,4,5,6};
		Double[] doubleArray = {1.1,1.2,1.3,1.4,1.5,1.6,1.7};
		Character[]characterArray = {'h','e','l','l','o'};
		
		System.out.println("Array de Inteiros");
		printArray(integerArray);
		System.out.println("Array de Double");
		printArray(doubleArray);
		System.out.println("Array de Caracteres");
		printArray(characterArray);
	}
}

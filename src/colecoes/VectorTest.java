package colecoes;

import java.util.NoSuchElementException;
import java.util.Vector;

public class VectorTest {
	
	private static final String colors[] = {"RED", "WHITE", "BLUE"};

	public VectorTest() {
		
		Vector<String> vector = new Vector<String> ();
		printVector(vector);
		
		for (String a : vector) {
			vector.add(a);
		}
		
		printVector(vector);
		
		try {
			
			System.out.printf("First Elements: %s\n",vector.firstElement());
			System.out.printf("Last Elements: %s\n",vector.lastElement());
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		
		if(vector.contains("RED"))
			System.out.printf("\n\"RED\" notFound at index %d\n",
			vector.indexOf("RED"));
		else
			System.out.printf("\n\"RED\" notFound \n ");
		
		vector.remove("RED");
		System.out.println("Vector RED as been removed");
		printVector(vector);
		
		if(vector.contains("RED"))
			System.out.printf("\n\"RED\" notFound at index %d\n",
			vector.indexOf("RED"));
		else
			System.out.printf("\n\"RED\" notFound \n ");
		
		System.out.printf("\nSize: %d\nCapacity: %d\n",vector.size(),vector.capacity());
	}

	private void printVector(Vector<String> vectorToOutput) {
		
		if(vectorToOutput.isEmpty())
			System.out.print("Vector is Empty");
		
		else{
			
			System.out.print("Vector Contains: ");
			for(String e : vectorToOutput)
				System.out.printf("%s",e);
		}
		
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

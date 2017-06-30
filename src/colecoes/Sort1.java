package colecoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {
	
	private static final String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
	
	public void printElements(){
		
		List<String> list = Arrays.asList(suits);
		
		System.out.printf("Unsorted Array Elements: \n%s\n",list);
		
		Collections.sort(list);
		
		System.out.println("Sorted Array Elements: \n%s\n");
	}

	public static void main(String[] args) {
		

	}

}

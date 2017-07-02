package colecoes;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
	
	private static final String colors[] = {"red","white","blue","peach","gray","orange"};

	public SetTest() {
		
		List<String> list = Arrays.asList(colors);
		System.out.printf("Arrays: %s",list);
		printNonDuplicates(list);
	}

	private void printNonDuplicates(Collection<String> collection) {
		
		Set<String> set = new HashSet<String>(collection);
		System.out.println("\nNon Duplicates are: ");
		
		for (String string : set) {
			System.out.printf("%s",string);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

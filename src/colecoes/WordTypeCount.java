package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordTypeCount {
	
	private Map<String, Integer> map;
	private Scanner scanner;

	public WordTypeCount()
	{
		map = new HashMap<String, Integer>();
		scanner = new Scanner(System.in);
		creatMap();
		displayMap();
	}

	private void creatMap() 
	{
		System.out.println("Enter a String: ");
		String input = scanner.nextLine();
		
		StringTokenizer tokenizer = new StringTokenizer(input);
		
		while (tokenizer.hasMoreTokens()) 
		{
			String word = tokenizer.nextToken().toLowerCase();
			
			if (map.containsKey(word))
			{
				int count = map.get(word);
				map.put(word,count+1);
			}else{
				map.put(word, 1);
			}
		}
	}

	private void displayMap() 
	{
		Set<String> keys = map.keySet();
		
		TreeSet<String> sortedKey = new TreeSet<String> (keys);
		
		System.out.println("Map Contrains: \nKey\t\tValue");
		
		for (String string : sortedKey) {
			System.out.printf("%-10s%-10s\n", keys, map.get(keys));
		}
		
		System.out.printf("\nSize: %d\nIsEmpty: %b\n", map.size(), map.isEmpty());
	}

	public static void main(String[] args) {
		
		new WordTypeCount();

	}

}

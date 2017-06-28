package colecoes;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTest {
	
	private static final String[] colors = {"MAGENTA","RED","WHITE","BLUE","CYAN"};
	private static final String[] removeColors = {"RED","WHITE","BLUE"};

	public CollectionsTest() {
		
		List<String> list = new ArrayList<String>();
		List<String> removeList = new ArrayList<String>();
		
		for(String color : colors){
			list.add(color);
		}
		
		for(String color : removeColors){
			removeList.add(color);
		}
		
		System.out.println("ArrayList: ");
		
		for(int count = 0; count < list.size(); count++){
			System.out.printf("%s",list.get(count));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

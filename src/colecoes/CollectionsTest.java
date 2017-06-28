package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
		
		removeColors(list, removeList);
		
		System.out.println("ArrayList After Calling removeColors");
		
		for(String color : list){
			removeList.add(color);
		}
	}

	private void removeColors(Collection<String> list, Collection<String> removeList) {
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()){
			if(list.contains(iterator.next())){
				iterator.remove();
			}
		}
		
	}

	public static void main(String[] args) {
		new CollectionsTest();
	}

}

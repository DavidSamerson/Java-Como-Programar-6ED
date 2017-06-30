package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort3 {
	
	public void printElements(){
		
		List<Time2> list = new ArrayList<Time2>();
		list.add(new Time2(6, 24, 34));
		list.add(new Time2(18, 14, 58));
		
		System.out.printf("Unsorted Array Elements: \n%s\n",list);
		
		Collections.sort(list,new TimeCompartator());
		
		System.out.printf("Sorted Array Elements: \n%s\n",list);
	}

	public static void main(String[] args) {
		
		Sort3 sort3 = new Sort3();
		sort3.printElements();

	}

}

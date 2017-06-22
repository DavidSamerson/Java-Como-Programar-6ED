package EstruturasDeDados.ListasVinculadas;

public class ListTest {

	public static void main(String[] args) {

		List list = new List();

		list.insertAtFront(-1);
		list.print();
		list.insertAtFront(0);
		list.print();
		list.insertAtBack(1);
		list.print();
		list.insertAtBack(5);
		list.print();

		try {

			Object removedObject = list.removeFromFront();
			System.out.printf("%s Removed \n", removedObject);
			list.print();
			
			removedObject = list.removeFromFront();
			System.out.printf("%s Removed \n", removedObject);
			list.print();
			
			removedObject = list.removeFromBack();
			System.out.printf("%s Removed \n", removedObject);
			list.print();
			
			removedObject = list.removeFromBack();
			System.out.printf("%s Removed \n", removedObject);
			list.print();
			
		} catch (EmptyListException e) {
			e.printStackTrace();
		}

	}

}

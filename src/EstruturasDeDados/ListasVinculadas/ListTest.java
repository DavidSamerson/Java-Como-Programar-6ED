package EstruturasDeDados.ListasVinculadas;

public class ListTest {

	public static void main(String[] args) {

		List list = new List();

		list.insertAtFront(-1);
		list.Print();
		list.insertAtFront(0);
		list.Print();
		list.insertAtBack(1);
		list.Print();
		list.insertAtBack(5);
		list.Print();

		try {

			Object removedObject = list.removeFromFront();
			System.out.printf("%s Removed \n", removedObject);
			list.Print();
			
			removedObject = list.removeFromFront();
			System.out.printf("%s Removed \n", removedObject);
			list.Print();
			
			removedObject = list.removeFromBack();
			System.out.printf("%s Removed \n", removedObject);
			list.Print();



		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

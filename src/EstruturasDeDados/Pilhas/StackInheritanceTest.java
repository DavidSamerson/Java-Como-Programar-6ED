package EstruturasDeDados.Pilhas;

import EstruturasDeDados.ListasVinculadas.EmptyListException;

public class StackInheritanceTest {

	public static void main(String[] args) {
		
		StackInheritance app = new StackInheritance();
		
		app.push(-1);
		app.print();
		app.push(0);
		app.print();
		app.push(1);
		app.print();
		app.push(2);
		app.print();
		
		try {
			Object remove = null;
			while (true) {
				remove = app.pop();
				System.out.printf("%s Popped\n",remove);
				app.print();
			}
		} catch (EmptyListException e) {
			e.printStackTrace();
		}

	}

}

package EstruturasDeDados.Pilhas;

import EstruturasDeDados.ListasVinculadas.EmptyListException;
import EstruturasDeDados.ListasVinculadas.List;

public class StackInheritance extends List {

	public StackInheritance() {
		super("stack");
	}

	public void push(Object object){
		insertAtFront(object);
	}
	
	public Object pop() throws EmptyListException{
		return removeFromFront();
	}

}

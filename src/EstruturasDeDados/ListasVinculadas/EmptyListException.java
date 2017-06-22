package EstruturasDeDados.ListasVinculadas;

public class EmptyListException extends RuntimeException {
	
	public EmptyListException(){
		this("List");
	}
	
	public EmptyListException(String name){
		super(name + " Is Empy" );
	}
}

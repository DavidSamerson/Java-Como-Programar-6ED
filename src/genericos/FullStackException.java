package genericos;

public class FullStackException extends RuntimeException {

	public FullStackException(){
		this("Stack is full");
	}
	public FullStackException(String format) {
		super(format);
	}
	

}

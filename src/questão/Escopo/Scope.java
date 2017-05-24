package questão.Escopo;

public class Scope {
	
	private int x = 1;
	
	public void begin(){
		
		int x = 5;
		
		System.out.printf("\nLocal x in method begin is %d\n",x);

		useLocalVariable();
		useField();
		useLocalVariable();
		useField();
		
		System.out.printf("\nLocal x in method begin is %d\n",x);
	}

	public void useField() {
		// TODO Auto-generated method stub
		System.out.printf("\nLocal x in useField is %d\n",x);
		x*=10;
		System.out.printf("\nLocal x in useField is %d\n",x);
	}

	public void useLocalVariable() {
		// TODO Auto-generated method stub

		int x = 25;
		
		System.out.printf("\nLocal x on entering method useLocalVariable is %d\n",x);
		++x;
		System.out.printf("\nLocal x on entering method useLocalVariable is %d\n",x);
		
	}

}

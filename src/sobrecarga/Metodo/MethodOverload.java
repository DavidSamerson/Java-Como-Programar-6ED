package sobrecarga.Metodo;

public class MethodOverload {
	
	public void testOverloadMethods(){
		
		System.out.printf("\nSquare Integer 7 is %d\n",square(7));
		System.out.printf("\nSquare Double 7 is %f\n",square(7.5));
		
	}

	private double square(double doubleValue) {
		// TODO Auto-generated method stub
		System.out.printf("\nconvertendo double %f",doubleValue);
		return doubleValue * doubleValue;
	}

	private int square(int intValue) {
		// TODO Auto-generated method stub
		System.out.printf("\nconvertendo inteiro %d",intValue);
		return intValue * intValue;
	}

}

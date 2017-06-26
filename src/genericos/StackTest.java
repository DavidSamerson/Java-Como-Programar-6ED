package genericos;

public class StackTest {

	private double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
	private int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

	private Stack<Double> doubleStack;
	private Stack<Integer> integerStack;

	public void testStack() 
	{
		doubleStack = new Stack<Double>(5);
		integerStack = new Stack<Integer>(10);
		
		testPushDouble();
		testPopDouble();
		testPushInteger();
		testPopInteger();
	}
	
	public void testPushDouble()
	{
		try {
			System.out.println("\nPuxing elements Double Stack");
			for (double d : doubleElements) {
				System.out.printf("%.1f",d);
				doubleStack.push(d);
			}
		} catch (FullStackException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	
	public void testPopDouble()
	{
		try {
			System.out.println("\nPopping Elements from DoubleStack");
			double popValue;
			
			while (true) {
				popValue = doubleStack.pop();
				System.out.printf("%.1f", popValue);
			}
		} catch (EmptyStackException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	
	public void testPushInteger()
	{
		try {
			System.out.println("Puxando elementos da intStack");
			for (int e : integerElements){
				System.out.printf("%d",e);
			}
		} catch (FullStackException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	
	public void testPopInteger()
	{
		try {
			System.out.println("\nPopping Elements from intStack");
			int popValue;
			
			while (true) {
				popValue = integerStack.pop();
				System.out.printf("%d",popValue);
			}
		} catch (EmptyStackException e) {
			System.err.println();
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		StackTest app = new StackTest();
		app.testStack();
	}

}

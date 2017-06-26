package genericos;

public class rawTypeTest {
	
	private Double doubleElements[] = {1.1,2.2,3.3,4.4,5.5,6.6};
	private Integer integerArray[] = {1,2,3,4,5,6,7,8,9,10,11};
	
	public void testStack()
	{
		Stack stack1 = new Stack(5);
		Stack stack2 = new Stack<Double>(5);
		Stack<Integer> intStack = new Stack(10);
		
		testPush("Stack1\n",stack1,doubleElements);
		testPop("Stack1\n",stack1);
		testPush("Stack2\n", stack2, doubleElements);
		testPop("Stack1\n",stack2);
		testPush("Integer Stack\n", intStack, integerArray);
		testPop("Stack1\n",intStack);
		
	}

	private void testPop(String string, Stack stack1) {
		// TODO Auto-generated method stub
		
	}

	private <T> void testPush(String string, Stack <T> stack1, T[] doubleElements2) {
		
		
		
	}

	public static void main(String[] args) {
		
		

	}

}

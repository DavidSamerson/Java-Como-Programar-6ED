package genericos;

import java.util.Iterator;

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

	private <T> void testPop(String string, Stack <T> stack) 
	{
		try {
			System.out.printf("\nPopping elements from %s\n",string);
			T popper;
			
			while (true) {
				popper = stack.pop();
				System.out.printf("%s",popper);
			}
		} catch (EmptyStackException e) {
			System.out.println();
			e.printStackTrace();
		}
		
	}

	private <T> void testPush(String name, Stack <T> stack, T[] doubleElements2)
	{
		
		try {
			System.out.printf("\nPushing Elements onto %s\n",name);
			for (T t : doubleElements2) {
				System.out.printf("%s", t);
				stack.push(t);
			}
		} catch (FullStackException e) {
			System.out.println();
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		rawTypeTest app = new rawTypeTest();
		app.testStack();
	}

}

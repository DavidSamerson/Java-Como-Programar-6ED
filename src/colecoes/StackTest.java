package colecoes;

import java.util.EmptyStackException;
import java.util.Stack;

import EstruturasDeDados.ListasVinculadas.EmptyListException;

public class StackTest {
	
	public StackTest() {
		
		Stack<Number> stack = new Stack<Number>();
		
		Long longNumber = 12L;
		Integer intNumber = 34567;
		Float floatNumber = 1.0F;
		Double doubleNumber = 1234.5678;
		
		stack.push(longNumber);
		printStack(stack);
		stack.push(intNumber);
		printStack(stack);
		stack.push(floatNumber);
		printStack(stack);
		stack.push(doubleNumber);
		printStack(stack);
		
		try {
			
			Number removeObject = null;
			
			while (true) {
				
				removeObject = stack.pop();//remove objeto do topo da pilha
				System.out.printf("%s popped \n",removeObject);
				printStack(stack);
				
			}
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
		
	}

	private void printStack(Stack<Number> stack) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

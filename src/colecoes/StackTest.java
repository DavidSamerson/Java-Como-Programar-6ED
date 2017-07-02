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
		
		if(stack.isEmpty()){
			
			System.out.println("Stack is Empty\n\n");
			
		}else{
			
			System.out.println("Stack contains: ");
			
			for (Number number : stack) {
				System.out.printf("%s",number);
			}
			
			System.out.println("(TOP)\n\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

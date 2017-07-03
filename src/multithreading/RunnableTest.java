package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableTest {

	public static void main(String[] args) {
		
		PrintTask task1 = new PrintTask("Thread1");
		PrintTask task2 = new PrintTask("Thread2");
		PrintTask task3 = new PrintTask("Thread3");
		PrintTask task4 = new PrintTask("Thread4");
		
		System.out.println("Starting Multithreads:. ");
		
		ExecutorService threadExecutor = Executors.newFixedThreadPool(3);
		
		threadExecutor.execute(task1);
		threadExecutor.execute(task2);
		threadExecutor.execute(task3);
		
		threadExecutor.shutdown();
		
		System.out.println("Threads Started, main ends\n");

	}

}

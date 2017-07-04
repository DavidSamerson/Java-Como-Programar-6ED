package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedBufferTest {

	public static void main(String[] args) {
		
		ExecutorService app = Executors.newFixedThreadPool(2);
		
		Buffer sharedLocation = new UnsynchronizedBuffer();
		
		System.out.println("action\t\tValue\tProduction\tConsumed");
		System.out.println("------\t\t-----\t----------\t--------");
		
		try {
			
			app.execute(new Producer(sharedLocation));
			app.execute(new Consumer(sharedLocation));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		app.shutdown();
	}

}

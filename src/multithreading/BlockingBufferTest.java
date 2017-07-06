package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlockingBufferTest {

	public static void main(String[] args) {
		
		ExecutorService app = Executors.newFixedThreadPool(2);
		
		Buffer sharedLocation = new BlokingBuffer();
		
		try {
			app.execute(new Producer (sharedLocation));
			app.execute(new Consumer (sharedLocation));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		app.shutdown();
	}

}

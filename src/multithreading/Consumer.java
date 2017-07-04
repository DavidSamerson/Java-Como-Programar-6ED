package multithreading;

import java.util.Random;

public class Consumer implements Runnable {

	private static Random generator = new Random();
	private Buffer sharedLocations;

	public Consumer(Buffer shared) {
		sharedLocations = shared;
	}

	@Override
	public void run() {

		int sum = 0;

		for (int count = 1; count <= 10; count++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sum += sharedLocations.get();
				System.out.printf("\t\t\t%2d\n", sum);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.printf("\n%s %d.\n%s\n", "Consume read values totaling.", sum, "Terminating Consumer");

	}

}

package multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class BlokingBuffer implements Buffer {
	
	private ArrayBlockingQueue<Integer> buffer;

	public BlokingBuffer() {
		buffer = new ArrayBlockingQueue<Integer>(3);
	}

	@Override
	public void set(int value) {
		try {
			buffer.put(value);
			System.out.println("Producer");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int get() {
		
		int readValue = 0;
		
		try {
			readValue = buffer.take();
			System.out.println("Consumer");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return readValue;
	}

}

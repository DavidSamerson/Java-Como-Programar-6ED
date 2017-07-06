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
			// TODO: handle exception
		}
	}

	@Override
	public int get() {
		// TODO Auto-generated method stub
		return 0;
	}

}

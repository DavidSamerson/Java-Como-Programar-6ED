package multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CircularBuffer implements Buffer {
	
	private Lock accessLock = new ReentrantLock();
	
	private Condition canWrite = accessLock.newCondition();
	private Condition canRead = accessLock.newCondition();
	
	private int[] buffer = {-1, -1, -1};
	
	private int occupiedBuffers;
	private int writeIndex;
	private int readIndex;

	@Override
	public void set(int value) {
		
		accessLock.lock();

	}

	@Override
	public int get() {
		// TODO Auto-generated method stub
		return 0;
	}

}

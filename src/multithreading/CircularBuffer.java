package multithreading;

import java.awt.DisplayMode;
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
		
		try {
			
			while (occupiedBuffers == buffer.length) 
			{
				System.out.println("All buffers full. producer waits.\n");
				canWrite.await();
			}
			
			buffer[writeIndex] = value;
			
			writeIndex = (writeIndex + 1) % buffer.length;
			
			occupiedBuffers ++;
			
			displayState("Producer writes "+ buffer[writeIndex]);
			canRead.signal();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally{
			accessLock.unlock();
		}

	}

	@Override
	public int get() {
		
		int readValue = 0;
		accessLock.lock();
		
		try {
			
			while (occupiedBuffers == 0) {
				System.out.println("All buffers empty. Consumer waits.\n");
				canRead.await();
			}
			
			readValue = buffer[readIndex];
			
			readIndex = (readIndex + 1) % buffer.length;
			
			occupiedBuffers  --;
			displayState("Consumer Reads "+readValue);
			canWrite.signal();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			accessLock.unlock();
		}
		
		return readValue;
	}
	
	private void displayState(String string) {
		// TODO Auto-generated method stub
		
	}


}

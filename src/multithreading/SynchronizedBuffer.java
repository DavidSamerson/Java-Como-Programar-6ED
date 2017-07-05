package multithreading;

import java.awt.DisplayMode;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedBuffer implements Buffer {
	
	private Lock acessLock = new ReentrantLock();
	private Condition canWrite = acessLock.newCondition();
	private Condition canRead = acessLock.newCondition();
	private int buffer = -1;
	private boolean occupied = false;

	@Override
	public void set(int value)
	{
		
		acessLock.lock();
		
		try {
			while (occupied) {
				System.out.println("Producer tries to write");
				displayState("Buffer full, Producer waits");
				canWrite.await();
			}
			
			buffer = value;
			
			occupied = true;
			
			displayState("Producer writes " + buffer);
			
			canRead.signal();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally{
			acessLock.unlock();
		}
	}

	@Override
	public int get() {
		
		int readValue = 0;
		acessLock.lock();
		
		try {
			while (!occupied) 
			{
				System.out.println("Consumer tries to read. ");
				displayState("Buffer Empty. consumer waits");
				canRead.await();
				occupied = false;
				readValue = buffer;
				displayState("Consumer reads "+ readValue);
				canWrite.signal();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally{
			acessLock.unlock();
		}
		return 0;
	}
	

	private void displayState(String operation) {
		System.out.printf("%-40s%d\t\t%b\n\n",operation, buffer, occupied);
		
	}

}

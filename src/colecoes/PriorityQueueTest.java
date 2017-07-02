package colecoes;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {

		PriorityQueue<Double> queue = new PriorityQueue<Double>();

		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.6);
		queue.offer(8.2);

		System.out.println("Polling from queue: ");

		while (queue.size() > 0) {
			
			System.out.printf("%.1f",queue.peek());
			queue.poll();

		}

	}

}

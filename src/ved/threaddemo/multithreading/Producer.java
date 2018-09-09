/**
 * 
 */
package ved.threaddemo.multithreading;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vedbhasker.t
 *
 */
public class Producer implements Runnable {

	private final List<Integer> taskQueue;
	private final int MAX_CAPACITY;

	/**
	 * @param taskQueue
	 * @param mAX_CAPACITY
	 */
	public Producer(List<Integer> taskQueue, int mAX_CAPACITY) {
		this.taskQueue = taskQueue;
		this.MAX_CAPACITY = mAX_CAPACITY;
	}

	@Override
	public void run() {

		int counter = 0;

		while (true) {

			try {
				produce(counter++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	private void produce(int i) throws InterruptedException {

		synchronized (taskQueue) {

			// wait if the list of task is full, until notify(space freed) by other thread
			while (taskQueue.size() == MAX_CAPACITY) {
				System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: "
						+ taskQueue.size());
				taskQueue.wait();
			}

			// after every 1000 ms add value/produce item/add in list
			Thread.sleep(1000);
			taskQueue.add(i);

			System.out.println("Produced: " + i);

			// notify all thread, if in wait state
			taskQueue.notifyAll();
		}

	}

}

/**
 * 
 */
package ved.threaddemo.multithreading;

import java.util.List;

/**
 * @author vedbhasker.t
 *
 */
public class Consumer implements Runnable {

	private final List<Integer> taskQueue;

	/**
	 * @param taskQueue
	 */
	public Consumer(List<Integer> taskQueue) {
		this.taskQueue = taskQueue;
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

			// wait if the list of task is empty, until notify(space added) by other thread
			while (taskQueue.isEmpty()) {
				System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: "
						+ taskQueue.size());
				taskQueue.wait();
			}

			// after every 1000 ms consume item/remove from list
			Thread.sleep(1000);
			int consume = taskQueue.remove(0);

			System.out.println("Consumed: " + consume);

			// notify all thread, if in wait state
			taskQueue.notifyAll();
		}

	}

}

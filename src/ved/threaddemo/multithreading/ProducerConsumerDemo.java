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
public class ProducerConsumerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> taskQueue = new ArrayList<Integer>();
		int MAX_CAPACITY = 5;

		Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
		Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");
		tProducer.start();
		tConsumer.start();

	}

}

/**
 * 
 */
package dig.ved.java8.Stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author vtripath
 * 
 *         In this tutorial, we will show you few Java 8 examples to demonstrate
 *         the use of Streams filter(), collect(), findAny() and orElse()
 * 
 * @see: http://www.mkyong.com/java8/java-8-streams-filter-examples/
 *
 */
public class StreamAndFilterJava7 {

	public static void main(String[] args) {

		List<String> lines = Arrays.asList("boot", "microservice", "node");

		// access static method
		List<String> result = StreamAndFilterJava7.getFilterOutput(lines, "node");

		System.out.println("Filtering in Java-7");
		System.out.println("Filtering result:");

		for (String temp : result) {
			System.out.println(temp); // output : boot, microservice
		}

	} // ends: main()

	/**
	 * 
	 * @param lines
	 * @param filter
	 * @return
	 */
	private static List<String> getFilterOutput(List<String> lines, String filter) {

		List<String> result = new ArrayList<>();

		for (String line : lines) {
			if (!"node".equals(line)) { // we dont like: node
				result.add(line);
			}
		}
		return result;

	} // ends: getFilterOutput()

} // ends: class

/**
 * 
 */
package dig.ved.java8.Stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vtripath
 * 
 *         In this tutorial, we will show you few Java 8 examples to demonstrate
 *         the use of Streams filter(), collect(), findAny() and orElse()
 * 
 * @see: http://www.mkyong.com/java8/java-8-streams-filter-examples/
 *
 */
public class StreamAndFilterJava8 {

	public static void main(String[] args) {

		// The equivalent example in Java 8, stream.filter() to filter a List, and
		// collect() to convert a stream into a List.
		
		List<String> dataList = Arrays.asList("boot", "microservice", "node");
		
		List<String> filterResult = dataList.stream()  								// convert list to stream
											.filter(item -> !"node".equals(item))  // check for : "node"
											.collect(Collectors.toList());			// collect the output and convert streams to a List
		
		System.out.println("Filtering in Java-8");
		System.out.println("Filtering result:");
		filterResult.forEach(System.out::println);									//output : boot, microservice

	} // ends: main()

} // ends: class

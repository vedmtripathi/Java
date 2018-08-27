package dig.ved.java8.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author vedbhasker.t
 *
 */
public class ForEachExample {

	public static void main(String[] args) {
		
		ForEachExample.loopMap();
		ForEachExample.loopList();
		ForEachExample.StreamAndFiltering();

		// using method reference
		// items.forEach( (key, value) -> System.out::println("key--"+key +" :: "+
		// "value--"+value) );

	} // ends: main()
	
	private static void StreamAndFiltering() {
		
		System.out.println("###### Stream and Filtering ######");
		
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		System.out.println("Using: Stream and Filter");
		items.stream()
				.filter(value -> value.contains("B"))
				.forEach(System.out::println);
		
	} // ends: StreamAndFiltering()

	private static void loopList() {
		
		System.out.println("###### loop a List with forEach + lambda expression ######");
		
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		System.out.println("Normal List iteration:-");
		items.forEach(value -> System.out.println(value));
		
		System.out.println("\nNormal List iteration using method reference:-");
		// using method reference
		items.forEach(System.out::println);
		
		System.out.println("\ncheck condition while looping");
		// check condition while looping
		items.forEach( value -> {
			if ("B".equalsIgnoreCase(value)) {
				System.out.println("Begin");
			}
		});
		
	} // ends: loopList()
	
	private static void loopMap() {
		
		System.out.println("###### loop a Map with forEach + lambda expression ######");
		
		// loop a Map with forEach + lambda expression
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		System.out.println("Normal Map iteration:-");
		items.forEach((key, value) -> System.out.println("key--" + key + " :: " + "value--" + value));

		System.out.println("\ncheck condition while looping Map");
		// check condition while looping
		items.forEach((key, value) -> {
			if ("B".equalsIgnoreCase(key)) {
				System.out.println("Begin");
			}
		});
	} // ends: loopMap()

} // ends: class

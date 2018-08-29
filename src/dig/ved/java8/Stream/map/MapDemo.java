/**
 * 
 */
package dig.ved.java8.Stream.map;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import dig.ved.java8.model.TestData;

/**
 * @author vtripath
 * 
 *         In Java 8, stream().map() lets you convert an object to something
 *         else.
 * 
 * @see: http://www.mkyong.com/java8/java-8-streams-map-examples/
 *
 */
public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> country = Arrays.asList("india", "bharat", "hindustan", "aryawart");
		
		// convert word to: Upper case
		List<String> upperCaseList = country.stream()
												.map(item -> item.toUpperCase())
												.collect(Collectors.toList());
		
		upperCaseList.forEach(System.out::println);
		
		// using method reference
		List<String> upperCaseList2 = country.stream()
											.map(String::toUpperCase)
											.collect(Collectors.toList());
		
		System.out.println("\nusing method refernce");
		upperCaseList2.forEach(System.out::println);
		
		 // apply some login on data
		 List<Integer> num = Arrays.asList(1,2,3,4,5);
		 List<Integer> resultNumList = num.stream()
				 						.map(logic -> logic*2)
				 						.collect(Collectors.toList());
		 
		 resultNumList.forEach(System.out::println);
		 
		 // Get all the name values from a list of the TestData objects
		 List<TestData> testData = Arrays.asList(
	                new TestData("mkyong", new BigDecimal(10000), 30),
	                new TestData("jack", new BigDecimal(20000), 20),
	                new TestData("lawrence", new BigDecimal(30000), 33)
	        );
		 
		 List<String> nameList = testData.stream()
				 							.map(TestData::getName)
				 							.map(String::toUpperCase)
				 							.collect(Collectors.toList());
		 
		 System.out.println(nameList);
		 
		 // iterate collection
		 nameList.forEach(System.out::println);
		 
	}

}

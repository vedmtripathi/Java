/**
 * 
 */
package dig.ved.java8.Stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import dig.ved.java8.model.Person;

/**
 * @author vtripath
 *
 */
public class SreamFilterMapJava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
                new Person("peter", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );
		
		String result = persons.stream()
								.filter(item -> "peter".equalsIgnoreCase(item.getName()))
								.map(Person::getName)	 //convert stream to String
								.findAny()
								.orElse(null);
		
		System.out.println("result using: Stream, Filter, Map, FindAny, orElse");
		System.out.println("result--> "+result);

		
		System.out.println("\ncollect only names using: Map/Collect");
		List<String> nameList = persons.stream()
										.map(Person::getName)
										.collect(Collectors.toList());
		
		nameList.forEach(System.out::println);
	}
}

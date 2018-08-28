/**
 * 
 */
package dig.ved.java8.Stream.filter;

import java.util.Arrays;
import java.util.List;

import dig.ved.java8.model.Person;

/**
 * @author vtripath
 *
 */
public class FilterFindElseDemoJava8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
	                new Person("peter", 30),
	                new Person("jack", 20),
	                new Person("lawrence", 40)
	        );
		
		// Case:1- with single condition
		Person result1 = persons.stream()													 // Convert to steam
								.filter(item -> "peter".equalsIgnoreCase(item.getName()))	 // we want "peter" only	
								.findAny()													 // If 'findAny' then return found	
								.orElse(null);												 // If not found, return null				
					
		System.out.println("using java 8");
        System.out.println(result1);
        
		// Case:2- with multiple condition with single Lambda condition
        Person result2 = persons.stream()
        						.filter(item -> "jack".equalsIgnoreCase(item.getName())
        												&& 20 == item.getAge())
        						.findAny()
        						.orElse(null);
        
        System.out.println("using java 8 with single Lambda condition");
        System.out.println(result2);
        
        // Case:3- with multiple condition with if condition
        Person result3 = persons.stream()
        						.filter(item -> {
        							if ("lawrence".equalsIgnoreCase(item.getName())
        												&& 40 == item.getAge()) {
										return true;
									}
        							return false;
        						})
        						.findAny()
        						.orElse(null);
        
        System.out.println("using java 8 with if condition");
        System.out.println(result3);
	}
}

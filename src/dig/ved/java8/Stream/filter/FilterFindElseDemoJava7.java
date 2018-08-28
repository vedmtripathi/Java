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
public class FilterFindElseDemoJava7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
	                new Person("peter", 30),
	                new Person("jack", 20),
	                new Person("lawrence", 40)
	        );
		
		Person result = getResult(persons, "jack");
        System.out.println(result);

	}
	
	/**
	 * 
	 * @return
	 */
	private static Person getResult(List<Person> list, String filterKey) {
		
		Person tmpObj = null;
		for (Person tmp : list) {
			
			if (filterKey.equalsIgnoreCase(tmp.getName())) {
				tmpObj = tmp;
			}
		}
		
		return tmpObj;
		
	}
}

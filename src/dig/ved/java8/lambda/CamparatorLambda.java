/**
 * 
 */
package dig.ved.java8.lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import dig.ved.java8.model.TestData;

/**
 * @author vedbhasker.t
 * 
 *         sorting with Lambda
 *
 */
public class CamparatorLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<TestData> listTestData = getTestData();

		System.out.println("Before Sort");

		for (TestData testData : listTestData) {
			System.out.println("testData--> " + testData);
		}
		
		System.out.println("After Sort");
		
		//lambda here!
		listTestData.sort((TestData test1, TestData test2)-> test1.getAge() - test2.getAge());
		
		//java 8 only, lambda also, to print the List
		listTestData.forEach(testdata-> System.out.println(testdata));

	} // ends: main()

	/**
	 * 
	 * @return
	 */
	private static List<TestData> getTestData() {

		List<TestData> result = new ArrayList<TestData>();

		result.add(new TestData("alvis", new BigDecimal("70000"), 33));
		result.add(new TestData("peter", new BigDecimal("80000"), 20));
		result.add(new TestData("jhon", new BigDecimal("100000"), 10));
		result.add(new TestData("iris", new BigDecimal("170000"), 55));

		return result;
	} // ends: getTestData()

} // ends: class

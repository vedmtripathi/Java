package dig.ved.java8.model;

import java.math.BigDecimal;

public class TestData {

	private String name;
	private BigDecimal salary;
	private int age;

	public TestData(String name, BigDecimal bigDecimal, int intValue) {
		this.name = name;
		this.salary = bigDecimal;
		this.age = intValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "TestData [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

} // ends: class

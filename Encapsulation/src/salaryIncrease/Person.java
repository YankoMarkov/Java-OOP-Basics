package salaryIncrease;

import java.text.DecimalFormat;

class Person {
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	
	public Person(String firstName, String lastName, int age, double salary) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
		this.setSalary(salary);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	private void setAge(int age) {
		if (age < 1) {
			throw new IllegalArgumentException("Age cannot be zero or negative integer");
		}
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	private void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double bonus) {
		if (this.getAge() < 30) {
			bonus /= 2;
		}
		this.salary += this.getSalary() * bonus / 100;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s gets %s leva", this.getFirstName(), this.getLastName(), this.getSalary());
	}
}

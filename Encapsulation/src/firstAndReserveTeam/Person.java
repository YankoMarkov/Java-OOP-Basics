package firstAndReserveTeam;

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
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	private void setSalary(double salary) {
		this.salary = salary;
	}
}

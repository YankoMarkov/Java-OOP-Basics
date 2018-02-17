package companyRoster;

class Employee {
	private static final String DEFAULT_EMAIL = "n/a";
	private static final int DEFAULT_AGE = -1;
	
	private String name;
	private double salary;
	private String position;
	private String department;
	private String email;
	private int age;
	
	public Employee(String name, double salary, String position, String department, String email, int age) {
		this.setName(name);
		this.setSalary(salary);
		this.setPosition(position);
		this.setDepartment(department);
		this.setEmail(email);
		this.setAge(age);
	}
	
	public Employee(String name, double salary, String position, String department) {
		this(name, salary, position, department, DEFAULT_EMAIL, DEFAULT_AGE);
	}
	
	public Employee(String name, double salary, String position, String department, String email) {
		this(name, salary, position, department, email, DEFAULT_AGE);
	}
	
	public Employee(String name, double salary, String position, String department, int age) {
		this(name, salary, position, department, DEFAULT_EMAIL, age);
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	private void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	private void setPosition(String position) {
		this.position = position;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	private void setDepartment(String department) {
		this.department = department;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	private void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		return this.age;
	}
	
	private void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %.2f %s %d", this.getName(), this.getSalary(), this.getEmail(), this.getAge());
	}
}
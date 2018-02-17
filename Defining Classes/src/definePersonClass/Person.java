package definePersonClass;

import java.util.ArrayList;
import java.util.List;

class Person {
	
	private String name;
	private int age;
	private List<BankAccount> accounts;
	
	public Person(String name, int age) {
		this(name, age, new ArrayList<>());
	}
	
	public Person(String name, int age, List<BankAccount> accounts) {
		this.setName(name);
		this.setAge(age);
		this.accounts = new ArrayList<>();
	}
	
	public List<BankAccount> getAccounts() {
		return accounts;
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	private void setAge(int age) {
		this.age = age;
	}
	
	public double getBalance() {
		return this.getAccounts().stream().mapToDouble(BankAccount::getBalance).sum();
	}
}

package shoppingSpree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Person {
	private String name;
	private int money;
	private List<Product> products;
	
	public Person(String name, int money) {
		this.setName(name);
		this.setMoney(money);
		this.setProducts(new ArrayList<>());
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		if (name.trim().length() < 1 || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	
	private void setMoney(int money) {
		if (money < 0) {
			throw new IllegalArgumentException("Money cannot be negative");
		}
		this.money = money;
	}
	
	public List<Product> getProducts() {
		return Collections.unmodifiableList(this.products);
	}
	
	private void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public void addProducts(Product product) {
		if (this.getMoney() >= product.getPrice()) {
			this.products.add(product);
			this.setMoney(this.getMoney() - product.getPrice());
			System.out.printf("%s bought %s%n", this.getName(), product.getName());
		} else {
			System.out.printf("%s can't afford %s%n", this.getName(), product.getName());
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s", Arrays.toString(this.getProducts().toArray()).replaceAll("[\\[\\]]", ""));
	}
}

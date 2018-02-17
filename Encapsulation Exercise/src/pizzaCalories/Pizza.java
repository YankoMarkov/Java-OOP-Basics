package pizzaCalories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Pizza {
	private String name;
	private int number;
	private Dough dough;
	private List<Toppings> toppings;
	
	public Pizza(String name, int number) {
		this.setName(name);
		this.setNumber(number);
		this.setToppings(new ArrayList<>());
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		if (name.length() < 1 || name.length() > 15) {
			throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
		}
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	private void setNumber(int number) {
		if (number < 0 || number > 10) {
			throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
		}
		this.number = number;
	}
	
	public Dough getDough() {
		return this.dough;
	}
	
	private void setDough(Dough dough) {
		this.dough = dough;
	}
	
	public List<Toppings> getToppings() {
		return Collections.unmodifiableList(this.toppings);
	}
	
	private void setToppings(List<Toppings> toppings) {
		this.toppings = toppings;
	}
	
	public void addDough(Dough dough) {
		this.setDough(dough);
	}
	
	public void addToppings(Toppings toppings) {
		this.toppings.add(toppings);
	}
	
	public double calculateCalories() {
		double calories = 0;
		for (Toppings toppings1 : this.getToppings()) {
			calories += toppings1.calculatesToppingCalories();
		}
		calories += this.getDough().calculatesDoughCalories();
		return calories;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %.2f", this.getName(), calculateCalories());
	}
}

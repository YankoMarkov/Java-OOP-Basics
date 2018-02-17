package pizzaCalories;

import java.util.Arrays;
import java.util.List;

class Toppings {
	private final List<String> TYPES_TOPPING = Arrays.asList("meat", "veggies", "cheese", "sauce");
	private String type;
	private double weight;
	
	public Toppings(String type, double weight) {
		this.setType(type);
		this.setWeight(weight);
	}
	
	public String getType() {
		return this.type;
	}
	
	private void setType(String type) {
		if (!TYPES_TOPPING.contains(type.toLowerCase())) {
			throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", type));
		}
		this.type = type;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	private void setWeight(double weight) {
		if (weight < 1 || weight > 50) {
			throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.getType()));
		}
		this.weight = weight;
	}
	
	public double calculatesToppingCalories() {
		switch (this.getType().toLowerCase()) {
			case "meat":
				return 2 * 1.2 * this.getWeight();
			case "veggies":
				return 2 * 0.8 * this.getWeight();
			case "cheese":
				return 2 * 1.1 * this.getWeight();
			case "sauce":
				return 2 * 0.9 * this.getWeight();
			default:
				return 0.0;
		}
	}
}

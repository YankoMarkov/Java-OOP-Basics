package pizzaCalories;

import java.util.Arrays;
import java.util.List;

class Dough {
	private final List<String> TYPES_FLOUR = Arrays.asList("white", "wholegrain");
	private final List<String> TYPES_BAKING = Arrays.asList("crispy", "chewy", "homemade");
	private String type;
	private String bakingTechnique;
	private double weight;
	
	public Dough(String type, String bakingTechnique, int weight) {
		this.setType(type);
		this.setBakingTechnique(bakingTechnique);
		this.setWeight(weight);
	}
	
	public String getType() {
		return this.type;
	}
	
	private void setType(String type) {
		if (!TYPES_FLOUR.contains(type.toLowerCase())) {
			throw new IllegalArgumentException("Invalid type of dough.");
		}
		this.type = type;
	}
	
	public String getBakingTechnique() {
		return bakingTechnique;
	}
	
	private void setBakingTechnique(String bakingTechnique) {
		if (!TYPES_BAKING.contains(bakingTechnique.toLowerCase())) {
			throw new IllegalArgumentException("Invalid type of dough.");
		}
		this.bakingTechnique = bakingTechnique;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	private void setWeight(double weight) {
		if (weight < 1 || weight > 200) {
			throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
		}
		this.weight = weight;
	}
	
	public double calculatesDoughCalories() {
		double doughCalories = this.getWeight() * 2;
		switch (this.getType().toLowerCase()) {
			case "white":
				doughCalories *= 1.5;
				break;
			case "wholegrain":
				doughCalories *= 1.0;
				break;
		}
		switch (this.getBakingTechnique().toLowerCase()) {
			case "crispy":
				doughCalories *= 0.9;
				break;
			case "chewy":
				doughCalories *= 1.1;
				break;
			case "homemade":
				doughCalories *= 1.0;
				break;
		}
		return doughCalories;
	}
}

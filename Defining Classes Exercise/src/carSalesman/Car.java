package carSalesman;

class Car {
	private String model;
	private Engine engine;
	private int weight;
	private String color;
	
	public Car(String model, Engine engine, int weight, String color) {
		this.setModel(model);
		this.setEngine(engine);
		this.setWeight(weight);
		this.setColor(color);
	}
	
	public Car(String model, Engine engine) {
		this(model, engine, 0, null);
	}
	
	public Car(String model, Engine engine, int weight) {
		this(model, engine, weight, null);
	}
	
	public Car(String model, Engine engine, String color) {
		this(model, engine, 0, color);
	}
	
	public String getModel() {
		return this.model;
	}
	
	private void setModel(String model) {
		this.model = model;
	}
	
	public Engine getEngine() {
		return this.engine;
	}
	
	private void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	private void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getColor() {
		return this.color;
	}
	
	private void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return String.format("%s:%n  %s:%n    Power: %d%n    Displacement: %s%n    Efficiency: %s%n  Weight: %s%n  Color: %s",
				this.getModel(),
				this.getEngine().getModel(),
				this.getEngine().getPower(),
				this.getEngine().getDisplacement() == 0 ? "n/a" : this.getEngine().getDisplacement(),
				this.getEngine().getEfficiency() == null ? "n/a" : this.getEngine().getEfficiency(),
				this.getWeight() == 0 ? "n/a" : this.getWeight(),
				this.getColor() == null ? "n/a" : this.getColor());
	}
}

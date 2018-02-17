package speedRacing;

class Car {
	private String model;
	private double fuelAmount;
	private double fuelCost;
	private int distance;
	
	public Car(String model, double fuelAmount, double fuelCost) {
		this.setModel(model);
		this.setFuelAmount(fuelAmount);
		this.setFuelCost(fuelCost);
	}
	
	public String getModel() {
		return this.model;
	}
	
	private void setModel(String model) {
		this.model = model;
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}
	
	private void setFuelAmount(double fuelAmount) {
		this.fuelAmount = fuelAmount;
	}
	
	public double getFuelCost() {
		return this.fuelCost;
	}
	
	private void setFuelCost(double fuelCost) {
		this.fuelCost = fuelCost;
	}
	
	public int getDistance() {
		return this.distance;
	}
	
	private void setDistance(int distance) {
		this.distance = distance;
	}
	
	public void carMoveDistance(int distance) {
		double fuelNeed = distance * this.getFuelCost();
		if (this.getFuelAmount() >= fuelNeed) {
			this.setFuelAmount(this.getFuelAmount() - fuelNeed);
			this.setDistance(this.getDistance() + distance);
		} else {
			System.out.println("Insufficient fuel for the drive");
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s %.2f %d", this.getModel(), this.getFuelAmount(), this.getDistance());
	}
}

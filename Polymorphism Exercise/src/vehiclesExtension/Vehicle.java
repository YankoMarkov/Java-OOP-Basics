package vehiclesExtension;

abstract class Vehicle {
	private final double CONSUMPTION = this.getClass().getSimpleName().equals("Truck") ? 1.6 : 0.9;
	private double tankCapacity;
	private double fuelQuantity;
	private double fuelConsumption;
	
	public Vehicle(double tankCapacity, double fuelQuantity, double fuelConsumption) {
		this.setTankCapacity(tankCapacity);
		this.setFuelQuantity(fuelQuantity);
		this.setFuelConsumption(fuelConsumption);
	}
	
	public double getFuelQuantity() {
		return this.fuelQuantity;
	}
	
	protected void setFuelQuantity(double fuelQuantity) {
		if (fuelQuantity < 0) {
			throw new IllegalArgumentException("Fuel must be a positive number");
		}
		if (fuelQuantity + this.getFuelQuantity() > this.getTankCapacity()) {
			throw new IllegalArgumentException("Cannot fit fuel in tank");
		}
		this.fuelQuantity = fuelQuantity;
	}
	
	public double getFuelConsumption() {
		return this.fuelConsumption;
	}
	
	private void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	
	public double getTankCapacity() {
		return this.tankCapacity;
	}
	
	private void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	
	void drive(double kilometers) {
		double busConsumption = 1.4;
		double increaseConsumption = this.getClass().getSimpleName().equals("Bus") ? busConsumption : this.CONSUMPTION;
		double consumption = kilometers * (this.getFuelConsumption() + increaseConsumption);
		if (consumption > this.getFuelQuantity()) {
			throw new IllegalArgumentException(this.getClass().getSimpleName() + " needs refueling");
		}
		this.setFuelQuantity(this.getFuelQuantity() - consumption);
	}
	
	void refuel(double liters) {
		if (liters <= 0) {
			throw new IllegalArgumentException("Fuel must be a positive number");
		}
		final double finalLiters = this.getClass().getSimpleName().equals("Truck") ? liters -= liters * 0.05 : liters;
		this.setFuelQuantity(this.getFuelQuantity() + finalLiters);
	}
	
	@Override
	public String toString() {
		return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
	}
}

package vehiclesExtension;

class Bus extends Vehicle {
	
	public Bus(double tankCapacity, double fuelQuantity, double fuelConsumption) {
		super(tankCapacity, fuelQuantity, fuelConsumption);
	}
	
	public void driveEmpty(double kilometers) {
		double consumption = kilometers * (this.getFuelConsumption());
		if (consumption > this.getFuelQuantity()) {
			throw new IllegalArgumentException(this.getClass().getSimpleName() + " needs refueling");
		}
		this.setFuelQuantity(this.getFuelQuantity() - consumption);
	}
}

package rawData;

import java.util.List;

class Car {
	private String model;
	private Engine engine;
	private Cargo cargo;
	private List<Tire> tires;
	
	public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
		this.setModel(model);
		this.setEngine(engine);
		this.setCargo(cargo);
		this.setTires(tires);
	}
	
	public String getModel() {
		return model;
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
	
	public Cargo getCargo() {
		return this.cargo;
	}
	
	private void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public List<Tire> getTires() {
		return this.tires;
	}
	
	private void setTires(List<Tire> tires) {
		this.tires = tires;
	}
	
	@Override
	public String toString() {
		return this.getModel();
	}
}

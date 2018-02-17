package rawData;

class Tire {
	private double pressure;
	private int age;
	
	public Tire(double presure, int age) {
		this.setPressure(presure);
		this.setAge(age);
	}
	
	public double getPressure() {
		return this.pressure;
	}
	
	private void setPressure(double pressure) {
		this.pressure = pressure;
	}
	
	public int getAge() {
		return this.age;
	}
	
	private void setAge(int age) {
		this.age = age;
	}
}

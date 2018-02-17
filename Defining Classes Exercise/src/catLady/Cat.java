package catLady;

class Cat {
	private String name;
	private double earSize;
	private double furLength;
	private double decibelsOfMeows;
	
	public Cat(String name, double earSize, double furLength, double decibelsOfMeows) {
		this.setName(name);
		this.setEarSize(earSize);
		this.setFurLength(furLength);
		this.setDecibelsOfMeows(decibelsOfMeows);
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public double getEarSize() {
		return this.earSize;
	}
	
	private void setEarSize(double earSize) {
		this.earSize = earSize;
	}
	
	public double getFurLength() {
		return this.furLength;
	}
	
	private void setFurLength(double furLength) {
		this.furLength = furLength;
	}
	
	public double getDecibelsOfMeows() {
		return this.decibelsOfMeows;
	}
	
	private void setDecibelsOfMeows(double decibelsOfMeows) {
		this.decibelsOfMeows = decibelsOfMeows;
	}
}

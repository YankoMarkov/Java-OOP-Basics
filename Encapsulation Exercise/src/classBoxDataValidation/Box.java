package classBoxDataValidation;

class Box {
	private double length;
	private double width;
	private double height;
	
	public Box(double length, double width, double height) {
		this.setLength(length);
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public double getLength() {
		return length;
	}
	
	private void setLength(double length) {
		if (length < 1) {
			throw new IllegalArgumentException("Length cannot be zero or negative.");
		}
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	private void setWidth(double width) {
		if (width < 1) {
			throw new IllegalArgumentException("Width cannot be zero or negative.");
		}
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	private void setHeight(double height) {
		if (height < 1) {
			throw new IllegalArgumentException("Height cannot be zero or negative.");
		}
		this.height = height;
	}
	
	public double getSurfaceArea() {
		return (2 * this.getLength() * this.getWidth()) + (2 * this.getLength() * this.getHeight()) + (2 * this.getWidth() * this.getHeight());
	}
	
	public double getLateralSurfaceArea() {
		return (2 * this.getLength() * this.getHeight()) + (2 * this.getWidth() * this.getHeight());
	}
	
	public double getVolume() {
		return this.getLength() * this.getWidth() * this.getHeight();
	}
}

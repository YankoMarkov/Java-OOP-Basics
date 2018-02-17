package shapes;

abstract class Shape {
	private double perimeter;
	private double area;
	
	public double getPerimeter() {
		return this.perimeter;
	}
	
	private void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public double getArea() {
		return this.area;
	}
	
	private void setArea(double area) {
		this.area = area;
	}
	
	public abstract double calculatePerimeter();
	
	public abstract double calculateArea();
}

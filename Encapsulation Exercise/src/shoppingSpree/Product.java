package shoppingSpree;

class Product {
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		if (name.trim().length() < 1 || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	private void setPrice(int price) {
		if (price < 0) {
			throw new IllegalArgumentException("Money cannot be negative");
		}
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}

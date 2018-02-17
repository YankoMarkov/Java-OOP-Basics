package animalFarm;

class Chicken {
	private String name;
	private int age;
	
	public Chicken(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	private String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		if (name.trim().length() < 1 || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty.");
		}
		this.name = name;
	}
	
	private int getAge() {
		return this.age;
	}
	
	private void setAge(int age) {
		if (age < 0 || age > 15) {
			throw new IllegalArgumentException("Age should be between 0 and 15.");
		}
		this.age = age;
	}
	
	public void producingEggs() {
		if (this.getAge() >= 0 && this.getAge() < 6) {
			System.out.printf("Chicken %s (age %d) can produce 2 eggs per day.", this.getName(), this.getAge());
		} else if (this.getAge() >= 6 && this.getAge() < 12) {
			System.out.printf("Chicken %s (age %d) can produce 1 eggs per day.", this.getName(), this.getAge());
		} else {
			System.out.printf("Chicken %s (age %d) can produce 0.75 eggs per day.", this.getName(), this.getAge());
		}
	}
}

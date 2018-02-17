package animals;

abstract class Animal implements SoundProducible {
	private String name;
	private int age;
	private String gender;
	
	public Animal(String name, int age, String gender) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		if (name.trim().length() < 1 || name.isEmpty()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	private void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Invalid input!");
		}
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	
	private void setGender(String gender) {
		if (gender.trim().length() < 1 || gender.isEmpty()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(this.getClass().getSimpleName()).append("\n");
		result.append(String.format("%s %s %s", this.getName(), this.getAge(), this.getGender()));
		return result.toString();
	}
}

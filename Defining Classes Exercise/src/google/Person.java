package google;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;
	private Company company;
	private Car car;
	private List<Pokemon> pokemon;
	private List<Parent> parent;
	private List<Child> child;
	
	public Person(String name) {
		this.setName(name);
		this.setPokemon(new ArrayList<>());
		this.setParent(new ArrayList<>());
		this.setChild(new ArrayList<>());
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public Company getCompany() {
		return this.company;
	}
	
	private void setCompany(Company company) {
		this.company = company;
	}
	
	public Car getCar() {
		return this.car;
	}
	
	private void setCar(Car car) {
		this.car = car;
	}
	
	public List<Pokemon> getPokemon() {
		return this.pokemon;
	}
	
	private void setPokemon(List<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}
	
	public List<Parent> getParent() {
		return this.parent;
	}
	
	private void setParent(List<Parent> parent) {
		this.parent = parent;
	}
	
	public List<Child> getChild() {
		return this.child;
	}
	
	private void setChild(List<Child> child) {
		this.child = child;
	}
	
	public void addCompany(Company company) {
		this.setCompany(company);
	}
	
	public void addCar(Car car) {
		this.setCar(car);
	}
	
	public void addPokemons(Pokemon pokemon) {
		this.pokemon.add(pokemon);
	}
	
	public void addParents(Parent parent) {
		this.parent.add(parent);
	}
	
	public void addChildren(Child child) {
		this.child.add(child);
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(this.getName()).append("\n");
		result.append("Company:").append(System.lineSeparator());
		if (this.getCompany() != null) {
			result.append(this.getCompany()).append("\n");
		}
		result.append("Car:").append("\n");
		if (this.getCar() != null) {
			result.append(this.getCar()).append("\n");
		}
		result.append("Pokemon:").append("\n");
		for (Pokemon pokemon1 : this.getPokemon()) {
			result.append(pokemon1).append("\n");
		}
		result.append("Parents:").append("\n");
		for (Parent parent1 : this.getParent()) {
			result.append(parent1).append("\n");
		}
		result.append("Children:").append("\n");
		for (Child child1 : this.getChild()) {
			result.append(child1).append("\n");
		}
		return result.toString();
	}
}

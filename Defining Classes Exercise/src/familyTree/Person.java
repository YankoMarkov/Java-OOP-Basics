package familyTree;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;
	private String birthday;
	private List<Person> parents;
	private List<Person> children;
	
	public Person(String name, String birthday) {
		this.setName(name);
		this.setBirthday(birthday);
		this.setParents(new ArrayList<>());
		this.setChildren(new ArrayList<>());
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return this.birthday;
	}
	
	private void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public List<Person> getParents() {
		return this.parents;
	}
	
	private void setParents(List<Person> parents) {
		this.parents = parents;
	}
	
	public List<Person> getChildren() {
		return this.children;
	}
	
	private void setChildren(List<Person> children) {
		this.children = children;
	}
	
	public void addParent(Person person) {
		this.parents.add(person);
	}
	
	public void addChild(Person person) {
		this.children.add(person);
	}
	
	public void addName(String name) {
		this.setName(name);
	}
	
	public void addBirthday(String birthday) {
		this.setBirthday(birthday);
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(String.format("%s %s", this.getName(), this.getBirthday())).append("\n");
		result.append("Parents:").append("\n");
		for (Person person : this.getParents()) {
			result.append(String.format("%s %s", person.getName(), person.getBirthday())).append("\n");
		}
		result.append("Children:").append("\n");
		for (Person person : this.getChildren()) {
			result.append(String.format("%s %s", person.getName(), person.getBirthday())).append("\n");
		}
		return result.toString();
	}
}

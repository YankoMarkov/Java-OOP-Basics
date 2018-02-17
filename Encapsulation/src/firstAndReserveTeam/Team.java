package firstAndReserveTeam;

import javafx.beans.binding.StringBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Team {
	private String name;
	private List<Person> firstTeam;
	private List<Person> reserveTeam;
	
	public Team(String name) {
		this.setName(name);
		this.firstTeam = new ArrayList<>();
		this.reserveTeam = new ArrayList<>();
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public List<Person> getFirstTeam() {
		return Collections.unmodifiableList(this.firstTeam);
	}
	
	public List<Person> getReserveTeam() {
		return Collections.unmodifiableList(this.reserveTeam);
	}
	
	public void addPlayer(Person person) {
		if (person.getAge() < 40) {
			this.firstTeam.add(person);
		} else {
			this.reserveTeam.add(person);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(String.format("First team have %d players", this.getFirstTeam().size())).append("\n");
		result.append(String.format("Reserve team have %d players", this.getReserveTeam().size())).append("\n");
		return result.toString();
	}
}

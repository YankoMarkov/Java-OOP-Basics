package footballTeamGenerator;

import java.util.*;

class Team {
	private String name;
	private double rating;
	private List<Player> teams;
	
	public Team(String name) {
		this.setName(name);
		this.setTeams(new ArrayList<>());
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		if (name.trim().length() < 1 || name.isEmpty()) {
			throw new IllegalArgumentException("A name should not be empty.");
		}
		this.name = name;
	}
	
	public double getRating() {
		return this.rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public List<Player> getTeams() {
		return Collections.unmodifiableList(this.teams);
	}
	
	private void setTeams(List<Player> teams) {
		this.teams = teams;
	}
	
	public void addPlayer(Player player) {
		this.teams.add(player);
	}
	
	public void removePlayer(String player) {
		int index = -1;
		for (int i = 0; i < this.teams.size(); i++) {
			if (this.teams.get(i).getName().equals(player)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			throw new IllegalArgumentException(String.format("Player %s is not in %s team.", player, name));
		}
		this.teams.remove(index);
	}
	
	public void addRating() {
		double rating = 0;
		for (Player player : this.teams) {
			rating += player.getSkill();
		}
		if (this.teams.size() > 0) {
			this.setRating(rating / this.teams.size());
		} else {
			this.setRating(rating);
		}
	}
	
	@Override
	public String toString() {
		return this.getName() + " - " + Math.round(this.getRating());
	}
}

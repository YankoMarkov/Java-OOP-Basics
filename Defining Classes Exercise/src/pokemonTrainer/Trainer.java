package pokemonTrainer;

import java.util.ArrayList;
import java.util.List;

class Trainer {
	private String name;
	private int numberOfBadges;
	private List<Pokemon> pokemons;
	
	public Trainer(String name) {
		this.setName(name);
		this.setPokemons(new ArrayList<>());
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfBadges() {
		return this.numberOfBadges;
	}
	
	private void setNumberOfBadges(int numberOfBadges) {
		this.numberOfBadges = numberOfBadges;
	}
	
	public List<Pokemon> getPokemons() {
		return this.pokemons;
	}
	
	private void setPokemons(List<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
	
	public void addPokemon(Pokemon pokemon) {
		this.pokemons.add(pokemon);
	}
	
	public void decreasePokemonHealth() {
		for (int i = 0; i < this.pokemons.size(); i++) {
			Pokemon pokemon = this.pokemons.get(i);
			pokemon.loseHealth();
			if (pokemon.getHealth() <= 0) {
				this.pokemons.remove(i);
			}
		}
	}
	
	public void increaseNumberOfBadges() {
		this.numberOfBadges++;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d %d", this.getName(), this.getNumberOfBadges(), this.getPokemons().size());
	}
}

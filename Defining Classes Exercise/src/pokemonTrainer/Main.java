package pokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Trainer> trainers = new LinkedHashMap<>();
		String inputs;
		
		while (!(inputs = read.readLine()).equals("Tournament")) {
			String[] input = inputs.split("\\s+");
			String trainerName = input[0];
			String pokemonName = input[1];
			String pokemonElement = input[2];
			int pokemonHealth = Integer.valueOf(input[3]);
			
			Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
			Trainer trainer = null;
			
			if (!trainers.containsKey(trainerName)) {
				trainers.put(trainerName, new Trainer(trainerName));
			}
			trainer = trainers.get(trainerName);
			trainer.addPokemon(pokemon);
			
		}
		String commands;
		
		while (!(commands = read.readLine()).equals("End")) {
			final String command = commands;
			for (Trainer trainer : trainers.values()) {
				if (trainer.getPokemons().stream().anyMatch(a -> a.getElement().equals(command))) {
					trainer.increaseNumberOfBadges();
				} else {
					trainer.decreasePokemonHealth();
				}
			}
		}
		trainers.values().stream()
				.sorted((a, b) -> Integer.compare(b.getNumberOfBadges(), a.getNumberOfBadges()))
				.forEach(System.out::println);
	}
}

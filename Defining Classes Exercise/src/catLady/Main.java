package catLady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Map<String, List<Cat>> cats = new HashMap<>();
		String inputs;
		
		while (!(inputs = read.readLine()).equals("End")) {
			String[] input = inputs.split("\\s+");
			String name = input[1];
			Cat cat = null;
			
			switch (input[0]) {
				case "Siamese":
					double earSize = Double.valueOf(input[2]);
					cat = new Cat(name, earSize, 0, 0);
					if (!cats.containsKey(input[0])) {
						cats.put(input[0], new ArrayList<>());
					}
					cats.get(input[0]).add(cat);
					break;
				case "Cymric":
					double furLength = Double.valueOf(input[2]);
					cat = new Cat(name, 0, furLength, 0);
					if (!cats.containsKey(input[0])) {
						cats.put(input[0], new ArrayList<>());
					}
					cats.get(input[0]).add(cat);
					break;
				case "StreetExtraordinaire":
					double decibelsOfMeows = Double.valueOf(input[2]);
					cat = new Cat(name, 0, 0, decibelsOfMeows);
					if (!cats.containsKey(input[0])) {
						cats.put(input[0], new ArrayList<>());
					}
					cats.get(input[0]).add(cat);
					break;
			}
		}
		String catName = read.readLine();
		for (Map.Entry<String, List<Cat>> catBreed : cats.entrySet()) {
			for (Cat cat : catBreed.getValue()) {
				if (cat.getName().equals(catName)) {
					
					switch (catBreed.getKey()) {
						case "Siamese":
							System.out.printf("%s %s %.2f", catBreed.getKey(), cat.getName(), cat.getEarSize());
							break;
						case "Cymric":
							System.out.printf("%s %s %.2f", catBreed.getKey(), cat.getName(), cat.getFurLength());
							break;
						case "StreetExtraordinaire":
							System.out.printf("%s %s %.2f", catBreed.getKey(), cat.getName(), cat.getDecibelsOfMeows());
							break;
					}
				}
			}
			
		}
	}
}

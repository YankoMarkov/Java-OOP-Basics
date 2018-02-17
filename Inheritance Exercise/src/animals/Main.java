package animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String inputs;
		
		while (!(inputs = read.readLine()).equals("Beast!")) {
			String[] input = read.readLine().split("\\s+");
			
			Animal animal = null;
			try {
				switch (inputs) {
					case "Frog":
						animal = tryCreateFrog(input);
						break;
					case "Dog":
						animal = tryCreateDog(input);
						break;
					case "Cat":
						animal = tryCreateCat(input);
						break;
					case "Kitten":
						animal = tryCreateKitten(input);
						break;
					case "Tomcat":
						animal = tryCreateTomcat(input);
						break;
					default:
						throw new IllegalArgumentException("Invalid input!");
				}
				if (animal != null) {
					System.out.println(animal);
					System.out.println(animal.produceSound());
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static Animal tryCreateTomcat(String[] input) {
		String name = input[0];
		int age = Integer.valueOf(input[1]);
		String gender = input[2];
		return new Tomcat(name, age, gender);
	}
	
	private static Animal tryCreateKitten(String[] input) {
		String name = input[0];
		int age = Integer.valueOf(input[1]);
		String gender = input[2];
		return new Kitten(name, age, gender);
	}
	
	private static Animal tryCreateCat(String[] input) {
		String name = input[0];
		int age = Integer.valueOf(input[1]);
		String gender = input[2];
		return new Cat(name, age, gender);
	}
	
	private static Animal tryCreateDog(String[] input) {
		String name = input[0];
		int age = Integer.valueOf(input[1]);
		String gender = input[2];
		return new Dog(name, age, gender);
	}
	
	private static Animal tryCreateFrog(String[] input) {
		String name = input[0];
		int age = Integer.valueOf(input[1]);
		String gender = input[2];
		return new Frog(name, age, gender);
	}
}

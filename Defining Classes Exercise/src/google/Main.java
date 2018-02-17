package google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Person> people = new HashMap<>();
		String inputs;
		
		while (!(inputs = read.readLine()).equalsIgnoreCase("end")) {
			String[] input = inputs.split("\\s+");
			String name = input[0];
			Person person = null;
			
			if (!people.containsKey(name)) {
				people.put(name, new Person(name));
			}
			person = people.get(name);
			
			switch (input[1]) {
				case "company":
					addCompany(input, person);
					break;
				case "car":
					addCar(input, person);
					break;
				case "pokemon":
					addPokemons(input, person);
					break;
				case "parents":
					addParents(input, person);
					break;
				case "children":
					addChildren(input, person);
					break;
			}
		}
		String command = read.readLine();
		
		people.entrySet().stream()
				.filter(a -> a.getKey().equals(command))
				.forEach(s -> System.out.println(s.getValue()));
	}
	
	private static void addChildren(String[] input, Person person) {
		String name = input[2];
		String birthday = input[3];
		Child child = new Child(name, birthday);
		person.addChildren(child);
	}
	
	private static void addParents(String[] input, Person person) {
		String name = input[2];
		String birthday = input[3];
		Parent parent = new Parent(name, birthday);
		person.addParents(parent);
	}
	
	private static void addPokemons(String[] input, Person person) {
		String name = input[2];
		String type = input[3];
		Pokemon pokemon = new Pokemon(name, type);
		person.addPokemons(pokemon);
	}
	
	private static void addCar(String[] input, Person person) {
		String model = input[2];
		int speed = Integer.valueOf(input[3]);
		Car car = new Car(model, speed);
		person.addCar(car);
	}
	
	private static void addCompany(String[] input, Person person) {
		String name = input[2];
		String department = input[3];
		double salary = Double.valueOf(input[4]);
		Company company = new Company(name, department, salary);
		person.addCompany(company);
	}
}

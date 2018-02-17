package validationData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(read.readLine());
		List<Person> persons = new ArrayList<>();
		
		for (int i = 0; i < num; i++) {
			String[] input = read.readLine().split("\\s+");
			String firstName = input[0];
			String lastName = input[1];
			int age = Integer.valueOf(input[2]);
			double salary = Double.valueOf(input[3]);
			try {
				persons.add(new Person(firstName, lastName, age, salary));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		double bonus = Double.valueOf(read.readLine());
		for (Person person : persons) {
			person.increaseSalary(bonus);
			System.out.println(person.toString());
		}
	}
}

package opinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(read.readLine());
		List<Person> persons = new ArrayList<>();
		
		for (int i = 0; i < num; i++) {
			String[] input = read.readLine().split("\\s+");
			Person person = new Person(input[0], Integer.valueOf(input[1]));
			persons.add(person);
		}
		persons.stream()
				.filter(a -> a.getAge() > 30)
				.sorted(Comparator.comparing(Person::getName))
				.forEach(s -> System.out.printf("%s - %d%n", s.getName(), s.getAge()));
	}
}

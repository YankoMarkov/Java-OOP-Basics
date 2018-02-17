package familyTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String givenData = read.readLine();
		List<Person> fullDataPerson = new LinkedList<>();
		List<Person> halfDataPerson = new LinkedList<>();
		
		String inputs;
		while (!(inputs = read.readLine()).equals("End")) {
			String[] input = inputs.split(" - ");
			
			switch (input.length) {
				case 2:
					String parentNameOrBirthday = input[0];
					String childNameOrBirthday = input[1];
					Person parent = parentNameOrBirthday.contains("/") ?
							new Person("", parentNameOrBirthday) :
							new Person(parentNameOrBirthday, "");
					Person child = childNameOrBirthday.contains("/") ?
							new Person("", childNameOrBirthday) :
							new Person(childNameOrBirthday, "");
					parent.addChild(child);
					child.addParent(parent);
					halfDataPerson.add(parent);
					halfDataPerson.add(child);
					break;
				case 1:
					String[] fullData = inputs.split("\\s+");
					String name = fullData[0] + " " + fullData[1];
					String birthday = fullData[2];
					Person person = new Person(name, birthday);
					fullDataPerson.add(person);
					break;
			}
		}
		halfDataPerson.stream()
				.forEach(halfData -> {
					fullDataPerson.stream()
							.filter(a -> a.getName().equals(halfData.getName()) ||
									a.getBirthday().equals(halfData.getBirthday()))
							.forEach(fullData -> {
								halfData.getParents().forEach(fullData::addParent);
								halfData.getChildren().forEach(fullData::addChild);
								halfData.addName(fullData.getName());
								halfData.addBirthday(fullData.getBirthday());
							});
				});
		fullDataPerson.stream()
				.forEach(person -> {
					if (person.getName().equals(givenData) || person.getBirthday().equals(givenData)) {
						System.out.println(person);
					}
				});
	}
}


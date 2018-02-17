package shoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] inputPersons = read.readLine().split(";");
			String[] inputProducts = read.readLine().split(";");
			List<Person> persons = new LinkedList<>();
			List<Product> products = new LinkedList<>();
			
			for (int i = 0; i < inputPersons.length; i++) {
				String[] namesMoney = inputPersons[i].split("=");
				String name = namesMoney[0];
				int money = Integer.valueOf(namesMoney[1]);
				Person person = new Person(name, money);
				persons.add(person);
			}
			for (int i = 0; i < inputProducts.length; i++) {
				String[] productPrice = inputProducts[i].split("=");
				String name = productPrice[0];
				int price = Integer.valueOf(productPrice[1]);
				Product product = new Product(name, price);
				products.add(product);
			}
			String commands;
			
			while (!(commands = read.readLine()).equalsIgnoreCase("end")) {
				String[] command = commands.split("\\s+");
				for (Person person : persons) {
					for (Product product : products) {
						if (person.getName().equals(command[0]) && product.getName().equals(command[1])) {
							person.addProducts(product);
						}
					}
				}
			}
			for (Person person : persons) {
				System.out.printf("%s - ", person.getName());
				if (person.getProducts().isEmpty()) {
					System.out.println("Nothing bought");
				} else {
					System.out.println(person);
				}
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}

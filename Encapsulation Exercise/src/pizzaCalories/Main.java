package pizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] firstInput = read.readLine().split("\\s+");
			String[] secondInput = {""};
			
			if (firstInput[0].equals("Dough")) {
				String flourType = firstInput[1];
				String bakingTechnique = firstInput[2];
				int doughWeight = Integer.valueOf(firstInput[3]);
				Dough dough = new Dough(flourType, bakingTechnique, doughWeight);
				secondInput = read.readLine().split("\\s+");
				System.out.printf("");
			}
			if (secondInput[0].equals("END")) {
				return;
			} else if (secondInput[0].equals("Topping")){
				String toppingType = secondInput[1];
				double toppingWeight = Double.valueOf(secondInput[2]);
				Toppings toppings = new Toppings(toppingType, toppingWeight);
				System.out.printf("");
				return;
			}
			String pizzaName = firstInput[1];
			int ingredientNumber = Integer.valueOf(firstInput[2]);
			Pizza pizza = new Pizza(pizzaName, ingredientNumber);
			
			secondInput = read.readLine().split("\\s+");
			String flourType = secondInput[1];
			String bakingTechnique = secondInput[2];
			int doughWeight = Integer.valueOf(secondInput[3]);
			Dough dough = new Dough(flourType, bakingTechnique, doughWeight);
			
			pizza.addDough(dough);
			String commands;
			
			while (!(commands = read.readLine()).equalsIgnoreCase("end")) {
				String[] command = commands.split("\\s+");
				String toppingName = command[1];
				int toppingWeight = Integer.valueOf(command[2]);
				Toppings toppings = new Toppings(toppingName, toppingWeight);
				pizza.addToppings(toppings);
			}
			System.out.println(pizza);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}

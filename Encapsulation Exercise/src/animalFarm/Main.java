package animalFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String name = read.readLine();
		int age = Integer.valueOf(read.readLine());
		try {
			Chicken chicken = new Chicken(name, age);
			chicken.producingEggs();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}

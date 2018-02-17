package mordorsCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String[] input = read.readLine().split("\\s+");
		
		Hero hero = new Hero();
		
		for (String food : input) {
			hero.eatFood(food);
		}
		
		hero.addMode();
		System.out.println(hero);
	}
}

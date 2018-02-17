package fragileBaseClass;

import java.util.ArrayList;
import java.util.Collections;

public class Animal {
	private ArrayList<Food> foodEaten;
	
	public Animal() {
		this.setFoodEaten(new ArrayList<>());
	}
	
	private void setFoodEaten(ArrayList<Food> foodEaten) {
		this.foodEaten = foodEaten;
	}
	
	public final void eat(Food food) {
		this.foodEaten.add(food);
	}
	
	public final void eatAll(Food[] foods) {
		Collections.addAll(this.foodEaten, foods);
	}
}

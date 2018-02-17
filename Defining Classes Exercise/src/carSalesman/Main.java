package carSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int numEngine = Integer.valueOf(read.readLine());
		Map<String, Engine> engines = new HashMap<>();
		
		for (int i = 0; i < numEngine; i++) {
			String[] inputEngine = read.readLine().split("\\s+");
			String model = inputEngine[0];
			int power = Integer.valueOf(inputEngine[1]);
			int displacement = 0;
			String efficiency = "";
			Engine engine = null;
			
			switch (inputEngine.length) {
				case 4:
					displacement = Integer.valueOf(inputEngine[2]);
					efficiency = inputEngine[3];
					engine = new Engine(model, power, displacement, efficiency);
					break;
				case 2:
					engine = new Engine(model, power);
					break;
				case 3:
					try {
						displacement = Integer.valueOf(inputEngine[2]);
						engine = new Engine(model, power, displacement);
					} catch (NumberFormatException e) {
						efficiency = inputEngine[2];
						engine = new Engine(model, power, efficiency);
					}
					break;
			}
			engines.put(model, engine);
		}
		
		List<Car> cars = new LinkedList<>();
		int numCars = Integer.valueOf(read.readLine());
		
		for (int j = 0; j < numCars; j++) {
			String[] inputCars = read.readLine().split("\\s+");
			String model = inputCars[0];
			String engine = inputCars[1];
			int weith = 0;
			String color = "";
			Car car = null;
			
			switch (inputCars.length) {
				case 4:
					weith = Integer.valueOf(inputCars[2]);
					color = inputCars[3];
					car = new Car(model, engines.get(engine), weith, color);
					break;
				case 2:
					car = new Car(model, engines.get(engine));
					break;
				case 3:
					try {
						weith = Integer.valueOf(inputCars[2]);
						car = new Car(model, engines.get(engine), weith);
					} catch (NumberFormatException e) {
						color = inputCars[2];
						car = new Car(model, engines.get(engine), color);
					}
					break;
			}
			cars.add(car);
		}
		for (Car car : cars) {
			System.out.println(car);
		}
	}
}

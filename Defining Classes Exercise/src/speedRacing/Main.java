package speedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(read.readLine());
		List<Car> cars = new LinkedList<>();
		
		for (int i = 0; i < num; i++) {
			String[] inputs = read.readLine().split("\\s+");
			String vehicle = inputs[0];
			int fuelAmount = Integer.valueOf(inputs[1]);
			double fuelCost = Double.valueOf(inputs[2]);
			Car car = new Car(vehicle, fuelAmount, fuelCost);
			cars.add(car);
		}
		String drive;
		while (!(drive = read.readLine()).equalsIgnoreCase("end")) {
			String[] input = drive.split("\\s+");
			String car = input[1];
			int distance = Integer.valueOf(input[2]);
			
			for (Car car1 : cars) {
				if (car1.getModel().equals(car)) {
					car1.carMoveDistance(distance);
				}
			}
		}
		for (Car car : cars) {
			System.out.println(car);
		}
	}
}

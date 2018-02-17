package vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String[] firstInput = read.readLine().split("\\s+");
		double carFuelQuantity = Double.valueOf(firstInput[1]);
		double carFuelConsumption = Double.valueOf(firstInput[2]);
		Vehicle car = new Car(carFuelQuantity, carFuelConsumption);
		
		String[] secondInput = read.readLine().split("\\s+");
		double truckFuelQuantity = Double.valueOf(secondInput[1]);
		double truckFuelConsumption = Double.valueOf(secondInput[2]);
		Vehicle truck = new Truck(truckFuelQuantity, truckFuelConsumption);
		
		int num = Integer.valueOf(read.readLine());
		
		for (int i = 0; i < num; i++) {
			String[] command = read.readLine().split("\\s+");
			try {
				String vehicleType = command[1];
				
				switch (command[0].toLowerCase()) {
					case "drive":
						double givenDistance = Double.valueOf(command[2]);
						if (vehicleType.toLowerCase().equals("car")) {
							car.drive(givenDistance);
						} else if (vehicleType.toLowerCase().equals("truck")) {
							truck.drive(givenDistance);
						}
						DecimalFormat df = new DecimalFormat("#.#########################");
						System.out.printf("%s travelled %s km%n", vehicleType, df.format(givenDistance));
						break;
					case "refuel":
						double liters = Double.valueOf(command[2]);
						if (vehicleType.toLowerCase().equals("car")) {
							car.refuel(liters);
						} else if (vehicleType.toLowerCase().equals("truck")) {
							truck.refuel(liters);
						}
						break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(car);
		System.out.println(truck);
	}
}

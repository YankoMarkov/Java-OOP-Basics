package rawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(read.readLine());
		List<Car> cars = new ArrayList<>();
		
		for (int i = 0; i < num; i++) {
			String[] input = read.readLine().split("\\s+");
			String carModel = input[0];
			
			int engineSpeed = Integer.valueOf(input[1]);
			int enginePower = Integer.valueOf(input[2]);
			Engine engine = new Engine(engineSpeed, enginePower);
			
			int cargoWeight = Integer.valueOf(input[3]);
			String cargoType = input[4];
			Cargo cargo = new Cargo(cargoWeight, cargoType);
			
			List<Tire> tires = new ArrayList<>();
			for (int j = 5; j < 12; j += 2) {
				double tirePressure = Double.valueOf(input[j]);
				int tireAge = Integer.valueOf(input[j + 1]);
				Tire tire = new Tire(tirePressure, tireAge);
				tires.add(tire);
			}
			Car car = new Car(carModel, engine, cargo, tires);
			cars.add(car);
		}
		String typeCargo = read.readLine();
		
		switch (typeCargo) {
			case "fragile":
				cars.stream()
						.filter(a -> a.getCargo().getCargoType().equals("fragile"))
						.filter(b -> b.getTires().stream().filter(x -> x.getPressure() < 1)
								.collect(Collectors.toList()).size() > 0)
						.forEach(System.out::println);
				break;
			case "flamable":
				cars.stream()
						.filter(a -> a.getCargo().getCargoType().equals("flamable"))
						.filter(b -> b.getEngine().getEnginePower() > 250)
						.forEach(System.out::println);
				break;
		}
	}
}

package classBoxDataValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		double length = Double.valueOf(read.readLine());
		double width = Double.valueOf(read.readLine());
		double height = Double.valueOf(read.readLine());
		try {
			Box box = new Box(length, width, height);
			System.out.printf("Surface Area - %.2f%n", box.getSurfaceArea());
			System.out.printf("Lateral Surface Area - %.2f%n", box.getLateralSurfaceArea());
			System.out.printf("Volume - %.2f%n", box.getVolume());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}

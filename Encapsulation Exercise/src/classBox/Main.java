package classBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		double length = Double.valueOf(read.readLine());
		double width = Double.valueOf(read.readLine());
		double height = Double.valueOf(read.readLine());
		
		Box box = new Box(length, width, height);
		System.out.printf("Surface Area - %.2f%n", box.surfaceArea());
		System.out.printf("Lateral Surface Area - %.2f%n", box.lateralSurfaceArea());
		System.out.printf("Volume - %.2f%n", box.volume());
	}
}

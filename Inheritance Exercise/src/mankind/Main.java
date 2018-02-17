package mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String[] firsInput = read.readLine().split("\\s+");
		String studentFirstName = firsInput[0];
		String studentLastName = firsInput[1];
		String facultyNumber = firsInput[2];
		String[] secondInput = read.readLine().split("\\s+");
		String workerFirstName = secondInput[0];
		String workerLastName = secondInput[1];
		double salary = Double.valueOf(secondInput[2]);
		double workingHours = Double.valueOf(secondInput[3]);
		
		try {
			Student student = new Student(studentFirstName, studentLastName, facultyNumber);
			Worker worker = new Worker(workerFirstName, workerLastName, salary, workingHours);
			
			System.out.println(student);
			System.out.println(worker);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}

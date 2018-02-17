package companyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(read.readLine());
		Map<String, List<Employee>> result = new HashMap<>();
		
		for (int i = 0; i < num; i++) {
			String[] inputs = read.readLine().split("\\s+");
			String name = inputs[0];
			double salary = Double.valueOf(inputs[1]);
			String position = inputs[2];
			String department = inputs[3];
			String email = "";
			int age = 0;
			Employee employee = null;
			result.putIfAbsent(department, new ArrayList<>());
			
			switch (inputs.length) {
				case 6:
					email = inputs[4];
					age = Integer.valueOf(inputs[5]);
					employee = new Employee(name, salary, position, department, email, age);
					break;
				case 5:
					try {
						age = Integer.valueOf(inputs[4]);
						employee = new Employee(name, salary, position, department, age);
					} catch (NumberFormatException e) {
						email = inputs[4];
						employee = new Employee(name, salary, position, department, email);
					}
					break;
				case 4:
					employee = new Employee(name, salary, position, department);
					break;
			}
			result.get(department).add(employee);
		}
		result.entrySet().stream()
				.sorted((a, b) -> Double.compare(
						b.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble(),
						a.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble()
				))
				.limit(1)
				.forEach(s -> {
					System.out.printf("Highest Average Salary: %s%n", s.getKey());
					s.getValue().stream()
							.sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
							.forEach(System.out::println);
				});
	}
}

package staticIdAndRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, BankAccount> accounts = new HashMap<>();
		String inputs;
		
		while (!(inputs = read.readLine()).equals("End")) {
			String[] input = inputs.split("\\s+");
			
			switch (input[0]) {
				case "Create":
					BankAccount account = new BankAccount();
					accounts.put(account.getId(), account);
					System.out.printf("Account ID%d created%n", account.getId());
					break;
				case "Deposit":
					makeDeposit(input, accounts);
					break;
				case "SetInterest":
					double interest = Double.valueOf(input[1]);
					BankAccount.setInterest(interest);
					break;
				case "GetInterest":
					getInterest(input, accounts);
					break;
			}
		}
	}
	
	private static void getInterest(String[] input, Map<Integer, BankAccount> accounts) {
		int id = Integer.valueOf(input[1]);
		int years = Integer.valueOf(input[2]);
		if (accounts.containsKey(id)) {
			System.out.printf("%.2f%n", accounts.get(id).getInterest(years));
		} else {
			System.out.println("Account does not exist");
		}
	}
	
	private static void makeDeposit(String[] input, Map<Integer, BankAccount> accounts) {
		int id = Integer.valueOf(input[1]);
		double amount = Double.valueOf(input[2]);
		if (accounts.containsKey(id)) {
			accounts.get(id).deposit(amount);
			System.out.printf("Deposited %.0f to ID%d%n", amount, id);
		} else {
			System.out.println("Account does not exist");
		}
	}
}

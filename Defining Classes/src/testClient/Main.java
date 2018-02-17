package testClient;

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
			int id = 0;
			double amount = 0;
			
			switch (input[0]) {
				case "Create":
					id = Integer.valueOf(input[1]);
					if (accounts.containsKey(id)) {
						System.out.println("Account already exists");
					} else {
						BankAccount account = new BankAccount();
						account.setId(id);
						accounts.put(id, account);
					}
					break;
				case "Deposit":
					id = Integer.valueOf(input[1]);
					amount = Double.valueOf(input[2]);
					if (!accounts.containsKey(id)) {
						System.out.println("Account does not exist");
					} else {
						accounts.get(id).deposit(amount);
					}
					break;
				case "Withdraw":
					id = Integer.valueOf(input[1]);
					amount = Double.valueOf(input[2]);
					if (accounts.containsKey(id)) {
						if (amount > accounts.get(id).getBalance()) {
							System.out.println("Insufficient balance");
						} else {
							accounts.get(id).withdraw(amount);
						}
					} else {
						System.out.println("Account does not exist");
					}
					break;
				case "Print":
					id = Integer.valueOf(input[1]);
					if (!accounts.containsKey(id)) {
						System.out.println("Account does not exist");
					} else {
						System.out.println(accounts.get(id).toString());
					}
					break;
			}
		}
	}
}

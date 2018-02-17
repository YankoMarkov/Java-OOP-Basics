package definePersonClass;

public class Main {
	
	public static void main(String[] args) {
		
		Person person = new Person("Pesho", 30);
		
		BankAccount account1 = new BankAccount(1, 20);
		BankAccount account2 = new BankAccount(2, 10);
		BankAccount account3 = new BankAccount(3, 50);
		BankAccount account4 = new BankAccount(4, 20);
		
		person.getAccounts().add(account1);
		person.getAccounts().add(account2);
		person.getAccounts().add(account3);
		person.getAccounts().add(account4);
		
		System.out.println(person.getBalance());
	}
}

package testClient;

class BankAccount {

	private int id;
	private double balance;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	@Override
	public String toString() {
		return String.format("Account ID%s, balance %.2f", getId(), getBalance());
	}
}

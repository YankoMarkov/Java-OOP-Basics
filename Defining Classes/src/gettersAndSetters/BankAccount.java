package gettersAndSetters;

class BankAccount {
	
	int id;
	double balance;
	
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
		return "ID" + this.id;
	}
}

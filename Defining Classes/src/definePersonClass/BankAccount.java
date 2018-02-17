package definePersonClass;

class BankAccount {
	private int id;
	private double balance;
	
	public BankAccount(int id, double balance) {
		this.setId(id);
		this.setBalance(balance);
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

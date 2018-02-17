package staticIdAndRate;

class BankAccount {

	private final static double DEFAULT_RATE = 0.02;
	private static double rate = DEFAULT_RATE;
	private static int bankAccountCount;
	
	private int id;
	private double balance;
	
	public static void setInterest(double interest) {
		BankAccount.rate = interest;
	}
	
	public BankAccount() {
		this.setId(++bankAccountCount);
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
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public double getInterest(int years) {
		return this.getBalance() * rate * years;
	}
	
	@Override
	public String toString() {
		return String.format("ID%s", getId());
	}
}

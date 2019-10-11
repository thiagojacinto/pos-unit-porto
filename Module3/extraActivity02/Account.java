package extraActivity02;

public abstract class Account {
	private String number;
	
	private Double balance;
	
	// CONSTRUCTOR
	public Account (String num, Double balance) {
		this.number = num;
		this.balance = balance;
	}
	
	public Account() {
		// Empty constructor
	}
	
	// Method to add money into balance
	public void credit(Double quantity) {
		setBalance(getBalance() + quantity);
	}
	
	// Method to remove money into balance
//	public void debit(Double quantity) {
//		setBalance(getBalance() - quantity);
//	}
	
	// Method to remove money into balance -ABSTRACT
	public abstract void debit(Double value);

	// GETTERS AND SETTERS
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [number = " + number + ", balance = " + balance + "]\n";
	}
	
}

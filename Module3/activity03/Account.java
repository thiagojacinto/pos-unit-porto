package activity03;

public class Account {
	private int number;
	
	private Double balance;
	
	// CONSTRUCTOR
	public Account (int num, Double balance) {
		this.number = num;
		this.balance = balance;
	}
	
	public Account() {
		
	}
	
	// Method to add money into balance
	public void credit(Double quantity) {
		setBalance(getBalance() + quantity);
	}
	
	// Method to remove money into balance
	public void debit(Double quantity) {
		setBalance(getBalance() - quantity);
	}

	// GETTERS AND SETTERS
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}

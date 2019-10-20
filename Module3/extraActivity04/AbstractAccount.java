package extraActivity04;

public abstract class AbstractAccount {
	private String number;
	
	private Double balance;
	
	// CONSTRUCTOR
	public AbstractAccount (String num, Double balance) {
		this.number = num;
		this.balance = balance;
	}
	
	public AbstractAccount() {
		
	}
	
	// Method to add money into balance
	public void credit(Double quantity) {
		setBalance(getBalance() + quantity);
	}
	
	// Method to remove money into balance
	public abstract void debit(Double quantity);

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

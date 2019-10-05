package activity06;

public abstract class Account {
	private Double balance;
	
	public Double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double b) {
		this.balance = b;
		System.out.println("The new balance = " + getBalance());
	}
	
	public abstract void printBalance();
}

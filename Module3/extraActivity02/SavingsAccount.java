package extraActivity02;

public class SavingsAccount extends RealAccount {
	// ATRIBUTES
	Double interest;
	
	// CONSTRUCTOR
	SavingsAccount(String num, Double balance) {
		super(num, balance);
		// TODO Auto-generated constructor stub
	}
	
	SavingsAccount() {
		// Empty constructor
	}
	
	// METHODS
	public void interest(double interest) {
		// TODO Auto-generated method stub
		this.credit(getBalance()*interest);
	}
	
	public Double getInsterest() {
		// TODO Auto-generated method stub
		return interest;
	}

}

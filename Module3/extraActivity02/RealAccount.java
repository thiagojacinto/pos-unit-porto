package extraActivity02;

public class RealAccount extends Account{


	// CONSTRUCTOR
	RealAccount(String num, Double balance) {
		super(num, balance);
		// TODO Auto-generated constructor stub
	}

	RealAccount() {
		// Empty constructor
	}
	
	@Override
	public void debit(Double quantity) {
		setBalance(getBalance() - quantity);
	}
}

package extraActivity04;

public class Account extends AbstractAccount{


	// CONSTRUCTOR
	Account(String num, Double balance) {
		super(num, balance);
		// TODO Auto-generated constructor stub
	}

	Account() {
		// Empty constructor
	}
	
	@Override
	public void debit(Double quantity) {
		setBalance(getBalance() - quantity);
	}
}

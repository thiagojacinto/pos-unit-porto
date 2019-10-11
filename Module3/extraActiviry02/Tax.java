package extraActivity02;

public class Tax extends Account{

	// CONSTRUCTOR
	Tax(String num, Double balance) {
		super(num, balance);
		// TODO Auto-generated constructor stub
	}

	Tax() {
		// Empty constructor
	}

	@Override
	public void debit(Double quantity) {
		setBalance(getBalance() - quantity);
	}
}

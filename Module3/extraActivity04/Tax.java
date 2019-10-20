package extraActivity04;

public class Tax extends AbstractAccount{

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

package extraActivity02;

public class BonusAccount extends RealAccount {
	// ATTRIBUTES
	double bonus;
	
	// CONSTRUCTOR
	BonusAccount(){}; // Empty one
	
	BonusAccount(String num, Double balance) {
		super(num, balance);
	}
	
	// METHODS
	public void bonusCredit() {
		super.credit(this.bonus);
		this.bonus = 0;
	}
	

	public void credit(Double quantity) {
		setBonus(this.bonus + (quantity * 0.5));
		super.credit(this.bonus);
	}
	
	// GETTERS AND SETTERS
	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
}

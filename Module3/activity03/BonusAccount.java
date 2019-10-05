package activity03;

public class BonusAccount extends Account{
	// ATTRIBUTES
	double bonus;
	
	// METHODS
	public void bonusCredit(double quantity) {
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

package activityExtra01;

public class Manager extends Employee {
	// METHODS
	@Override
	public Double getBonus() {
		// TODO Auto-generated method stub
		return this.salary * 1.4 + 1000;
	}
}

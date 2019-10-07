package activityExtra01;

public abstract class Employee {
	// ATTRIBUTES
	protected double salary;
	
	// CONSTRUCTOR
	Employee() {/* empty constructor */}
	
	Employee(double salary) {
		this.salary = salary;
	}
	
	// METHODS
	public Double getBonus() {
		return this.salary * 1.2;
	}
}

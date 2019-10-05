package activity04;

public class Professor extends Person{
	// ATTRIBUTES
	Double salary;
	
	// CONSTRUCTOR
	public Professor() {
		// Empty constructor
	}
	
	public Professor(String name, String cpf, int age, Double salary) {
		this.name = name;
		this.cpf = cpf;
		this.age = age;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	// METHODS
	
	
}

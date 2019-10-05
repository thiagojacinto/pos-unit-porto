package activity01;

public class Manager {
	// ATTRIBUTES:
	String name;
	int CPF;
	Employee emp;
	
	// METHODS:
	
	public void askToPrint(Employee emp) {
		// The manager tells the employee to print the document
		emp.printDocument();
	}
}

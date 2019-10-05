package activity01;

//import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// Creating the employee and manager:
		Employee emp = new Employee();
		Manager manager = new Manager();
		
		// Calling the 'manager' to order the 'emp' to print the document:
		manager.askToPrint(emp);
		
//		Scanner scanner = new Scanner(System.in);
//		
//		emp.name = scanner.nextLine();
//		manager.emp = emp;
//		System.out.println("Nome: " + manager.emp.name);
//		
//		scanner.close();
	}
}

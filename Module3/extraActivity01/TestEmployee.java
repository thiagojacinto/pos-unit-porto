package activityExtra01;

public class TestEmployee {
	public static void main(String[] args) {
		// Instantiate a new 'Manager', with 'Employee' type:
		Employee manager1 = new Manager();
		manager1.salary = 1000.0;
		
		// Call 'getBonus()' and print it:
		System.out.println(manager1.getBonus());
		
	}
}

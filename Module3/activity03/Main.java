package activity03;

public class Main {
	public static void main(String[] args) {
		
		// Creating an account
		Account acc1 = new SavingsAccount(129387, 50.0);
		acc1.credit(20.0);
		acc1.debit(10.0);
		
		// The needs to 'cast' is because 
		((SavingsAccount) acc1).interest(0.002);
		System.out.println(acc1.getBalance());
	}
}

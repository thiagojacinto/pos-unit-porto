package activity06;

public class Main {
	public static void main(String[] args) {
		Account newAccount = new Savings();
		newAccount.setBalance(1500.50);
		newAccount.printBalance();
	}
}

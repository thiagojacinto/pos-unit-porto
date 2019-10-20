package extraActivity04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creates a repository from the RepoList
		AccountsRepository repo = new AccountsRepoList();
		// Creates a person
		Person userType = null;
		// Instantiate a Scanner
		Scanner sc = new Scanner(System.in);
		// Auxiliary variable to loop
		boolean verify = true;

		// ***** BEGIN *****
		while (verify) {

			System.out.println( // Ask to login
					"* * * * * * * * * * * * * * *"
					+ "\nWelcome to PortoDigital Bank"
					+ "\n* * * * * * * * * * * * * * *"
					+ "\n"
					+ "\nTYPE: "
					+ "\n'G' to login as a Manager"
					+ "\n'F' to login as an Employee"
					);
			String ans = sc.next();
			// Block - selecting the login type
			while (verify) {

				// When user type 'G', ends
				if (ans.equals("G")) {
					verify = false;
					// then creates a manager
					userType = new Manager('m', repo);
					// Greetings
					System.out.println("Hello there, manager '" + ((Manager) userType).getType() + "'.");
					// When user type 'F', finishes the loop too
				} else if (ans.equals("F")) {
					verify = false;
					// then creates a employee
					userType = new Employee('e', repo);
					// Greetings
					System.out.println("Hello there, employee '" + ((Employee) userType).getType() + "'.");
				} else {
					System.out.println("Wrong login. Try again: ");
					ans = sc.next();
				}
			}

			// Turn on 'verify':
			boolean verify2 = true;

			// Operations loop
			while (verify2) {
				// Showing options
				System.out.println("Type the number of the operation:"
						+ "\n(1) to Insert a new account;"
						+ "\n(2) to Search an account;"
						+ "\n(3) to Remove an account;"
						+ "\n(4) to Show the list of accounts added;"
						+ "\n(5) to Exit."
						);
				int response = sc.nextInt();
				switch (response) {
				case 1:		// (1) to Insert a new account;
					System.out.println("You choose to Insert a new account.");
					System.out.println("Type the number of the new Account: ");
					String n = sc.next();
					System.out.println("now its initial balance: ");
					double b = sc.nextDouble();
					// Then instantiate a new acc with that input data
					Account newAccount = new Account(n,b);

					if (userType instanceof Manager) {
						((Manager) userType).insert(newAccount);
					} else if (userType instanceof Employee) {
						((Employee) userType).insert(newAccount);
					}

					break;
				case 2:		// (2) to Search an account;
					System.out.println("You choose to Search an account."
							+ "\nType the number of that account you are searched for: "
							);
					String accNum = sc.next();	
					Account foundAccount = null;
					if (userType instanceof Manager) {
						foundAccount = (Account) ((Manager) userType).search(accNum);
					} else if (userType instanceof Employee) {
						foundAccount = (Account) ((Employee) userType).search(accNum);
					}
					if (foundAccount != null) {
						System.out.println("The result of the search is: "
								+ foundAccount.toString()
								);
					} else System.err.println("Account not found.\n");

					break;
				case 3:		// (3) to Remove an account
					if (userType instanceof Manager) {
						System.out.println("Type the desired account number: ");
						accNum = sc.next();
						((Manager) userType).remove(accNum);
					} else if (userType instanceof Employee) {
						// The Employee method 'returns' a fail warning.
						((Employee) userType).remove("");
					}else {
						System.out.println("Your login cannot access this operation. Try another one.");
					}

					break;
				case 4:		// (4) to Show the list of accounts added

					if (userType instanceof Manager) {
						System.out.println(((Manager) userType).list());;
					} else if (userType instanceof Employee) {
						System.out.println(((Employee) userType).list());;
					}

					break;

				case 5:		// (5) to Exit.
					break;

				default:
					throw new IllegalArgumentException("Unexpected value typed: " + response);
				}
				System.out.println("Type '0' if you want to another operation: ");
				if (sc.nextInt() == 0) {
					// Continue in this loop
					verify2 = true;
				} else {
					// Closes the while loop
					verify2 = false;
//					System.out.println("Session closed.");
				}
			}
			System.out.println("Type '0' if you want to log on again: ");
			if (sc.nextInt() == 0) {
				// Continue in this loop
				verify = true;
			} else {
				// Closes the while loop
				verify = false;
				System.out.println("Session closed.");
			}
		}
		// Closes the Scanner
		sc.close();
	}
}
package activity08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Creates a Manager 'm1':
		Manager m1 = new Manager();
		// Uses 'sc' to get inputs from the console
		Scanner sc = new Scanner(System.in);
		// The boolean 'exit' verify when get out of the loop
		boolean exit = false;
		while (exit == false) {
			
			System.out.println("Enter your password: ");
			m1.setPassword(sc.nextInt());
			System.out.println(
					"Is the password correct? Answer: " + m1.verifyPassword()
					);
			
			// If the password is correct:
			if (m1.verifyPassword()) {
				exit = true;
				System.out.println("Congrats, you are in now! ");
			// If the password is wrong: 
			} else {
				// The user can try again
				System.out.println("If you want to try again, type 'false': ");
				exit = sc.nextBoolean();
			}
			
		}

		sc.close();
	}
}

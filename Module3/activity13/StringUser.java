package activity13;

import java.util.Scanner;

public class StringUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("* - * - * - * - * - * - * - * - * - ");
		System.out.println("               Welcome              ");
		
		// First task
		System.out.println("Type a word:");
		String first = sc.next();
		System.out.println("The word's size: " + first.length());
		
		// Second task
		System.out.println("Now, type a word with at least 8 characters: ");
		String second = sc.next();
		while (second.length() < 8) {
			System.err.println("Wrong. Try again with at least 8 characters: ");
			second = sc.next();
		}
		System.out.println(
				second.substring(0, 2) 
				+ second 
				+ second.substring(second.length()-2, second.length()));
		
		// Third task
		System.out.println("Again, type a word to compare: ");
		String third = sc.next();
		System.out.println("One last time, type another word to compare: ");
		String fourth = sc.next();
		
		System.out.println("Comparing with ´equals´ method: ");
		System.out.println(third.equals(fourth));
		System.out.println("Then comparing with ´equalsIgnoreCase´ method: ");
		System.out.println(third.equalsIgnoreCase(fourth));
		
		System.out.println("Finished, congrats!");
		sc.close();
	}

}

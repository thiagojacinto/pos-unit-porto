package application;

import java.util.Scanner;

import entities.Client;
import entities.Food;
import entities.Order;

public class Restaurant {
	public static void main(String[] args) {
		boolean exit = true;
		Scanner scanner = new Scanner(System.in);
		while(exit) {		// Continues while 'exit' is not requested.
			System.out.println("Welcome. Are you ready to order?");
			String anwser = scanner.next();
			if (anwser.matches("^[YESyes]+$")) {
				Client c1 = new Client();
				System.out.println("What's your name? ");
				c1.setName(scanner.next());	// Naming the client
				c1.setWallet((float) Math.random()*100); // Create random $ for the client
				
				Order od1 = new Order();	// New order
				od1.setClient(c1);			// Setting the client to the order
				od1.setId();
				
				anwser = "NO";
				
				System.out.println("Let's begin the order, " + c1.getName() + ". Digit 'YES' to start: ");
				anwser = scanner.next();	// To verify if the client wants to add an order
				while (anwser.matches("^[YESyes]+$")) {
					System.out.println("So, " + c1.getName() + ", digit the order");
					Food orderedItem = new Food();
					orderedItem.setDescription(scanner.next());
					orderedItem.setPrice((float) Math.random()*50);
					od1.add(orderedItem);
					
					System.out.println(c1.getName() + ", say 'YES' if you want anything more...");
					anwser = scanner.next();
				}
				
			}
			
			// Exit application or not?
			System.out.println("To close application, digit 'FALSE' ");
			String exitString = scanner.next();
			if (exitString.matches("[falseFALSE]+")) { 
				exit = false;
				System.out.println("Application closed. Bon appetit!");
			} else {
				exit = true;
			}
		}
		scanner.close();
	}
}

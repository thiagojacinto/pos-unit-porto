package application;

import java.util.Scanner;

import entities.Beverage;
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

				System.out.println("Let's begin the order.");
//				anwser = scanner.next();	// To verify if the client wants to add an order
				while (anwser.matches("^[YESyes]+$")) {
					anwser = "";
					System.out.println("So, " + c1.getName() + ", type here what you wanna eat: ");
					Food orderedItem = new Food();
					orderedItem.setDescription(scanner.next());
					orderedItem.setPrice((float) Math.round(Math.random()*50));
					od1.add(orderedItem);

					System.out.println(c1.getName() + ", type 'YES' if you want anything more...");
					anwser = scanner.next();
				}	
				
				anwser = "n";
				System.out.println("Great! Do you want something to drink? "); //Type 'YES' if you do!
				anwser = scanner.next();	// To verify if the client wants to add an order
				while (anwser.matches("^[YESyes]+$")) {
					anwser = "";
					System.out.println("So, " + c1.getName() + ", type what kind of beverage: ");
					Beverage orderedItem = new Beverage();
					orderedItem.setDescription(scanner.next());
					orderedItem.setPrice((float) Math.round(Math.random()*20));
					od1.add(orderedItem);

					System.out.println(c1.getName() + ", type 'YES' if you wanna add another stuff to drink...");
					anwser = scanner.next();
				}	
				
				// Show the client's orders
				System.out.println("So we'd finished. Recapitulating, you ordered:");
				od1.showOrders();
				
				// Modifying the order
				System.out.print("Is it ok? If you want to remove something, type 'YES': ");
				anwser = scanner.next();
				while (anwser.matches("^[YESyes]+$")) {
					anwser = "";
//					od1.showOrders();
					System.out.println("Select the [INDEX] you want to remove from the order: ");
					od1.remove(scanner.nextInt());
					System.out.println("So, " + od1.getClient().getName() + ", do you want to remove something more?\nType 'YES' if you do: ");
					anwser = scanner.next();
				}
				
				// Payment
				System.out.print("So, that will be: $ " + od1.getValue());
				System.out.println("\n * " + od1.getClient().getName() 
						+ " opens wallet, and there is this amount of cash: $" + od1.getClient().getWallet());
				System.out.println("How do you want to pay? Type: \n 1 - to pay with cash; \n 2 - pay with credit.");
				int choice = scanner.nextInt();
				while (choice != 1 && choice != 2) {
					System.out.println("Wrong option. Try again: ");
					choice = scanner.nextInt();
					
				}
				if (choice == 1 && od1.getClient().getWallet() < od1.getValue()) {
					System.out.println("You don't have enough money, sorry. \nLet's try payment by credit... ");
					choice = 2;
				} else if (choice == 1) {
					float change = od1.getClient().getWallet() - od1.getValue();
					od1.getClient().setWallet(change);
					System.out.println("Ok then. Let's see... "
							+ " \n...\n "
							+ od1.getClient().getName() + " has now in the wallet: $" 
							+ od1.getClient().getWallet());
					od1.setPaymentMethod("Cash from the wallet.");
				} 
				if (choice == 2) {
					System.out.println("Ok, payment by credit then. Processing ...\n... wait ...");
					System.out.println("Processed! \n ^_^ \n Thanks!");
					od1.setPaymentMethod("Credit card.");
				}
				
				// Resuming the operation
				System.out.println(od1.toString());
				System.out.println("- Itens Ordered:  ");
				od1.showOrders();
				System.out.println("- - - - - - - - - - ");
				
			}

			// Exit application or not?
			System.out.println("To close application, digit 'EXIT' ");
			String exitString = scanner.next();
			if (exitString.matches("[exitEXIT]+")) { 
				exit = false;
				System.out.println("Application closed. Bon appetit!");
			} else {
				exit = true;
			}
		}
		scanner.close();
	}
}

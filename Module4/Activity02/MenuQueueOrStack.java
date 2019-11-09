package br.unit.module4.activity02;

import java.util.Scanner;

import br.unit.module4.activity01.MyStack;

public class MenuQueueOrStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = 0;

		boolean loop1 = true;
		while (loop1) {

			// User can choose between STACK or QUEUE
			System.out.println("Greetings. Select the type of data arrangement you wanna do: "
					+ "\n > [1] Stack;"
					+ "\n > [2] Queue;"
					+ "\n > [3] EXIT"
					);
			input1 = sc.nextInt();	// User input
			switch (input1) {
			case 1:		// Choose STACK
				MyStack myStack = new MyStack();	// Instantiate
				boolean loopStack = true;
				while (loopStack) {

					System.out.println("\n * * * STACK OPTIONS * * *"
							+ "\n [1] Push random number;"
							+ "\n [2] Pop;"
							+ "\n [3] List;"
							+ "\n [4] Show 'top';"
							+ "\n [5] EXIT"
							);
					input1 = sc.nextInt();
					switch (input1) {
					case 1:		// Push
						int random = (int) Math.round(Math.random()*100);
						
						try {
							myStack.push(random);
						} catch (RuntimeException e) {
							// TODO: handle exception
							System.out.println("This Stack is full.");
						}
						System.out.println("Added: " + random);
						break;
					case 2:		// Pop
						System.out.println("The last element '" + myStack.getTop() + "' was removed.");
						myStack.pop();
						break;
					case 3:		// List
						System.out.println("Showing stack elements: ");
						myStack.showVector();
						break;
					case 4:		// show Top
						System.out.println("The top element is = " + myStack.getTop());
						break;
					case 5:		// Exit
						System.out.println("exiting ... ");
						loopStack = false;
						break;
					default:
						System.out.println("Wrong option. Try again: ");

						break;
					}
				}

				break;
			case 2:		// choose QUEUE
				Queue myQueue = new Queue();
				boolean loopQueue = true;
				while (loopQueue) {
					System.out.println("\n * * * QUEUE OPTIONS * * *"
							+ "\n [1] Insert random number;"
							+ "\n [2] Remove;"
							+ "\n [3] List;"
							+ "\n [4] EXIT"
							);
					input1 = sc.nextInt();
					switch (input1) {
					case 1:		// Push
						int random = (int) Math.round(Math.random()*100);
						try {
							myQueue.insertInQueue(random);
							System.out.println("Added: " + random);
						} catch (RuntimeException e) {
							// TODO: handle exception
							System.out.println("This Queue is full.");
						}
						break;
					case 2:		// Pop
						
						try {
							System.out.println("The HEAD element '" + myQueue.getHead() + "' was removed.");
							myQueue.unQueue();
						} catch (RuntimeException e) {
							// TODO: handle exception
							System.out.println(e.getMessage());
						}
						break;
					case 3:		// List
						System.out.println("Showing stack elements: ");
						myQueue.showQueue();
						break;
					case 4:		// Exit
						System.out.println("exiting ... ");
						loopQueue = false;
						break;
					default:
						System.out.println("Wrong option. Try again: ");
						break;
					}
				}
				break;
			case 3:		// EXIT
				System.out.println("Closing application...");
				loop1 = false;
			default:
				System.out.println("Wrong option. Try again: ");
				break;
			}
		}

		// Closes the scanner
		sc.close();
	}
}

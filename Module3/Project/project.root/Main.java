package project.com.root;

import java.util.Calendar;
import java.util.Scanner;

import project.com.contentManagement.Book;
import project.com.contentManagement.Collection;
import project.com.contentManagement.CollectionsRepo;
import project.com.contentManagement.Magazine;
import project.com.contentManagement.Newspaper;
import project.com.contentManagement.RepositoryOfCollections;
import project.com.operationsManagement.LibraryOperations;
import project.com.operationsManagement.Loan;
import project.com.operationsManagement.OperationsRepo;
import project.com.operationsManagement.Return;
import project.com.operationsManagement.Withdrawal;
import project.com.peopleManagement.Employee;
import project.com.peopleManagement.Person;
import project.com.peopleManagement.PersonRepo;
import project.com.peopleManagement.RepositoryOfPersons;
import project.com.peopleManagement.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Repositories
		RepositoryOfPersons personRepo = new PersonRepo();
		RepositoryOfCollections itemsRepo = new CollectionsRepo();
		OperationsRepo taskRepo = new OperationsRepo();
		Scanner sc = new Scanner(System.in);

		System.out.println("* - * - * - * - * - * -* - * - * "
				+ "\n Welcome to New Hope Library \n"
				+ "       .--.           .-.     .---.\r\n" + 
				"   .---|__|           |-|     |~~~|\r\n" + 
				".--|===|--|_          | |     |~~~|--.\r\n" + 
				"|  |===| U|'\\     .---!P|  .--|   |--|\r\n" + 
				"|TJ|   | N|.'\\    |===|O|--|19|   |  |\r\n" + 
				"|SS|   | I|\\.'\\   |   |R|__|  |   |  |\r\n" + 
				"|  |   | T| \\  \\  |===|T|==|  |   |  |\r\n" + 
				"|==|===|--|  \\.'\\ |   |O|  |--|~~~|__|\r\n" + 
				"|  |===|--|   \\.'\\|===|-|--|84|~~~|--|\r\n" + 
				"^--^---'--^    `-'`---^-^--^--^---'--'"
				+ "\n* - * - * - * - * - * -* - * - * ");

		// * * * * * * * * * * * DEFAULT - Simulating a DB * * * * * * * * * * *

		// Users
		User u1 = new User("Alice Burns", 123);
		User u2 = new User("Howard Jonhson", 124);
		personRepo.insert(u1);
		personRepo.insert(u2);
		// Employees
		Employee e1 = new Employee("Carolina D. A. B.", 99);
		Employee e2 = new Employee("James A.", 98);
		personRepo.insert(e1);
		personRepo.insert(e2);

		// Items
		Book i1 = new Book(9991, "Este livro não vai te deixar rico", 2019);
		i1.setQuantity(1);
		Magazine i2 = new Magazine(9791, 2013, "Veja");
		i2.setQuantity(3);
		Magazine i3 = new Magazine(9792, 2014, "Piauí");
		i3.setQuantity(2);
		Newspaper i4 = new Newspaper(9891, 2016, "Nexo Jornal");
		i4.setQuantity(5);
		Newspaper i5 = new Newspaper(9892, 1931, "Estado de São Paulo");
		i5.setQuantity(4);
		itemsRepo.insert(i1); 
		itemsRepo.insert(i2); 
		itemsRepo.insert(i3);
		itemsRepo.insert(i4);
		itemsRepo.insert(i5);

		// Operations
		Loan l1 = new Loan(u1, i4, Calendar.getInstance());
		taskRepo.insert(l1);
			// then its quantity is lowered by 1
			i4.setQuantity(i4.getQuantity() - 1);
		
		// * * * * * * * * * * * PROGRAM STARTS HERE * * * * * * * * * * * * * *
		boolean loop2 = true;
		while (loop2) {		// Login

			// Login prompt
			System.out.println("\nLOG IN:"
					+ "\n > [1] User"
					+ "\n > [2] Employee"
					+ "\n > [3] Cancel and exit system"
					);
			int first = getIntFromKB(); // User input
			// 
			while (first != 1 && first != 2 && first != 3) {
				System.err.println("Wrong option, try again.");
				first = getIntFromKB();
			}

			// Menu for USER - loop1
			boolean loop1 = true;
			while (loop1) {
				if (first == 1) { // Choose 'user'
					System.out.println("\n* * USER MENU * *"
							+ "\nType the number of the following options:"
							+ "\n [1] New User"
							+ "\n [2] Search User"
							+ "\n [3] Search Book, Newspaper or Magazine"
							+ "\n [4] Loan Book, Newspaper or Magazine"
							+ "\n [5] Verify alerts & warnings"
							+ "\n [6] Exit"
							);
					int second = getIntFromKB();
					switch (second) {
					case 1:		// New User
						System.out.println("Type a name for the new User: ");
						String name1 = getStringFromKB();
						System.out.println("then, type a code for the new User: ");
						int code1 = getIntFromKB();
						User user = new User(name1,code1); // Creates an user with the inputs
						personRepo.insert(user);
						System.out.println("New User added." );

						break;
					case 2:		// Search an User
						System.out.println("Type the code of your User: ");
						int code2 = getIntFromKB();
						try {
							// Search function to show only User type (type=1)
							User foundUser = (User) ((PersonRepo) personRepo).searchByTypes(code2, 1);
							System.out.println("\nUser found:"
									+ "\n name: " + foundUser.getName()
									+ "\n code: " + foundUser.getCode()
									+ "\n type: " + foundUser.getClass().getSimpleName());
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("\nUser not found. Error:" + e + "\n");
							//						e.printStackTrace();
						} finally {
							System.out.println("\n* * * * * * * * * * * * * * * * * * * *");
							System.out.println("Choose another options from the Menu...");
						}

						break;
					case 3:		// Search Book, Newspaper or Magazine
						System.out.println("Type the code of the desired item: ");
						int code3 = getIntFromKB();
						try {
							Collection wantedItem = (Collection) ((CollectionsRepo) itemsRepo).search(code3);
							System.out.println("Item found:"
									+ "\n type: " + wantedItem.getClass().getSimpleName()
									+ "\n title: " + wantedItem.getTitle()
									+ "\n code: " + wantedItem.getCode());
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Item not found. Error: " + e);
							//						e.printStackTrace();
						} finally {
							System.out.println("\n* * * * * * * * * * * * * * * * * * * *");
							System.out.println("Choose another options from the Menu...");
						}

						break;
					case 4:		// Loan an item from the repository
						System.out.println("First, log into your user. Type your UserCode: ");
						int code4 = getIntFromKB();
						// Tries to login
						User loanUser = null;
						try { 
							loanUser = (User) ((PersonRepo) personRepo).searchByTypes(code4, 1);	// Type = 1 because its an User only operation 
							System.out.println("User found."
									+ "\n Name: " + loanUser.getName()
									+ "\n Code: " + loanUser.getCode()
									+ "\n Type: " + loanUser.getClass().getSimpleName());
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Login fail. Error:" + e + "\n");
							break;
							//						e.printStackTrace();
						}

						// Then tries to search an item
						System.out.println("Finally, type the code of the desired item to loan: ");
						code4 = getIntFromKB();
						Collection foundItem = null;
						try {	// Verify if the search results positive
							foundItem = (Collection) ((CollectionsRepo) itemsRepo).search(code4);	// Search for the item 
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Item not found.");
							break;
						}

						if (foundItem != null) {	// If it's not null, print some item's info
							System.out.println("Item found."
									+ "\n Title: " + foundItem.getTitle()
									+ "\n Code: "  + foundItem.getCode() 
									+ "\n Quantity: " + foundItem.getQuantity()
									+ "\n Type: " + foundItem.getType());

							// The loan is possible when item's quantity > 0
							if (foundItem.getQuantity() > 0) {
								// Lower one in stock
								foundItem.setQuantity(foundItem.getQuantity() - 1);
								// Defining Date of operation:
								Calendar date = Calendar.getInstance();	// Gets date-time from the system
								// Date date = (Date) c.getTime();		// Transforms it to Date // DATE not used anymore
								// Creating a task/operation:
								LibraryOperations task1 = new Loan(loanUser, foundItem, date);
								// Adding the task to the repository of operations
								taskRepo.insert(task1);
								// Confirm the loan
								System.out.println("Loan registered."
										+ "\n Operation code: " + task1.getOperationUUID()
										+ "\n User info => Name: " + task1.getPerson().getName() + " / Code: " + task1.getPerson().getCode()
										+ "\n Item type: " + task1.getType()
										);
								System.out.println("\nLoan request completed.");
							} else System.out.println("Loan is not possible due to 'out of stock' status of the selected item.");
						} else break;
						break;
					case 5:	//	Verify alerts & warnings
						// First, search an user:
						System.out.println("Type the code of your User: ");
						code2 = getIntFromKB();
						User foundUser = null;
						try {
							// Search function to show only User type (type=1)
							foundUser = (User) ((PersonRepo) personRepo).searchByTypes(code2, 1);
							System.out.println("\nUser found:"
									+ "\n name: " + foundUser.getName()
									+ "\n code: " + foundUser.getCode()
									+ "\n type: " + foundUser.getClass().getSimpleName()
									);
							System.out.println("\n ...");
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("\nUser not found. Error:" + e + "\n");
						} 
						System.out.println("First, enter the future date information below");
						// Create a future date
						Calendar futureDate = getDateFromKB();
						// Verify if the user has returns to do
						taskRepo.verifyPendency(foundUser, taskRepo, futureDate);
						
						break;
					case 6:
						System.out.println("Logging off ...");
						loop1 = false;
						break;
					default:
						System.out.println("Unexpected value: " + getIntFromKB());
					}

				} else if (first == 2) {	// Menu for EMPLOYEE
					System.out.println("\n* * EMPLOYEE OPERATIONS BOARD * *"
							+ "\nType the number of the following options:"
							+ "\n [1] Sign up a new employee"
							+ "\n [2] Register a new item"
							+ "\n [3] Search User or Employee"
							+ "\n [4] Search Book, Newspaper or Magazine"
							+ "\n [5] Show all registered Users"
							+ "\n [6] Show all registered Items"
							+ "\n [7] Authorize Loan and proceed the Withdraw"
							+ "\n [8] Register a Return"
							+ "\n [9] Remove an registered User or Employee"
							+ "\n [10] Remove an registered Item"
							+ "\n [11] Remove an registered operation"
							+ "\n [12] Exit"
							);
					int second = getIntFromKB();
					switch (second) {
					case 1:	// Sign up a new employee
						System.out.println("Type the new Employee's name: ");
						String name1 = getStringFromKB();
						System.out.println("then, type a code: ");
						int code1 = getIntFromKB();
						Employee emp = new Employee(name1,code1); // Creates an user with the inputs
						personRepo.insert(emp);
						System.out.println("New Employee added." );
						break;
					case 2: // Register a new item
						System.out.println("\nType the new item's type:"
								+ "\n [1] - Book;"
								+ "\n [2] - Newspaper;"
								+ "\n [3] - or Magazine");
						switch (getIntFromKB()) {
						case 1:	// Book
							System.out.println("Type the title of the Book: ");
							String title1 = getStringFromKB();
							System.out.println("Type its author name: ");
							String author1 = getStringFromKB();
							System.out.println("Type its code: ");
							int bookCode1 = getIntFromKB();
							System.out.println("Type its publication year: ");
							int year1 = getIntFromKB();
							System.out.println("Type its Editor description: ");
							String desc1 = getStringFromKB();
							Book book = new Book(bookCode1, title1, year1);	// Create
							book.setAuthor(author1);
							book.setEditor(desc1);
							// Set Random quantity
							book.setQuantity((int) Math.round(Math.random()*3));
							itemsRepo.insert(book); 	// Add to item's repository
							break;
						case 2:	// Newspaper
							System.out.println("Type the title of the Newspaper: ");
							String title2 = getStringFromKB();
							System.out.println("Type its code: ");
							int npCode2 = getIntFromKB();
							System.out.println("Type its publication year: ");
							int year2 = getIntFromKB();
							Newspaper np = new Newspaper(npCode2, year2, title2);	// Create

							// Set random quantity
							np.setQuantity((int) Math.round(Math.random()*2));
							itemsRepo.insert(np); 	// Add to item's repository
							break;
						case 3:	// Magazine

							System.out.println("Type the title of the Magazine: ");
							String title3 = getStringFromKB();
							System.out.println("Type its code: ");
							int magCode3 = getIntFromKB();
							System.out.println("Type its publication year: ");
							int year3 = getIntFromKB();
							Magazine mag = new Magazine(magCode3, year3, title3);	// Create

							// Set random quantity
							mag.setQuantity((int) Math.round(Math.random()*2));
							itemsRepo.insert(mag); 	// Add to item's repository

							break;
						default:
							System.out.println("Unexpected value: " + getIntFromKB());
						}
						System.out.println("Item added. \n");

						break;
					case 3:	// Search User or Employee
						System.out.println("Type the code of your User or Employee: ");
						int code2 = getIntFromKB();

						Person foundPerson = null;
						try {	// Try find an User
							foundPerson = (Person) ((PersonRepo) personRepo).search(code2);
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("\nPerson with code = " + code2 + " not found.\n Error: " + e + "\n");
							break;
						}
						if (foundPerson != null) {
							// Shows person's info from search if it was found
							System.out.println("Person found:"
									+ "\n type: " + foundPerson.getClass().getSimpleName()
									+ "\n name: " + foundPerson.getName()
									+ "\n code: " + foundPerson.getCode()
									);
						} 

						break;
					case 4:	// Search Book, Newspaper or Magazine
						System.out.println("Type the code of the desired item: ");

						int code3 = getIntFromKB();
						try {
							Collection wantedItem = (Collection) ((CollectionsRepo) itemsRepo).search(code3);
							System.out.println("Item found:"
									+ "\n type: " + wantedItem.getClass().getSimpleName()
									+ "\n title: " + wantedItem.getTitle()
									+ "\n code: " + wantedItem.getCode()); 
							if (wantedItem.equals(null)) {
								System.out.println("Item not found.");
							}
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Item not found. Error: " + e);
						} 

						break;
					case 5:	// Show all registered Users
						System.out.println("Registered in the system: \n");
						// Verify if it's empty
						if (((PersonRepo) personRepo).list().isEmpty()) {
							System.out.println("The repository is empty.\n");
						} else {
							System.out.println(((PersonRepo) personRepo).list() + "\n");
						}

						break;
					case 6:	// Show all registered Items
						System.out.println("Registered in the system: \n");
						// Verify if it's empty
						if (((CollectionsRepo) itemsRepo).list().isEmpty()) {
							System.out.println("The repository is empty. \n");
						} else {
							System.out.println(((CollectionsRepo) itemsRepo).list() + "\n");
						}

						break;
					case 7: // Authorize Loan and proceed a withdraw
						LibraryOperations selected = null;
						if (taskRepo.list().isEmpty()) {
							System.out.println("The repository is empty. \n");
						} else {
							System.out.println("Registered operations: \n");
							System.out.println(taskRepo.list());
							System.out.println("\nSelect an operation ID, then type it:");
							String operationCode = getStringFromKB();
							try {
								selected = taskRepo.search(operationCode, 1);	// It's always a Loan, then Type = 1
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("Operation not found. Error: " + e);
								break;
							}
							// Verify if selected really find something
							if (selected != null && ((Loan) selected).getStatus().equals(false)) {
								// Defining Date of operation:
								Calendar dateWith = Calendar.getInstance();	// Gets date-time from the system
								// Date dateWith = (Date) calWith.getTime();	// Date is not used anymore
								// Creating a task/operation:
								LibraryOperations task2 = new Withdrawal(); 
								try {	// Withdrawal tentative
									task2.setPerson(((Loan) selected).getPerson());
									task2.setCollection(((Loan) selected).getCollection());
									((Withdrawal) task2).setDate(dateWith); 
									((Withdrawal) task2).setAssociatedLoanID(((Loan) selected).getOperationUUID());
									// Sets the loan status to true
									((Loan) selected).setStatus(true);
									// Adding the task to the repository of operations
									taskRepo.insert(task2);
									// Confirm the withdrawal
									System.out.println("Withdrawal info:"
											+ "\n Operation code: " + task2.getOperationUUID()
											+ "\n User info => Name: " + task2.getPerson().getName() + " / Code: " + task2.getPerson().getCode()
											+ "\n Item type: " + task2.getClass().getSimpleName()
											+ "\n Withdrawal UniqueID: " + ((Withdrawal) task2).getOperationUUID()
											+ "\n Associated Loan UniqueID: " + ((Withdrawal) task2).getAssociatedLoanID()
											);
									System.out.println("\nWithdraw request completed.");
								} catch (Exception e) {
									// TODO: handle exception
									System.out.println("Withdrawal operation fails. Error: "  + e);
								}						
							} else System.out.println("Withdrawal operation fails.");
						}

						break;
					case 8:	// 	Register a Return
						LibraryOperations selected8 = null;
						if (taskRepo.list().isEmpty()) {
							System.out.println("The repository is empty. \n");
						} else {
							System.out.println("Registered operations: \n");
							System.out.println(taskRepo.list());
							System.out.println("Paste here an Withdrawal's UniqueID to correctly register a return: ");
							String code8 = getStringFromKB();
							// Search the repository
							try {
								selected8 = taskRepo.search(code8,2);	// It's always a Withdrawal, then Type = 2
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("Operation not found. Error: " + e);
								break;
							}
							// Verify if selected really find a withdrawal without a 'true' status
							if (selected8 != null && ((Withdrawal) selected8).getStatus().equals(false)) {
								// Defining Date of operation:
								// Creating a task/operation:
								LibraryOperations task = new Return();
								try {	// Withdrawal tentative
									task.setPerson(((Withdrawal) selected8).getPerson());
									task.setCollection(((Withdrawal) selected8).getCollection());
									((Return) task).setInitialDate(((Withdrawal) selected8).getDate()); 
									((Return) task).setAssociatedWithdrawalID(((Withdrawal) selected8).getOperationUUID());
									// Calling Return's method to define the Limit Date:
									((Return) task).defineReturnDate();
									// Then set status of withdrawal to true
									((Withdrawal) selected8).setStatus(true);
									// Adding the task to the repository of operations
									taskRepo.insert(task);
									// Confirm the withdrawal
									System.out.println("\nReturn info:"
											+ "\n Operation code: " + task.getOperationUUID()
											+ "\n User info => Name: " + task.getPerson().getName() + " / Code: " + task.getPerson().getCode()
											+ "\n Item type: " + task.getType()
											+ "\n Return UniqueID: " + ((Return) task).getOperationUUID()
											+ "\n Associated Withdrawal UniqueID: " + ((Return) task).getAssociatedWithdrawalID()
											);
									System.out.println("\nReturn request completed.");
								} catch (Exception e) {
									// TODO: handle exception
									System.out.println("Return operation fails. Error: "  + e);
								}						
							} else System.out.println("Return operation fails.");
						}
						break;

					case 9:	//	Remove an registered User or Employee
						System.out.println("Type the code of an User or Employee to Remove: ");
						int code9 = getIntFromKB();
						try {
							((PersonRepo) personRepo).remove(code9);
							// If that person is not found, then it was successfully removed.
							if (((PersonRepo) personRepo).search(code9) == null) {
								System.out.println("Person successfully removed.");
							}
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Errer ocurried: " + e);
							System.out.println("Not found with this code: " + code9);
							break;
						}

						break;
					case 10: //	Remove an registered Item
						System.out.println("Type the code of an Item to Remove: ");
						int code10 = getIntFromKB();
						try {
							((CollectionsRepo) itemsRepo).remove(code10);
							System.out.println("Item successfully removed.");
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Errer ocurried: " + e);
							System.out.println("Not found an operation with this code: " + code10);
							break;
						}

						break;
					case 11: // Remove an registered operation
						if (taskRepo.list().isEmpty()) {
							System.out.println("The repository is empty. \n");
						} else {
							System.out.println("Registered operations: \n");
							System.out.println(taskRepo.list());
							System.out.println("Copy and paste here the UniqueID of an Operation to Remove it: ");
							String code11 = getStringFromKB();
							System.out.println("Then, select the type of operation to remove: ");
							int code11int = getIntFromKB();
							// Then tries to remove it
							try {
								// search the desired operation
								LibraryOperations found = taskRepo.search(code11, code11int);
								switch (found.getType()) {
								case 2:	// If it's a withdrawal
									// Show the operation datails:
									((Withdrawal) found).toString();
									// Search to find the respective loan
									LibraryOperations respective = taskRepo.search(((Withdrawal) found).getAssociatedLoanID().toString(), 1);
									// Deleting it will make the respective loan status = FALSE
									((Loan) respective).setStatus(false);
									break;
								case 3:
									// Show the operations datails
									((Return) found).toString();
									// Search to find the respective loan
									respective = taskRepo.search(((Return) found).getAssociatedWithdrawalID().toString(), 2);
									// Deleting it will make the respective withdrawal status = FALSE
									((Withdrawal) respective).setStatus(false);
									break;
								default:	// Nothing happens
									break;
								}
								// Finally, removes it

								taskRepo.remove(code11, code11int);
								System.out.println("Operation successfully removed.");
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("Errer ocurried: " + e);
								System.out.println("Not found an operation with this code: " + code11);
								break;
							}
						}
						break;

					case 12:	// Exit = log off
						System.out.println("Logging off ...");
						loop1 = false;
						break;

					default:
						System.out.println("Unexpected value: " + getIntFromKB());
						break;
					}
				} else {
					loop1 = false;
					loop2 = false;
					System.out.println("System closed. Thanks for visiting the New Hope Library.");
				}
			} 
		}
		sc.close(); // Closes the open scanner
	}

	// AUXILIARY METHODS

	public static int getIntFromKB() {
		// Method to substitute scanner.nextInt() with some exception dealing.
		Scanner sc = new Scanner(System.in);
		boolean verify = true;
		int intVariable = 0;
		while (verify) {
			try {
				intVariable = Integer.parseInt(sc.next());
				verify = false;			// If try works well, the loop is over
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error: " + e + "\nUnexpected value: `" + sc.next() + "`. Input must be an integer. Try again.");
			}
		}
		//		sc.close();
		return intVariable;
	}

	public static String getStringFromKB() {
		// Method to substitute scanner.next() with some exception dealing.
		Scanner sc = new Scanner(System.in);
		boolean verify = true;
		String variable = null;
		while (verify) {
			try {
				variable = sc.nextLine();
				verify = false;			// If try works well, the loop is over
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error: " + e + "\nUnexpected value: `" + sc.nextLine() + "`. Try again.");
			}
		}
		//		sc.close();
		return variable;
	}

	public static Calendar getDateFromKB() {

		Calendar date = Calendar.getInstance();
		System.out.println("Type the DAY number: (Ex.: 1-30) ");
		int integerInput = getIntFromKB();
		// Sets it to DAY in calendar:
		date.set(Calendar.DAY_OF_MONTH, integerInput);
		System.out.println("Type the MONTH number: (Ex.: 1-12) ");
		integerInput = getIntFromKB() - 1;
		// Sets it to MONTH calendar
		date.set(Calendar.MONTH, integerInput);
		System.out.println("Type the YEAR number: (Ex.: 2019) ");
		integerInput = getIntFromKB();
		// Sets it to MONTH calendar
		date.set(Calendar.YEAR, integerInput);

		return date;
	}
}
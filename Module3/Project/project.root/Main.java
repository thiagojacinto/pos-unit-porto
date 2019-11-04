package activity15.root;

import java.util.Scanner;
import java.util.Timer;

import activity15.contentMangement.CollectionsRepo;
import activity15.contentMangement.RepositoryOfCollections;
import activity15.loansManagement.OperationsRepo;
import activity15.peopleManagement.Employee;
import activity15.peopleManagement.PersonRepo;
import activity15.peopleManagement.RepositoryOfPersons;
import activity15.peopleManagement.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Repositories
		RepositoryOfPersons repoP = new PersonRepo();
		RepositoryOfCollections repoCol = new CollectionsRepo();
		OperationsRepo repoOper = new OperationsRepo();
		Scanner sc = new Scanner(System.in);
		Timer tick = new Timer();
		
//		// --- Testing User, UserRepo, etc
//		System.out.println("Insert an user");	// Create an User
//		User tUser = new User("Thiago", 389292);
//		tUser.setRepo(repo);
//
//		System.out.println("User added:" +
//							"\n name: " + tUser.getName() +
//							"\n code: " + tUser.getCode()
//							);
//		tUser.register();
//		
//		Employee emp = new Employee("Victor", 19823);	// Create an Employee
//		System.out.println("Employee added:" +
//				"\n name: " + emp.getName() +
//				"\n code: " + emp.getCode()
//				);
//		emp.setRepo(repo);
//		emp.register();
//		System.out.println(tUser.listRepo());
		
		System.out.println("* - * - * - * - * - * -* - * - * "
						+ "\n Welcome to New Hope Library \n"
					    + "       .--.                   .---.\r\n" + 
					    "   .---|__|           .-.     |~~~|\r\n" + 
					    ".--|===|--|_          |_|     |~~~|--.\r\n" + 
					    "|  |===|  |'\\     .---!~|  .--|   |--|\r\n" + 
					    "|TJ|   |  |.'\\    |===| |--|19|   |  |\r\n" + 
					    "|SS|   |  |\\.'\\   |   | |__|  |   |  |\r\n" + 
					    "|  |   |  | \\  \\  |===| |==|  |   |  |\r\n" + 
					    "|  |   |__|  \\.'\\ |   |_|__|  |~~~|__|\r\n" + 
					    "|  |===|--|   \\.'\\|===|~|--|84|~~~|--|\r\n" + 
					    "^--^---'--^    `-'`---^-^--^--^---'--'"
						+ "\n* - * - * - * - * - * -* - * - * ");
		
		// Login prompt
		System.out.println("LOG IN:"
							+ "\n > User - Type 1"
							+ "\n > Employee - Type 2");
		int first = sc.nextInt();
		// 
		while (first != 1 && first != 2) {
			System.err.println("Wrong option, try again.");
			first = sc.nextInt();
		}
		
		// Menu 1 loop
		boolean loop1 = true;
		while (loop1) {
			if (first == 1) { // Choose 'user'
				System.out.println("* * USER MENU * *"
						+ "\n New User - Type 1"
						+ "\n Search User - Type 2"
						+ "\n Search Book, Newspaper or Magazine - Type 3"
						+ "\n Loan Book, Newspaper or Magazine - Type 4"
						+ "\n Exit - Type 5"
						);
				int second = sc.nextInt();
				switch (second) {
				case 1:		// New User
					System.out.println("Creating a new user...");
					System.out.println("Type a name for the new User: ");
					String name1 = sc.next();
					System.out.println("then, type a code for the new User: ");
					int code1 = sc.nextInt();
					User user = new User(name1,code1); // Creates an user with the inputs

					break;
				case 2:		// Search an User
					System.out.println("Type the code of your User: ");
					int code2 = sc.nextInt();
					try {
						User foundUser = (User) ((PersonRepo) repoP).search(code2);
						System.out.println("User found:"
								+ "\n  name: " + foundUser.getName()
								+ "\n code: " + foundUser.getCode());
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("User not found.");
					}
					
					break;
				case 3:

					break;
				case 4:

					break;
				case 5:
					System.out.println("");
					break;
				default:
					break;
				}
			}
		}
		sc.close(); // Closes the open scanner
	}

}

package project.com.operationsManagement;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import project.com.peopleManagement.Person;


public class OperationsRepo {
	// ATTRIBUTES
	private List<LibraryOperations> operationRepo;

	// CONSTRUCTOR
	public OperationsRepo() {
		// TODO Auto-generated constructor stub
		operationRepo = new ArrayList<LibraryOperations>();
	}

	// METHODS 

	public void insert(LibraryOperations a) {
		// TODO Auto-generated method stub
		operationRepo.add(a);
	}

	private List<LibraryOperations> listReturnsByUser(Person user) {
		List<LibraryOperations> returnsList = new ArrayList<LibraryOperations>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	// Format exhibition of Calendar instances
		int i = 0;	// operation counter
		for (LibraryOperations operation : operationRepo) {
			// Verify if the input 'user' matches the operation's user:
			if (operation.getPerson().equals(user) && operation.getType() == 3) {
				// Type = 3 identifies that only return a 'Return' operation
				returnsList.add(operation);
				System.out.println(
						"\n[Return " + i + "] ->" 
								+ " Unique ID = " + ((Return) operation).getOperationUUID()
								+ ", Item = " + ((Return) operation).getCollection()
								+ ", Return date = " + sdf.format(((Return) operation).getLimitDate().getTime())
								+ ", Already returned? " + ((Return) operation).getIsReturned()
						);
				i++;
			}
		}
		return returnsList;
	}

	public void verifyPendency(Person user, OperationsRepo repo, Calendar futureDate) {
		// Gets info from 'listReturnsByUser'
		List<LibraryOperations> list = repo.listReturnsByUser(user);
		// if that list is NOT empty
		if (!list.isEmpty()) {
			for (LibraryOperations operation : list) {
				if (!((Return) operation).getIsReturned()) {
					System.out.println(	"\nFor this " + operation.getClass().getSimpleName() 
							+ " / id: "  + ((Return) operation).getOperationUUID()
							+ "\n > Days: " + ((Return) operation).calculateDelay(futureDate)
							+ "\n > Fee (R$):  " + ((Return) operation).calculateLateFees(futureDate)
							);
					// Change 'isReturned' value to 'true'
					((Return) operation).setIsReturned(true);
					System.out.println("This " 
							+ operation.getCollection().getClass().getSimpleName()
							+ " has been returned."
							);
					// then add one to item quantity
					operation.getCollection().setQuantity(operation.getCollection().getQuantity() + 1);
				}
			}
		} else System.out.println("There's no return registered attached with this user.");
	}

	public LibraryOperations search(String operationCode, int operationType) {
		// TODO Auto-generated method stub
		LibraryOperations wanted = null;
		for (LibraryOperations operation : operationRepo) {
			if (operation.getOperationUUID().equals(UUID.fromString(operationCode)) 
					&& operation.getType() == operationType) {	// The type constrain is for do that only for LOANS
				wanted = operation;
			} //else System.err.println("Not found in the repository. \n");
		}
		return wanted;
	}

	public void remove(String operationCode, int operationType) {
		// TODO Auto-generated method stub
		LibraryOperations operation = this.search(operationCode, operationType);
		if (operation != null) {
			operationRepo.remove(operation);
		}
	}

	// To show the list
	public List<LibraryOperations> list() {
		// TODO Auto-generated method stub
		return this.operationRepo;
	}
}

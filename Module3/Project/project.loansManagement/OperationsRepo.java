package activity15.loansManagement;

import java.util.ArrayList;
import java.util.List;


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

	
	public LibraryOperations search(LibraryOperations a) {
		// TODO Auto-generated method stub
		LibraryOperations wanted = null;
		for (LibraryOperations operations : operationRepo) {
			if (operations.equals(a)) {
				wanted = a;
			} else System.err.println("Not found in the repository. \n");
		}
		return wanted;
	}

	
	public void remove(LibraryOperations lib) {
		// TODO Auto-generated method stub
		operationRepo.remove(lib);
	}
	
	// To show the list
	public List<LibraryOperations> list() {
		// TODO Auto-generated method stub
		return this.operationRepo;
	}
}

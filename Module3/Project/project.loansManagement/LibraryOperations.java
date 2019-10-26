package activity15.loansManagement;

import activity15.contentMangement.Collection;
import activity15.peopleManagement.User;

public abstract class LibraryOperations {
	// ATTRIBUTES
	private User user;
	private Collection collection;
	
	private int type; // 1=Loan, 2=Withdrawal
	
	// CONSTRUCTOR
	public LibraryOperations() {};

	public LibraryOperations(User user,Collection repo) {
		this.user = user;
		this.collection = repo;
		
	}
	
	// METHODS
	
	public abstract void register();
	
	// GETTERS AND SETTERS

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Collection getCollection() {
		return collection;
	}

	public void setCollection(Collection collection) {
		this.collection = collection;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
}

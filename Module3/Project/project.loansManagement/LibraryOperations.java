package project.com.operationsManagement;

import java.util.UUID;

import project.com.contentManagement.Collection;
import project.com.peopleManagement.Person;

public abstract class LibraryOperations {
	// ATTRIBUTES
	private Person person;
	private Collection collection;
	private UUID operationUUID = UUID.randomUUID();		// Randomizes an unique ID for every operation;
	private int type; // 1=Loan, 2=Withdrawal, 3=Return
	
	// CONSTRUCTOR
	public LibraryOperations() {};

	public LibraryOperations(Person person,Collection repo) {
		this.person = person;
		this.collection = repo;
	}
	
	
	// GETTERS AND SETTERS

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
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
	
	public UUID getOperationUUID() {
		return operationUUID;
	}
	
	
}

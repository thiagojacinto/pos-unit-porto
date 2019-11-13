package project.com.operationsManagement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

import project.com.contentManagement.Collection;
import project.com.peopleManagement.Person;

public class Withdrawal extends LibraryOperations {

	// ATTRIBUTES
	Calendar date;
	Boolean status = false;
	UUID associatedLoanID; 

	// CONSTRUCTOR
	public Withdrawal() {
		this.setType(2);	// Type of Withdrawal
	};

	public Withdrawal(Person user, Collection item, Calendar date, UUID loanID) {
		super(user, item);
		this.date = date;
		this.setType(2);	// Type of Withdrawal
		this.setAssociatedLoanID(loanID);
	}

	
	// GETTERS AND SETTERS
	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public UUID getAssociatedLoanID() {
		return associatedLoanID;
	}
	
	public void setAssociatedLoanID(UUID associatedLoanID) {
		this.associatedLoanID = associatedLoanID;
	}
	// toString
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	// Format exhibition of Calendar instances
		return "[Withdrawal date = " + sdf.format(date.getTime()) 
				+ ", Status = " + status 
				+ ", User = " + getPerson() 
				+ ", Operation type = " + getType()
				+ ", UniqueID = " + getOperationUUID() 
				+ ", Loan UniqueID = " + getAssociatedLoanID() 
				+ " ]\n";
	}

}

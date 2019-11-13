package project.com.operationsManagement;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import project.com.contentManagement.Collection;
import project.com.peopleManagement.Person;

public class Loan extends LibraryOperations {
	// ATTRIBUTES
	private Calendar date;
	private Boolean withdrawStatus = false;
	
	// CONSTRUCTOR
	public Loan() {
		this.setType(1);	// Type of loan
	};
	
	public Loan(Person user, Collection item, Calendar date) {
		super(user, item);
		this.date = date;
		this.setType(1);	// Type of loan
	}

	// GETTERS AND SETTERS
	
	public Boolean getStatus() {
		return withdrawStatus;
	}

	public void setStatus(Boolean status) {
		this.withdrawStatus = status;
	}
	
	public Calendar getDate() {
		return date;
	}

	public void Calendar (Calendar date) {
		this.date = date;
	}


	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	// Format exhibition of Calendar instances
		
		return "[Loan date = " + sdf.format(date.getTime())
				+ ", Status = " + withdrawStatus 
				+ ", User = " + getPerson() 
				+ ", Operation type = " + getType()
				+ ", UniqueID = " + getOperationUUID() 
				+ " ]\n";
	}
}

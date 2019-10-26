package activity15.loansManagement;

import java.util.Date;

import activity15.contentMangement.Collection;
import activity15.peopleManagement.User;

public class Loan extends LibraryOperations {
	// ATTRIBUTES
	Date date;
	Boolean status = false;
	
	// CONSTRUCTOR
	public Loan() {
		this.setType(1);	// Type of loan
	};
	
	public Loan(User user,Collection repo, Date date) {
		super(user, repo);
		this.date = date;
		this.setType(1);	// Type of loan
	}

	// GETTERS AND SETTERS
	
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
		
	// METHODS
	
	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}
	
}

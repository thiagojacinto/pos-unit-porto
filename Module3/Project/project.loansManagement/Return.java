package project.com.operationsManagement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

import project.com.contentManagement.Collection;
import project.com.peopleManagement.Person;

public class Return extends LibraryOperations {
	// ATTRIBUTES
	private Calendar initialDate;
	private Calendar limitDate;
	private Boolean isReturned = false;
	private UUID associatedWithdrawalID;
	

	// CONSTRUCTOR
	public Return() {
		this.setType(3);	// Type of Return
	};

	public Return(Person user, Collection item, Calendar initialDate) {
		super(user, item);
		this.initialDate = initialDate;
		this.setType(3);	// Type of Return
		this.defineReturnDate();
	}

	// METHODS
	
	// Set a limit date to return the item:
	public void defineReturnDate() {
		// The initial date will be from the instantiated class Return
		// Limit will be ONE month from Initial Date.
		Calendar limit = this.getInitialDate();
		limit.add(Calendar.MONTH, 1);	// Added ONE MONTH
		this.setLimitDate(limit);		// Then sets 'limitDate'
	}
	
	public long calculateDelay(Calendar future) {
		
		// Method 1 - DO NOT WORK
//		Duration duration = Duration.between(	// Calculates difference between time
//				this.getLimitDate().toInstant(),// from limit	(converted to Instant)
//				future.toInstant()				// to passed 'future' (also converted to Instant)
//			);
		// return duration.toDays();
		
		// Method 2 - DO NOT WORK
//		Temporal first	= (Temporal) this.getLimitDate().toInstant();
//		Temporal last 	= (Temporal) future.toInstant();
//		return ChronoUnit.DAYS.between(first, last);
		
		// Method 3 - NOT YET
//		return (	// Day-of-LimitDate MINUS Day-of-input-'future'
//				this.getLimitDate().get(Calendar.DAY_OF_MONTH)
//				- future.get(Calendar.DAY_OF_MONTH)
//			);
		
		// Method 4 - NOT WORK EITHER
//		long days = this.getLimitDate().get(Calendar.DAY_OF_MONTH)
//				- future.get(Calendar.DAY_OF_MONTH);
//		System.out.println("Days = " + days);
//		long months = this.getLimitDate().get(Calendar.MONTH) 
//				- future.get(Calendar.MONTH);
//		System.out.println("Months = " + months);
//		long years = this.getLimitDate().get(Calendar.YEAR) 
//				- future.get(Calendar.YEAR);
//		System.out.println("years = " + years);
//		return -(years*365 + months*30 + days);
		
		// Method 5 - Fully functional, finally
//		System.out.println("Day now = " + this.limitDate.get(Calendar.DAY_OF_YEAR));
//		System.out.println("Day fut = " + future.get(Calendar.DAY_OF_YEAR));
		long years = this.limitDate.get(Calendar.YEAR) 
				- future.get(Calendar.YEAR);
//		System.out.println("Year now = " + this.limitDate.get(Calendar.YEAR));
//		System.out.println("Year fut = " + future.get(Calendar.YEAR));
		return Math.abs(years*365 + this.limitDate.get(Calendar.DAY_OF_YEAR)
				- future.get(Calendar.DAY_OF_YEAR));
		

	}
	
	public float calculateLateFees(Calendar future) {
		// Days definition
		long limitPeriod = 15;
		long duration = this.calculateDelay(future);
		// Fees definition
		float feePerDay = 0.80f;	// Fee = R$ 0,80 by day
		float fee = 0;
		// Only if duration is greater than limit period, will calculate fees 
		if (duration > limitPeriod) {
			fee = (duration - limitPeriod) * feePerDay;
		}
		
		return fee;
	}

	// GETTERS AND SETTERS

	public Calendar getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Calendar initialDate) {
		this.initialDate = initialDate;
	}
	
	public Calendar getLimitDate() {
		return limitDate;
	}
	
	public void setLimitDate(Calendar limitDate) {
		this.limitDate = limitDate;
	}
	
	public Boolean getIsReturned() {
		return isReturned;
	}

	public void setIsReturned(Boolean isReturned) {
		this.isReturned = isReturned;
	}

	public UUID getAssociatedWithdrawalID() {
		return associatedWithdrawalID;
	}

	public void setAssociatedWithdrawalID(UUID associatedWithdrawalID) {
		this.associatedWithdrawalID = associatedWithdrawalID;
	}

	// TO STRING
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	// Format exhibition of Calendar instances
		
		return "[Return Initial date = " + sdf.format(initialDate.getTime())
				+ ", Limit date = " + sdf.format(limitDate.getTime())
				+ ", Returned = " + isReturned 
				+ ", User = " + getPerson() 
				+ ", Operation type = " + getType()
				+ ", UniqueID = " + getOperationUUID()
				+ ", Associated W. ID = " + getAssociatedWithdrawalID()
				+ " ]\n";
	}
}
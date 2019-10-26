package activity15.contentMangement;

import java.util.ArrayList;

public class Item extends Book{
	
	// ATTRIBUTES
	private int quantity;
	private Boolean active;
	private String withdrawalMotive;
	private ArrayList<Item> numOfItems;
	
	// CONSTRUCTOR
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int c, String title, int pubY) {
		super(c, title, pubY);
		// TODO Auto-generated constructor stub
	}
	
	// METHODS
	public void add() {
		numOfItems.add(this);
	}
	
	public void loaned(String motive) {
		this.quantity--;
		this.withdrawalMotive = motive;
	}
	
	// GETTERS AND SETTERS
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getWithdrawalMotive() {
		return withdrawalMotive;
	}
	public void setWithdrawalMotive(String withdrawalMotive) {
		this.withdrawalMotive = withdrawalMotive;
	}
	public ArrayList<Item> getNumOfItems() {
		return numOfItems;
	}
	public void setNumOfItems(ArrayList<Item> numOfItems) {
		this.numOfItems = numOfItems;
	}
	
}

package entities;

import java.util.ArrayList;

public class Order {
	// ATTRIBUTES
	int id;
	Client client;
//	Foodstuffs breakfest;
//	Foodstuffs appetizers;
//	Foodstuffs principal;
//	Foodstuffs dessert;
	ArrayList<Foodstuffs> ItensOrdered = new ArrayList<Foodstuffs>();
	float value;
	
	// METHODS
	
	public void add(Foodstuffs food) {
		ItensOrdered.add(food);	
		System.out.println(food.getDescription() + " added.");
	}
	
	public void remove(Foodstuffs food) {
		ItensOrdered.remove(food);
	}
	
	public int getOrdersSize() {
		// Shows the length of order's array
		return ItensOrdered.size();
	}
	
	public void showOrders() {
		// Shows the items of 'ItensOrdered's array
		for (int i = 0; i < ItensOrdered.size(); i++) {
			System.out.println("[" + i + "] " + ItensOrdered.get(i));
		}
	}
	
	public void setId() {
		// Randomly generate 
		double rand = Math.random()*1000;
		rand = Math.round(rand);
		this.id = (int) rand;
		System.out.println("Client:"+ client.getName() + "\nOrder N.: " + this.getId());
	}
	// Setters and Getters
	
	public final int getId() {
		return id;
	}
	public final Client getClient() {
		return client;
	}
	public final ArrayList<Foodstuffs> getItensOrdered() {
		return ItensOrdered;
	}
	public final float getValue() {
		return value;
	}
	
	public final void setClient(Client client) {
		this.client = client;
	}
	public final void setItensOrdered(ArrayList<Foodstuffs> itensOrdered) {
		ItensOrdered = itensOrdered;
	}
	public final void setValue(float value) {
		this.value = value;
	}
}

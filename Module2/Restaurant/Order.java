package entities;

import java.util.ArrayList;

public class Order {
	// ATTRIBUTES
	int id;
	Client client;
	//		Foodstuffs breakfest;
	//		Foodstuffs appetizers;
	//		Foodstuffs principal;
	//		Foodstuffs dessert;
	ArrayList<Foodstuffs> ItensOrdered = new ArrayList<Foodstuffs>();
	float value = 0;
	String paymentMethodString;

	// METHODS

	public void add(Foodstuffs food) {
		ItensOrdered.add(food);	
		System.out.println(food.getDescription() + " added.");
	}

	public void remove(Foodstuffs food) {
		ItensOrdered.remove(food);
	}

	public void remove(int index) {
		ItensOrdered.remove(ItensOrdered.get(index));
		// Calls showOrders()
		System.out.println("Your order now is: ");
		showOrders();
	}

	public int getOrdersSize() {
		// Shows the length of order's array
		return ItensOrdered.size();
	}

	public void showOrders() {
		// 1) Shows the items of 'ItensOrdered's array
		// 2) Sums the order total cost
		if (ItensOrdered.size() == 0) {
			System.out.println("You didn't order anything.");
		} else {
			float totalCost = 0f;
			for (int i = 0; i < ItensOrdered.size(); i++) { // 1
				System.out.println("[" + i + "] " + ItensOrdered.get(i).getDescription()
						+ " / Cost $: " + ItensOrdered.get(i).getPrice());
				totalCost += ItensOrdered.get(i).getPrice();
//				this.value += ItensOrdered.get(i).getPrice();
			}
			System.out.println("- - - - Total Cost $: " + totalCost);
			setValue(totalCost);
		}
	}
	// Setters and Getters
	public void setId() {
		// Randomly generate 
		double rand = Math.random()*1000;
		rand = Math.round(rand);
		this.id = (int) rand;
		System.out.println(" |= Client: "+ client.getName() + "\n |= Order N.: " + this.getId());
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethodString = paymentMethod;
	}

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
	protected final void setValue(float value) {
		this.value = value;
	}

	@Override
	public String toString() { 
		return "- - - Reciept - - - " + "\nOrder id: " + id + "\nClient: " + client.getName() + "\nValue = " + value
				+ "\nPayment method: " + paymentMethodString;
	}
	
	
}

package br.unit.module4.activity05;

public class Main {
	public static void main(String[] args) {
		// Instantiate
		List listA = new List();
		// Then use a list method to create
		listA.createList();
		//		// Create a knot
		//		Knot knotA = new Knot();
		// Add knots to the list
		listA.add(1);
		listA.add(2);
		listA.add(3);
		listA.add(4);
		// Adding a significant number of knots
		int BIGGER_NUMBER_OF_KNOTS = 20;
		for (int i = 5; i < BIGGER_NUMBER_OF_KNOTS; i++) {
			listA.add(i);
		}
		
		// Show elements of the list
		listA.showElements();
		
		// Count list elements
		System.out.println("N. of elements in this list: " + listA.countElements());
		
		// Show elements in inverse order
		listA.showElementsInverse();
	}
}

package br.unit.module4.activity05;

public class List {
	// ATTRIBUTES
	private Nodo primitiveKnot;
	private int numOfElements = 0;

	// CONSTRCUTOR
	public List() {
		// TODO Auto-generated constructor stub
	}

	// METHODS
	public void createList() {
		primitiveKnot = null;
	}
	
	/*
	 * Add at beginning
	 */
	public void add(int i) {
		Nodo newKnot = new Nodo();
		newKnot.setInfo(i);
		newKnot.setNextNodo(primitiveKnot);
		primitiveKnot = newKnot;
	}
	
	/*
	 * Show all list elements
	 */
	public void showElements() {
		Nodo k = primitiveKnot;
		while (k != null) {
			System.out.println(k);
			k = k.getNextNodo();
		}
	}
	
	/*
	 * Show elements by in inverse order
	 */
	public void showElementsInverse() {
		Nodo k = primitiveKnot;
		
		List auxList = new List();
		while (k != null) {
			auxList.add(k.getInfo());
			k = k.getNextNodo();
		}
		auxList.showElements();
	}
	
	/*
	 * Counting list elements
	 */
	public int countElements() {
		Nodo k = primitiveKnot;
		while (k != null) {
			numOfElements++;
			k = k.getNextNodo();
		}
		return numOfElements;
	}
}

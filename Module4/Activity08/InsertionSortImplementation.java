package br.unit.module4.activity08;


public class InsertionSortImplementation {
	public static void main(String[] args) {
		// Create a list
		int[] list1 = new int[5];
		// Populate it with random numbers
		for (int i = 0; i < list1.length; i++) {
			list1[i] = (int) Math.round(Math.random()*100);
		}
		// Show that list
		
		String listString = "[";
		for (int i = 0; i < list1.length; i++) {
			listString += " " + list1[i];
		}
		listString += " ]";
		System.out.println(listString);

		// Create a bubble sort with that list
		InsertionSort i1 = new InsertionSort(list1);
		// Now order it with Bubble Sort
		i1.sort();
		// Print it
		System.out.println(i1.showVector());
	}
}

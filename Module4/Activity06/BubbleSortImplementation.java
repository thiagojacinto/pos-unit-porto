package br.unit.module4.activity06;

public class BubbleSortImplementation {
	public static void main(String[] args) {
		// Create a list
		int[] list1 = new int[5];
		// Populate it with random numbers
		for (int i = 0; i < list1.length; i++) {
			list1[i] = (int) Math.round(Math.random()*100);
		}
		// Show that list
//		System.out.println(list1);
		String listString = "[";
		for (int i = 0; i < list1.length; i++) {
			listString += " " + list1[i];
		}
		listString += " ]";
		System.out.println(listString);
		
		// Create a bubble sort with that list
		BubbleSort b1 = new BubbleSort(list1);
		// Now order it with Bubble Sort
		b1.sort();
		// Print it
		System.out.println(b1.showVector());
	}
}

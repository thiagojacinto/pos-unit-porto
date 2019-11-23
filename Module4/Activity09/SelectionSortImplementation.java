package br.unit.module4.activity09;

import java.util.Scanner;

public class SelectionSortImplementation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Create a list

		System.out.println("How long the vector will be?");
		int[] list1 = new int[sc.nextInt()];

		long start = System.currentTimeMillis();
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

		// Create a Selection sort with that list
		SelectionSort s1 = new SelectionSort(list1);
		// Now order it with Selection Sort
		s1.sort();
		// Print it
		System.out.println(s1.showVector());
		// Print how many changes were necessary
		System.out.println("N. of changes = " + s1.getChanges());

		sc.close();
		// Time elapsed counting
		long finish = System.currentTimeMillis();
		System.out.println("Time elapsed = " + (finish - start));
	}
}

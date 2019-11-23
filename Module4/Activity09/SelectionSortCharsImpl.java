package br.unit.module4.activity09;

import java.util.Random;
import java.util.Scanner;

public class SelectionSortCharsImpl {

	public static void main(String[] args) {

		// Random class
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		// Create a list

		System.out.println("How long the vector will be?");
		char[] list1 = new char[sc.nextInt()];

		long start = System.currentTimeMillis();
		// Populate it with random numbers
		for (int i = 0; i < list1.length; i++) {
			list1[i] = (char) (random.nextInt(25) + 65);
		}

		// Show that list BEFORE ordering
		String listString = "[";
		for (int i = 0; i < list1.length; i++) {
			listString += " " + list1[i];
		}
		listString += " ]";
		System.out.println(listString);

		// Create a Selection sort with that list
		SelectionSortChar s1 = new SelectionSortChar(list1);
		// Now order it with Selection Sort
		s1.sort();
		// Print it
		System.out.println(s1.showVector());
		// Print how many changes were necessary
		System.out.println("N. of changes = " + s1.getChanges());


		sc.close(); 	// Closes scanner
		// Time elapsed counting
		long finish = System.currentTimeMillis();
		System.out.println("Time elapsed = " + (finish - start));
	}
}

package br.unit.module4.activity08;

import java.util.Scanner;

import br.unit.module4.activity06.BubbleSort;

public class InsertionVSBubble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Create a list

		System.out.println("How long the list will be?");
		int[] list1 = new int[sc.nextInt()];
		int[] list2 = new int[list1.length];


		// Populate it with random numbers
		for (int i = 0; i < list1.length; i++) {
			list1[i] = (int) Math.round(Math.random()*400);
			// Created a copy of list1, because sorting is altering
			list2[i] = list1[i];
		}
		
		// Show that list

		String listString = "[";
		for (int i = 0; i < list1.length; i++) {
			listString += " " + list1[i];
		}
		listString += " ]";
		System.out.println(listString);

		long startInsertion = System.currentTimeMillis();
		// Create a insertion sort with that list
		InsertionSort i1 = new InsertionSort(list1);
		// Now order it with Insertion Sort
		i1.sort();
		// Print it
		System.out.println("\nInsertion: ");
		System.out.println(i1.showVector()
				+ "\n N. of changes: "
				+ i1.getChanges()
				);
		// Elapsed time
		long finishInsertion = System.currentTimeMillis();
		long elapsed = finishInsertion - startInsertion;
		System.out.println("Elapsed time in " + i1.getClass().getSimpleName() + ": " + elapsed + " milliseconds.");

		long startBubble = System.currentTimeMillis();
		// Create a bubble sort with that list
		BubbleSort b1 = new BubbleSort(list2);
		// Now order it with Bubble Sort
		b1.sort();
		// Print it
		System.out.println("\nBubble: ");
		System.out.println(b1.showVector()
				+ "\n N. of changes: "
				+ b1.getChanges()
				);

		// Elapsed time
		long finishBubble = System.currentTimeMillis();
		elapsed = finishBubble - startBubble;
		System.out.println("Elapsed time in " 
					+ b1.getClass().getSimpleName() + ": " 
				+ elapsed + " milliseconds."
				);
		
		// Verification of answers
		System.out.println("Are the two solutions equals? "
						+ b1.getVector().equals(i1.getVector())
					);
		
		// Closes scanner
		sc.close();
	}
}

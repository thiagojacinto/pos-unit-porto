package br.unit.module4.review;

import java.util.Scanner;

public class Review05 {
	// Prints all numbers until 1 million, only if it's even and multiple of 3
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Type an initial number: ");
		int x = sc.nextInt();
		int times = 0;

		// constant handling
		final long MAX_NUMBER = 1000000;

		// Starts measuring time
		long start1 = System.currentTimeMillis();
		for (int i = x; i < MAX_NUMBER; i++) {
			if (i % 2 != 0 && i % 3 == 0) {
				System.out.println("i = " + i + " is a valid number.");
				times++;
			}
		}
		// Finishes measuring time
		long finish1 = System.currentTimeMillis();
		System.out.println(
				"\nThe program found " 
						+ times + " occurrences, in "
						+ (finish1 - start1) + " milliseconds."
				);


		// Method 2 - while
		// Starts measuring time
		long start2 = System.currentTimeMillis();
		int i = 0;
		while (i < MAX_NUMBER) {
			if (i % 2 != 0 && i % 3 == 0) {
				System.out.println("i = " + i + " is a valid number.");
				times++;
			}
			i++;
		}
		// Finishes measuring time
		long finish2 = System.currentTimeMillis();
		// Results method 1
		System.out.println(
				"\nMethod 1: "
						+ "\nThe program found " 
						+ times + " occurrences, in "
						+ (finish1 - start1) + " milliseconds."
				);
		// Results method 2
		System.out.println(
				"\nMethod 2: "
						+"\nThe program found " 
						+ times + " occurrences, in "
						+ (finish2 - start2) + " milliseconds."
				);
		System.out.println("\n PERFORMANCE: (M1/M2) = " 
				+ ((double) (finish1 - start1)/((double) (finish2 - start2)))
				);
		sc.close();
	}
}

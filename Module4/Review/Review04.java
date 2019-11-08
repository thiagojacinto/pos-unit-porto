package br.unit.module4.review;

import java.util.Scanner;

public class Review04 {
	// Reads a number and verify if it's even and multiple of 3
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int x = sc.nextInt();
		
		// Verify
		if (x % 2 != 0) {		// If its even
			if (x % 3 == 0) {	// If its multiple of 3
				System.out.println("Valid nunumber");
			} else {
				System.out.println("NOT valid nunumber");
			}
		} else {
			System.out.println("NOT valid nunumber");
		}
		sc.close();
	}
}

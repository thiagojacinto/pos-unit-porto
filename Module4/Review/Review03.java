package br.unit.module4.review;

import java.util.Scanner;

public class Review03 {
	// Get and change variables values

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int x = sc.nextInt();
		System.out.println("Then type another number: ");
		int y = sc.nextInt();
		// Return intial values
		System.out.println(
					"Initial values:\n"
				+	"x = " + x
				+	"\ny = " + y
				);
		// Swapping
		int aux = x;
		x = y;
		y = aux;
		// Return swapped values
		System.out.println(
				"Final values:\n"
			+	"x = " + x
			+	"\ny = " + y
				);
		
	}
}

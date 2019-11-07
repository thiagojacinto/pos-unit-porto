package br.unit.module4.review;

import java.util.Scanner;

public class Review02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int n1 = sc.nextInt();
		System.out.println("Then type another number: ");
		int n2 = sc.nextInt();
		
		// Method 1
		System.out.println("Method 1\n");
		if (n1 > n2) {
			System.out.println("The bigger is: " + n1);
			System.out.println(n1 + " is bigger than " + n2);
		} else if (n2 > n1) {
			System.out.println("The bigger is: " + n2);
			System.out.println(n2 + " is bigger than " + n1);
		} else {
			System.out.println(n1 + " and " + n2 + " are equal.");
		}
		
		// Method 2 - block inside block
		System.out.println("Method 2\n");
		if (n1 > n2) {
			System.out.println("The bigger is: " + n1);
			System.out.println(n1 + " is bigger than " + n2);
		} else {
			if (n2 > n1) {
				System.out.println("The bigger is: " + n2);
				System.out.println(n2 + " is bigger than " + n1);
			} else {
				System.out.println(n1 + " and " + n2 + " are equal.");
			}
		}
		sc.close();
	}
}

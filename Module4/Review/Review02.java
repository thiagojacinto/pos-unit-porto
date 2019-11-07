package br.unit.module4.review02;

import java.util.Scanner;

public class Review02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int n1 = sc.nextInt();
		System.out.println("Then type another number: ");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("The bigger is: " + n1);
			System.out.println(n1 + " is bigger than " + n2);
		} else if (n2 > n1) {
			System.out.println("The bigger is: " + n2);
			System.out.println(n2 + " is bigger than " + n1);
		} else {
			System.out.println(n1 + " and " + n2 + " are equal.");
		}
		sc.close();
	}
}

package br.unit.module4.review01;

import java.util.Scanner;

public class Review01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int n1 = sc.nextInt();
		System.out.println("Then type another number: ");
		int n2 = sc.nextInt();
		
		System.out.println("The mod of that division is: " + n1%n2); //Math.floorMod(n1, n1));
		System.out.println("and the sum of them is: (Method 1)" + Math.addExact(n1, n2));
		System.out.println("and the sum of them is: (Method 2) " + (n1 + n2));
		
		System.out.println(n1 + n2);
		sc.close();
		
		// Second time
		int 	x = 10;
		double 	y = 20;
		
		System.out.println(
				(x + y));
		
	}
}

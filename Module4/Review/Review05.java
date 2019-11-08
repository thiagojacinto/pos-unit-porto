package br.unit.module4.review;

import java.util.Scanner;

public class Review05 {
	// Prints all numbers until 1 million, only if it's even and multiple of 3
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type an initial number: ");
		int x = sc.nextInt();
		int times = 0;
		
		long start = System.currentTimeMillis();
		for (int i = x; i < 1000000; i++) {
			if (i % 2 != 0 && i % 3 == 0) {
				System.out.println("i = " + i);
				times++;
			}
		}
		long finish = System.currentTimeMillis();
		System.out.println(
				"The program found " 
						+ times + " occurrences, in "
						+ (finish - start) + " milliseconds."
				);
		sc.close();
	}
}

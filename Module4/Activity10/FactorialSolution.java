package br.unit.module4.activity10;

import java.util.Random;

public class FactorialSolution {
	public static void main(String[] args) {

		// Use Randon class
		Random random = new Random();
		// Select a random number
		int numberOne = random.nextInt(20);
		// Calculate factorial of that number
		int aux = numberOne;
		long factorialOfNum = 1;

		while (aux > 0) {
			factorialOfNum *= aux;
			System.out.print(aux + " * ");
			aux--;
		}

		System.out.println("\nThe factorial of " 
				+ numberOne + " is "
				+ factorialOfNum
			);
		
		// METHOD 2
		
		Factorial f1 = new Factorial(numberOne);
		System.out.println("\nFor the second method, the result is: " 
					+ f1.calculate()
				);
		
		// METHOD 3
		
		System.out.println("\nFor the second method, the result is: " 
				+ f1.calcFactorial(numberOne)
			);
	}
}

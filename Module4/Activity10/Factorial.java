package br.unit.module4.activity10;

public class Factorial {
	// ATTRIBUTES
	private int number;
	private long factorialOfNumber = 1;
	
	// CONSTRUCTOR
	public Factorial(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}
	
	// METHODS
	public long calculate() {
		while (number > 0) {
			factorialOfNumber *= number;
			number--;
		}
		return factorialOfNumber;
	}
	
	public long calcFactorial(int number) {
		if (number > 0) {
			return number * calcFactorial(number - 1);
		}
		return 1;
	}
	
	
}

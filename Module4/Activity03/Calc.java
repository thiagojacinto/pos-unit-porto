package br.unit.module4.activity03;

public class Calc {

	// CONSTRUCTOR
	public Calc() {
		// TODO Auto-generated constructor stub
	}

	public double calculate(char operation, double a1, double a2) throws CalcException {
		if ((operation != '+') && (operation != '-') && (operation != '*')) {
			throw new CalcException("Wrong operation identification.");
		}
		
		double result = -1;
		
		switch (operation) {
		case '+':
			return result = this.sum(a1, a2);
			
		case '-':

			return result = this.sub(a1, a2);
		case '*':

			return result = this.mult(a1, a2);
		default:
			break;
		}
		
		return result;
	}

	// METHODS

	private double sum(double n1, double n2) {
		return n1 + n2;
	}

	private double sub(double n1, double n2) {
		return n1 - n2;
	}

	private double mult(double n1, double n2) {
		return n1 * n2;
	}
}

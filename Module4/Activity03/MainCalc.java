package br.unit.module4.activity03;

public class MainCalc {
	public static void main(String[] args) {
		Calc c1 = new Calc();
		try {
			double newOperation = c1.calculate('+', 10, 7);
			System.out.println("We will calculate operations with 10 and 7.");
			System.out.println("The result is: " + newOperation);
		} catch (CalcException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

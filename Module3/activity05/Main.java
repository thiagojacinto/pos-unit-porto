package activity05;

public class Main {
	public static void main(String[] args) {
		// Testing Overload methods
		Calculus calc = new Calculus();
		
		System.out.println(calc.sum(5.5, 6.5));
		System.out.println(calc.sum(2, 3));
		System.out.println(calc.sum(3, 5, 6));
	}
}

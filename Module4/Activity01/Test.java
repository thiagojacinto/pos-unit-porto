package br.unit.module4.activity01;

public class Test {
	public static void main(String[] args) {
		Stack vector = new Stack();
		
		System.out.println("\nIs stack empty? -> " + vector.isEmpty()
		+ "\n or is it full? -> " + vector.isFull()
				);

		vector.push(1);
		System.out.println(vector);
		vector.push(2);

		for (int i = 0; i < 28; i++) {
			vector.push(i+15);
		}
		System.out.println("Before 'pop': " + vector
				+ "\n and Top value " + vector.showTop()
				+ "\n and Top is " + vector.getTop()
				);
		
		System.out.println("\nIs stack empty? -> " + vector.isEmpty()
		+ "\n or is it full? -> " + vector.isFull()
				);
		for (int i = 0; i < 7; i++) {
			vector.pop();
		}
		System.out.println("After 'pop':  " + vector
				+ "\n and Top value " + vector.showTop()
				+ "\n and Top = " + vector.getTop()
				);
		
		System.out.println("\nIs stack empty? -> " + vector.isEmpty()
							+ "\n or is it full? -> " + vector.isFull()
				);
		
		System.out.println("\n Show vector items: " );
		vector.showVector();
	}
}

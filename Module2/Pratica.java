package Pratica1;


public class Pratica {
	
	public static void main(String[] args) {
		// Variable declaration
		int x = 10;
		int y = x;
		
		boolean executar = true;
		
		//First variation:
		/*
		if (executar == true) {
			// Show the value of 'x':
			
			System.out.println("x = "+x);
			//What큦 the value of 'executar'?
			System.out.println("executar = "+executar);
		} else {
			// Show the value of 'y':
			System.out.println("y = "+y);
			//What큦 the value of 'executar'?
			System.out.println("executar = "+executar);
		}
		*/
		/*
		if (x >= 5) {
			// Show the value of 'x':
			x = x+1;
			System.out.println("x = "+x);
			//What큦 the value of 'executar'?
			System.out.println("executar = "+executar);
		} else {
			// Show the value of 'y':
			System.out.println("y = "+y);
			//What큦 the value of 'executar'?
			System.out.println("executar = "+executar);
		}
		*/
		// Third variation:
		/*
		while (x < 100) {
			x = x + 1;
		}
		*/
		// Fourth variation:
		while(x < 100)x=x+1;y=y-1;System.out.println("x = "+x);System.out.println("y = "+y);
		
		System.out.println("Pula a linha");
	}
	
}
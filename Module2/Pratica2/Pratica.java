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
		/*
		while(x < 100)x=x+1;y=y-1;System.out.println("x = "+x);System.out.println("y = "+y);
		
		System.out.println("Test if writing all sentences without the '{}'");
		*/
		// Fifth variation:
		/*
		int[] arrayInteiros = {3,4,1,2,7,8,9,10};
		
		System.out.println("Item 5 of 'arrayInteiros' = "+arrayInteiros[5]);
		System.out.println("Length of 'arrayInteiros' = "+arrayInteiros.length);
		*/
			// Print the elements of the arrayInteiros:
		/*
		for (int i=0; i<arrayInteiros.length; i=i+1) {
			System.out.println("item = "+ i + ", element = "+arrayInteiros[i]);
		}
		
			// Test with the other way of using 'for':
		int item1 = 0;
		for (int item : arrayInteiros) {
			arrayInteiros
			System.out.println("item = "+ item1 + ", element = "+item);
			item1 = item1 + 1;
		}
		*/
		// Sixth variation:
		/*
		char[] arrayChar = {'a','b','c','d','e','f'};
		char[] arrayChar2;
		for (int k=0; k<arrayChar.length; k=k+1) {
			System.out.print("Char's item = " + arrayChar[k]);
			arrayChar2 = arrayChar.clone();
			System.out.println(", Char2's item = " + arrayChar2[k]);
		}
		*/
		// Seventh variation:
		/*
		String[] yourNameString = {"Thiago","Jacinto S. S."};
		System.out.println("First name: "+yourNameString[0]+", Family name: "+yourNameString[1]);
		
		// --- Is it possible to build an array of another array?
		// --- answer: YES
		int[][] doubleArrayInteiros = {{1,2,3,4,5},{2,4,6,8,10}};
		for(int i=0; i < doubleArrayInteiros.length; i++) {
			for (int j=0; j <doubleArrayInteiros[i].length; j++) {
				System.out.println("i = "+i+", and  item ="+doubleArrayInteiros[i][j]);
			}
		}
		*/
	}
	
}
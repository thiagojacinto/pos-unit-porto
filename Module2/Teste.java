package dia3;

import java.util.Arrays;

public class Teste {
	
	public static void main(String[] args) {
		/*
		int[] arrayInteiros = {3,4,1,2,7,8,9,10};
		char[] arrayCaracteres = {'A', 'B', 'C', 'D'};
		boolean continuar = true;
		
		// THE PASSWORD FINDER
		// We want to find the password '7C'
		
		for (int i = 0; i < arrayCaracteres.length && continuar == true; i++) {
			for (int j = 0; j < arrayInteiros.length; j++) {
				//System.out.println("Inteiro = "+arrayInteiros[j]+", Char = "+arrayCaracteres[i]);
				if (arrayInteiros[j] == 7 && arrayCaracteres[i] == 'C') {
					System.out.println("Senha encontrada");
					continuar = false;
					break;
				} else {
					System.out.println(".");
				}
			}
		}
		
		// Set to the [] array:
		System.out.println(arrayCaracteres[2]);
		arrayCaracteres[2] = '2';
		System.out.println(arrayCaracteres[2]); // WORKS!
		
		// Add to the [] array:
		//System.out.println(arrayCaracteres[5]);
		arrayCaracteres[5] = '2';
		System.out.println(arrayCaracteres[5]); // NOT WORK!
		*/
		int[] inteiros = 		{0,1,2,3,4,5,6,7,8,9};
		//int[] invertInteiro = {0,0,0,0,0,0,0,0,0,0};
		int[] invertInteiro = new int[inteiros.length];
		
 		for (int j = 0; j < inteiros.length; j++) {
 			invertInteiro[j] = inteiros[inteiros.length-1-j];
			System.out.println("j = "+j+", invertInteiro[j] = "+invertInteiro[j]);
		}
 		System.out.println(Arrays.toString(invertInteiro));
	}
	
}

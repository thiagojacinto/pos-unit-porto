package br.unit.module4.activity04;

import java.util.Scanner;

public class MainHS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// Calls the scanner
		HandleString hs = new HandleString();
		
		System.out.println("Type a word: ");
		try {
			int wordLength = hs.count(sc.nextLine());	// Gets from KeyBoard and uses 'hs' method to count
			System.out.println("This word's lenght is " + wordLength);
		} catch (HandleStringException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());	// Shows error msg
			// System.out.println("Error: " + e);
			// e.printStackTrace();
		}
				
		sc.close();
	}
}

package br.unit.module4.activity07;

import java.util.Scanner;

public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		Scanner sc = new Scanner(System.in);
		double[] grades1;
		double[] grades2;
		double[] avgGrades;
		String[] names;
//		double avgGrade = 0;
		boolean continueCondition = true;

		// Asks user to input grade1's n. of elements:
		System.out.println("How many students do you want to add: ");
		grades1 = new double[sc.nextInt()];
		grades2 = new double[grades1.length];
		avgGrades = new double[grades1.length];
		names = new String[grades1.length];
		// Shows grade1's length
		System.out.println("The 1st grade's size is: " + grades1.length);
		
		// Shows grade2's length
		System.out.println("The 2nd grade's size is: " + grades2.length);
		
		while (continueCondition) {
//			
//			System.out.println("Type the grade's index: ");
//			int gradeIndex = sc.nextInt();
//			System.out.println("Now, type the grade's value: ");
//			double gradeValue = sc.nextDouble();
			
			// Input students names:
			System.out.println("Type the index of the student: ");
			int nameIndex = sc.nextInt();
			System.out.println("Now, type the name of that student: ");
			names[nameIndex] = sc.next();
			System.out.println("And then, type the 1st grade's value: ");
			double gradeValue = sc.nextDouble();
			System.out.println("And then, type the 2nd grade's value: ");
			double grade2Value = sc.nextDouble();
			try {
//				grades1[gradeIndex] = gradeValue;
				grades1[nameIndex] = gradeValue;
				grades2[nameIndex] = grade2Value;
				System.out.println("Want to continue adding? (Y / N)");
				String answer = sc.next();
				if (answer.contains("N") || answer.contains("n")) {
					continueCondition = false;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Try again. Error: " + e);
			}
		}

		// Show all elements
		System.out.println("The grades are: ");
//		System.out.print("[ ");
//		for (int i = 0; i < grades1.length; i++) {
//			System.out.print(grades1[i] + ", ");
//			avgGrade =+ grades1[i];
//		}
//		System.out.println("] and Average is: " + avgGrade/grades1.length);
		for (int i = 0; i < names.length; i++) {
			System.out.println("For " + names[i] + " the grades are:");
			System.out.print(grades1[i] + ", " + grades2[i]);
			avgGrades[i] = (grades1[i] + grades2[i]) / 2;
			System.out.println(", avg = " + avgGrades[i]);
		}
		
		/*
		 * Ordering with Bubble Sort
		 */
		
		for (int i = 0; i < avgGrades.length; i++) {
			for (int j = 1; j < avgGrades.length; j++) {

				double v1 = avgGrades[j-1];
				double v2 = avgGrades[j];
				double aux;
				if (v1 > v2) {
					// Change values of AVERAGE
					aux = v1;
					v1 = v2;
					v2 = aux;
					// then put them inside 'vector'
					avgGrades[j-1] = v1;
					avgGrades[j] = v2;
					
					// Change values of GRADES1
					v1 = grades1[j-1];
					v2 = grades1[j];
					
					aux = v1;
					v1 = v2;
					v2 = aux;
					// then put them inside 'vector'
					grades1[j-1] = v1;
					grades1[j] = v2;
					
					// Change values of GRADES1
					v1 = grades2[j-1];
					v2 = grades2[j];
					
					aux = v1;
					v1 = v2;
					v2 = aux;
					// then put them inside 'vector'
					grades2[j-1] = v1;
					grades2[j] = v2;
					
					// Change values of NAMES
					String n1 = names[j-1];
					String n2 = names[j];
					String auxString;
					
					auxString = n1;
					n1 = n2;
					n2 = auxString;
					// then put them inside 'vector'
					names[j-1] = n1;
					names[j] = n2;
				}
			}
		}
		
		// Show all AFTER SORTED
		System.out.println("\n Now sorting elements of this array by average grades... \n");
		for (int i = 0; i < names.length; i++) {
			System.out.println("For " + names[i] + " the grades are:");
			System.out.print(grades1[i] + grades2[i]);
			avgGrades[i] = (grades1[i] + grades2[i]) / 2;
			System.out.println("Average = " + avgGrades[i]);
		}
		
		
		// Closes scanner
		sc.close();
	}

}

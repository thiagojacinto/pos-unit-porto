package br.unit.module4.activity08;

import java.util.Arrays;

public class InsertionSort {
	// ATTRIBUTES
	int[] vector;
	
	// CONSTRUCTOR
	public InsertionSort(int[] array) {
		// TODO Auto-generated constructor stub
		vector = array;
	}
	
	// Methods
	/*
	 * Sort method of 'Insertion Sort' 
	 */
	public void sort() {
		for (int i = 1; i < vector.length; i++) {
			int j = i - 1;
			int key = vector[i];
			
			while ((j >= 0) && (vector[j] > key)) {
				vector[j + 1] = vector[j];
				j--;
			}
			vector[j + 1] = key;
		}
	}
	
	/*
	 *  Show all elements of vector:
	 */
	
	public String showVector() {
		String vectorString = "[";
		for (int i = 0; i < vector.length; i++) {
			//			System.out.println(vector[i]);
			vectorString += " " + vector[i];
		}
		vectorString += " ]";
		return vectorString;
	}
	
	// Getters and Setters
	
	public int[] getVector() {
		return vector;
	}

	@Override
	public String toString() {
		return "InsertionSort [vector = " + Arrays.toString(vector) + "]";
	}
	
	// toString 
	
}

package br.unit.module4.activity09;

public class SelectionSortChar {
	// ATTRIBUTES
	char[] vector;
	int changes = 0;

	// Constructor
	public SelectionSortChar(char[] list) {
		// TODO Auto-generated constructor stub
		this.vector = list;
	}

	// METHODS

	public void sort() {
		for (int i = 0; i < vector.length; i++) {
			char min = vector[i];
			int minIndex = i;

			for (int j = i + 1; j < vector.length; j++) {
				// Search the minimum
				if (vector[j] < min) {
					min = vector[j];
					minIndex = j;
				}
			}
			//Then changes
			char aux = vector[i];
			vector[i] = min;
			vector[minIndex] = aux;
			changes++;
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
	public int getChanges() {
		return changes;
	}
	public char[] getVector() {
		return vector;
	}
}

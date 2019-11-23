package br.unit.module4.activity06;

public class BubbleSort {
	// ATTRIBUTES
	private int[] vector;
	private int changes = 0;

	// CONSTRUCTOR
	public BubbleSort(int[] vector) {
		// TODO Auto-generated constructor stub
		this.vector = vector;
	}

	/*
	 * Ordering
	 */
	public void sort() {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 1; j < vector.length; j++) {

				int v1 = vector[j-1];
				int v2 = vector[j];
				int aux;
				if (v1 > v2) {
					// Change values
					aux = v1;
					v1 = v2;
					v2 = aux;
					// then put them inside 'vector'
					vector[j-1] = v1;
					vector[j] = v2;
					// add one change
					changes++;
				}
			}
		}
	}

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
	
	public int getChanges() {
		return changes;
	}
}

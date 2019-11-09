package br.unit.module4.activity04;

public class HandleString {
	
	// CONSTRUCTOR
	
	public HandleString() {
		// TODO Auto-generated constructor stub
	}
	
	// METHODS
	
	public int count(String string) throws HandleStringException {
		
		int size = -1;
		if (string.length() > 3) {	// Only if its bigger than 3
			size = string.length();
		} else {
			throw new HandleStringException("The string is too short.");
		}
	
		return size;
	}
}

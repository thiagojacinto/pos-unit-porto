package br.unit.module4.activity04;

public class HandleStringException extends Exception {
	
	private static final long serialVersionUID = 1L;

	// CONSTRUCTOR
	HandleStringException() {}
	
	HandleStringException(String msg) {
		super(msg);
	}
}

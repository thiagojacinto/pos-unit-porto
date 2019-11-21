package br.unit.module4.activity05;

/*
 * CHANGED NAME FROM 'knot' TO 'nodo'
 */

public class Nodo {
	private int info;
	private Nodo nextKnot;

	// GETTERS AND SETTERS
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public Nodo getNextNodo() {
		return nextKnot;
	}
	public void setNextNodo(Nodo nextKnot) {
		this.nextKnot = nextKnot;
	}
	@Override
	public String toString() {
		return "Knot [info = " + info + ", nextKnot = " + nextKnot + "]";
	}
	
	
	

}


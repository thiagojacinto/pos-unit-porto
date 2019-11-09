package br.unit.module4.activity01;

public class Stack {
	private static final int STACK_SIZE = 30;
	private int[] vector;
	private int top = -1;
	
	// CONSTRUCTOR
	public Stack(int sizeOfStack) {
		// TODO Auto-generated constructor stub
		this.vector = new int[sizeOfStack];
	}
	
	public Stack() {
		// TODO Auto-generated constructor stub
		this.vector = new int[STACK_SIZE];
	}
	
	// METHODS
	public void push(int pushed) {
		// Verify if top reached the array length
		if (top < vector.length) {
			top++;
			vector[top] = pushed;
		} else {
			throw new RuntimeException("The stack is full.");
		}
	}
	
	public void pop() {
		if (top >= 0) {
			vector[top] = 0;
			top--;
		} else {
			throw new RuntimeException("The stack is empty.");
		}
	}
	
	// value of 'top' item:
	public int showTop() {
		return this.vector[top];
	}
	
	// show top
	public int getTop() {
		return top;
	}
	
	// Verify if Stack is empty
	public boolean isEmpty() {
		if (this.getTop() == -1) {
			return true;
		} 
		return false;
	}
	
	// Verify if Stack is full
	public boolean isFull() {
		if (this.getTop() == vector.length - 1) {
			return true;
		} 
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String toIt = " ";
		for (int i = 0; i < vector.length; i++) {
			toIt = toIt + vector[i] + " ";
		}
		return toIt;
	}
}

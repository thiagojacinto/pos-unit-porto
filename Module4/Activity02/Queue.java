package br.unit.module4.activity02;

public class Queue {

	// ATTRIBUTE
	private int head = 0;
	private int[] queue;
	private static final int QUEUE_SIZE = 20;

	// CONSTRUCTOR
	public Queue() {	// Empty constructor
		// TODO Auto-generated constructor stub
		queue = new int[QUEUE_SIZE];
	}
	
	public Queue(int queueSize) {
		queue = new int[queueSize];
	}
	
	// METHODS
	
	// To add
	public void insertInQueue(int value) throws RuntimeException {
		if (!isFull()) {
			queue[head] = value;
			head++;
		} else {
			//System.out.println("Queue is full.");
			throw new RuntimeException("Queue is full.");
		} 
	}
	
	// To remove
	public void unQueue() throws RuntimeException {
		if (!isEmpty()) {
			for (int i = 1; i <= head; i++) {
				queue[i-1] = queue[i];
			}
			// The reduce the head identifier
			head--;
		} else {
			// System.out.println("Queue is empty.");
			throw new RuntimeException("Queue is empty.");
		}
	}
	
	// To get head
	public int getHead() {
		return head;
	}
	
	public boolean isFull() {
		if (head == queue.length - 1) {
			return true;	// It's full
		}
		return false;
	}
	
	public boolean isEmpty() {
		if (head == 0) {
			return true;	// It's empty
		}
		return false;
	}
	
	// Show all valid elements (NOT zero)
	public void showQueue() {
		for (int i = 0; i < head; i++) {
			System.out.println("[" + i + "] = " + queue[i]);
		}
	}
	
	public void getQueue() {
		for (int i = 0; i < queue.length; i++) {
			System.out.println("[" + i + "] = " + queue[i]);
		}
	}
}

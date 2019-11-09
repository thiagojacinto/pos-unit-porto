package br.unit.module4.activity02;

public class Test {
	public static void main(String[] args) {
		System.out.println(" * * * * Queue implementation * * * * ");
		
		Queue q = new Queue();
		// Insert items
		q.insertInQueue(1);
		q.insertInQueue(58);
		q.insertInQueue(12);
		q.insertInQueue(13);
		q.insertInQueue(50);
		
		// Insert in for
		for (int i = 72; i < 100; i++) {
			q.insertInQueue(i);
		}

		
		// Show queue
		System.out.println("\nQueue content: ");
		q.showQueue();

		// Then remove some items
		for (int i = 0; i < 30; i++) {
			q.unQueue();
		}

		// Show queue
		System.out.println("\nQueue content: ");
		q.showQueue();
	}
}

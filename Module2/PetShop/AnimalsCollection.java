package animals;

import java.util.ArrayList;

public class AnimalsCollection {
	// ATRIBUTTES:
	ArrayList<Animals> allAnimals = new ArrayList<Animals>();
	
	// METHODS:
	// To add an animal
	public void add(Animals a) {
		allAnimals.add(a);
		System.out.println("Adding an new animal to the system.");
		getListSize();
	}
	
	// To remove an animal
	public void remove(Animals a) {
		allAnimals.remove(a);
		System.out.println("Removing the animal from the system.");
		getListSize();
	}
	
	// To remove an animal BY INDEX
	public void remove(int i) {
		
		allAnimals.remove(allAnimals.get(i));
		System.out.println("Removing the animal from the system.");
		getListSize();
	}
	
	// To show/print the list size:
	public int getListSize() {
		// Return VOID
//		System.out.println("List's size = " + allAnimals.size());
		
		// Return INT
		return allAnimals.size();
	}
	
	// List all the Animals in the List:
	public void listAll() {
		System.out.println("--------------------------");
		for (Animals animal : allAnimals) {
//			// Friday, September 27
//			if (animal.numberOfPaws > 2) {
//				System.out.println(animal.nameString);
//			}
			// Saturday, September 28
			System.out.println("["+allAnimals.indexOf(animal)+"]"+ animal.nameString);
		}
		System.out.println("--------------------------");
	}
	
}

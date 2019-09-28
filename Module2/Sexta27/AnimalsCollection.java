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
	
	// To show/print the list size:
	public void getListSize() {
		System.out.println("List's size = " + allAnimals.size());
	}
	
	// List all the Animals in the List:
	public void listAll() {
		for (Animals animal : allAnimals) {
			if (animal.numberOfPaws > 2) {
				System.out.println(animal.nameString);
			}
		}
	}
	
}

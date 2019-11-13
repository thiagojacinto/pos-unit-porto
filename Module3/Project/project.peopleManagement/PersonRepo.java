package project.com.peopleManagement;

import java.util.ArrayList;
import java.util.List;

import project.com.root.Main;

public class PersonRepo implements RepositoryOfPersons {
	// ATTRIBUTES
	private List<Person> personsRepo;

	// CONSTRUCTOR
	public PersonRepo() {
		// TODO Auto-generated constructor stub
		personsRepo = new ArrayList<Person>();
	}

	// METHODS 

	@Override
	public void insert(Person a) {
		// TODO Auto-generated method stub
		personsRepo.add(a);
	}

	@Override
	public Person search(int code) {
		// TODO Auto-generated method stub
		Person wanted = null;
		ArrayList<Person> allFound = new ArrayList<Person>();
		// Add all code's matches to an array
		for (Person person : personsRepo) {
			if (person.getCode() == code) {
				allFound.add(person);
			} //else System.err.println("Not found in the repository. \n");
		}
		// Then loop into it to select the right one:
		if (allFound != null) {			// Not null 'allFound' == at least one found.
			if (allFound.size() > 1) {	// Found more than one with same code

				int i=0;
				System.out.println("\nSelect one of the duplicates found by typing the desired User number: ");
				for (Person person : allFound) {
					System.out.println("\n[Person " + i + "] -> " + person.toString());
					i++;
				}
				int selected = Main.getIntFromKB(); 	// Imported from Main
				wanted = allFound.get(selected);	
			} else { 
				wanted = allFound.get(0);
			}
		}
		return wanted;
	}

	@Override
	public void remove(int code) {
		// TODO Auto-generated method stub

		Person wanted = this.search(code);
		if (wanted != null) {
			personsRepo.remove(wanted);
		}
	}

	// To show the list
	public List<Person> list() {
		// TODO Auto-generated method stub

		return this.personsRepo;
	}

	// To search different types of users
	public Person searchByTypes(int code, int type) {
		Person wanted = null;

		ArrayList<Person> allFound = new ArrayList<Person>();
		// Add all code's matches to an array
		for (Person person : personsRepo) {
			if (person.getCode() == code && person.getType() == type) {
				allFound.add(person);
			} //else System.err.println("Not found in the repository. \n");
		}

		if (allFound != null && allFound.size() > 1) {	// Found more than one with same code
			System.out.println("\nSelect one of the duplicates found by typing the desired User number: ");
			// Then loop into it to select the right one:
			int i = 0;
			for (Person person : allFound) {
				System.out.println("\n[Person " + i + "] -> " + person.toString());
				i++;
			}
			int selected = Main.getIntFromKB(); 	// Imported from Main
			wanted = allFound.get(selected);	
		} else if (allFound != null){ 
			wanted = allFound.get(0);
		}

		return wanted;

	}

}
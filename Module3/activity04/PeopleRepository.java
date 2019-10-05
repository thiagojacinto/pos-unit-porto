package activity04;

import java.util.ArrayList;

public class PeopleRepository {
	// ATTRIBUTES
	int index;
	ArrayList<Person> repo;
	
	// METHODS
	public void add(Person p) {
		// To add some person to the collection
		repo.add(p);
	}
	
	public void remove(Person p) {
		// To remove some person to the collection
		repo.remove(p);
	}
	
	public void show() {
		if (repo.size() == 0) {
			System.err.println("There's no person inserted in the repository.");
		} else {
			for (Person person : repo) {
				System.out.println(person.getName() + " tem " + person.getAge() + " anos;");
			}
		}
	}
	
	public int sizeOf() {
		return repo.size();
	}
}

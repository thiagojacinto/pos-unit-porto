package activity15.peopleManagement;

import java.util.ArrayList;
import java.util.List;

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
		for (Person person : personsRepo) {
			if (person.getCode() == code) {
				wanted = person;
			} else System.err.println("Not found in the repository. \n");
		}
		return wanted;
	}

	@Override
	public void remove(int code) {
		// TODO Auto-generated method stub
		for (Person person : personsRepo) {
			if (person.getCode() == code) {
				personsRepo.remove(person);
			}
		}
	}
	
	// To show the list
	public List<Person> list() {
		// TODO Auto-generated method stub
		return this.personsRepo;
	}

}

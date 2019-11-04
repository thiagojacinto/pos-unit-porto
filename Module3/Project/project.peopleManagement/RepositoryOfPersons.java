package activity15.peopleManagement;

public interface RepositoryOfPersons {
	// METHODS

	// Insert
	public void insert(Person a);
	// Search
	public Person search(int code);
	// Remove
	public void remove(int code);
	// List
//	public void list();
}

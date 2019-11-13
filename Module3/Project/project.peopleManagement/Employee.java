package project.com.peopleManagement;

public class Employee extends Person {
	// ATTRIBUTES
	private RepositoryOfPersons repo = new PersonRepo();
	
	// CONSTRUCTOR
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		this.setType(2);
	}

	public Employee(String n, int c) {
		super(n, c);
		// TODO Auto-generated constructor stub
		this.setType(2);
	}
	
	// Repository connection
	public RepositoryOfPersons getRepo() {
		return repo;
	}
	public void setRepo(RepositoryOfPersons repo) {
		this.repo = repo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}

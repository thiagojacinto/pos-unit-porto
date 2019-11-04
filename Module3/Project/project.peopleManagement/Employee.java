package activity15.peopleManagement;

import activity15.loansManagement.CommonMethods;

public class Employee extends Person implements CommonMethods{
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
	
	// METHODS
	
	@Override
	public void register() {
		// TODO Auto-generated method stub
		repo.insert(this);
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		repo.remove(this.getCode());
	}
	
	// Repository connection
	public RepositoryOfPersons getRepo() {
		return repo;
	}
	public void setRepo(RepositoryOfPersons repo) {
		this.repo = repo;
	}

//	@Override
//	public String toString() {
//		return "Employee [repo=" + repo + "]";
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Employee";
	}
	
	
}

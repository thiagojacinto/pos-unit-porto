package activity15.peopleManagement;

import java.util.List;

import activity15.loansManagement.CommonMethods;

public class User extends Person implements CommonMethods{
	
	// ATTRIBUTES
	private String cpf;
	private String phone;
	private String address;
	private String cep;
	private String email;
//	private Loan loanList;
//	private ArrayList<User> listOfUsers; // Is it needed?
	private RepositoryOfPersons repo = new PersonRepo();
	
	// CONSTRUCTOR
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
		this.setType(1);
	}
	public User(String n, int c) {
		super(n, c);
		this.setType(1);
		// TODO Auto-generated constructor stub
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
	
	// GETTERS AND SETTERS
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Repository connection
	public RepositoryOfPersons getRepo() {
		return repo;
	}
	public void setRepo(RepositoryOfPersons repo) {
		this.repo = repo;
	}
	public List<Person> listRepo() {
		return ((PersonRepo) repo).list();
	}
}

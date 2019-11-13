package project.com.peopleManagement;

import java.util.List;

public class User extends Person {
	
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

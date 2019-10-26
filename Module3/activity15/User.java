package activity15.peopleManagement;

import java.util.ArrayList;

import activity15.loansManagement.CommonMethods;
import activity15.loansManagement.Loan;

public class User extends Person implements CommonMethods{
	
	// ATTRIBUTES
	private String cpf;
	private String phone;
	private String address;
	private String neighborhood;
	private String city;
	private String state;
	private String cep;
	private String email;
	private Loan loanList;
	private ArrayList<User> listOfUsers;
	
	// CONSTRUCTOR
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String n, int c) {
		super(n, c);
		// TODO Auto-generated constructor stub
	}
	
	// METHODS

	@Override
	public void register() {
		// TODO Auto-generated method stub
		listOfUsers.add(this);
	}
	@Override
	public void erase() {
		// TODO Auto-generated method stub
		listOfUsers.remove(this);
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
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	public Loan getLoanList() {
		return loanList;
	}
	public void setLoanList(Loan loanList) {
		this.loanList = loanList;
	}

}

package extraActivity04;

import java.util.List;

public class Manager extends Person implements Actions{
	
	// Attributes
	AccountsRepository repo = new AccountsRepoList();
	char type;
	
	// Constructor
//	Manager() {};
	
	Manager(char t, AccountsRepository r) {
		this.repo = r;
		this.type = t;
	}
	
	// Methods
	
	// a. Insert an account
	@Override
	public void insert(AbstractAccount acc) {
		// TODO Auto-generated method stub
		repo.insert(acc);
	}
	
	// b. Search an account
	@Override
	public AbstractAccount search(String accNumber) {
		// TODO Auto-generated method stub
		return repo.search(accNumber);
	}
	
	// c. Remove an account
	@Override
	public void remove(String accNumber) {
		// TODO Auto-generated method stub
		repo.remove(accNumber);
	}
	
	// d. List all the accounts inside the repository
	public List<AbstractAccount> list() {
		return ((AccountsRepoList) repo).showAccounts();
	}
	
	
	// Getters and Setters
	
	public AccountsRepository getRepo() {
		return repo;
	}

	public void setRepo(AccountsRepository repo) {
		this.repo = repo;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}
	
	
}

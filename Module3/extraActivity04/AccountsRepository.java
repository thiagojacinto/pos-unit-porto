package extraActivity04;



public interface AccountsRepository {
	
	// METHODS
	
	// Insert Account into Repository
	public void insert(AbstractAccount acc);
	
	// Search an Account inside the Repository
	public AbstractAccount search(String accNumber); 
	
	// Remove from the Repository
	public void remove(String accNumber);
	
	// List all accounts inside the repository
//	public String toString();
	
}

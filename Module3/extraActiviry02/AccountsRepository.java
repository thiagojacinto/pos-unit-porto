package extraActivity02;



public interface AccountsRepository {
	
	// METHODS
	
	// Insert Account into Repository
	public void insert(Account acc);
	
	// Search an Account inside the Repository
	public Account search(String accNumber); 
	
	// Remove from the Repository
	public void remove(String accNumber);
	
}

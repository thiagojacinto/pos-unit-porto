package extraActivity02;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creates a repository from the RepoList
		AccountsRepository repo = new AccountsRepoList();
		// Insert some acc's into it:
		Account acc1 = new RealAccount("11111-1", 1000.0);
		repo.insert(acc1);
		Account acc2 = new RealAccount("22222-2", 4000.0);
		repo.insert(acc2);
		Account acc3 = new RealAccount("33333-3", 5000.0);
		repo.insert(acc3);
		
		// Searching for an account in the repository:
		Account desiredAccount = repo.search(acc1.getNumber());
		// then prints the acc's balance
		System.out.println("The balance of account n. "
				+ desiredAccount.getNumber()
				+ " is equal to: "
				+ desiredAccount.getBalance()
				);
		// now remove it from the repository
		repo.remove(desiredAccount.getNumber());
		// finally print all the acc's registered in the repository
		System.out.println("Accounts inserted: "
				+ ((AccountsRepoList) repo).showAccounts()
				);
	}
}

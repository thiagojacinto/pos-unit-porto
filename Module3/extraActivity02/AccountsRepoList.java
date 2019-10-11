package extraActivity02;

import java.util.ArrayList;
import java.util.List;

public class AccountsRepoList implements AccountsRepository{

	// ATTRIBUTES
	List<Account> accList; 
	
	// CONSTRUCTOR
	AccountsRepoList(){
		accList = new ArrayList<Account>();
	}; 
	
	
	@Override
	public void insert(Account acc) {
		// TODO Auto-generated method stub
		accList.add(acc);
	}

	@Override
	public Account search(String accNumber) {
		// TODO Auto-generated method stub
		Account wantedAccount = null;
		for (Account account : accList) {
			if (account.getNumber().equals(accNumber)) {
				wantedAccount = account;
				
			}
		}
		return wantedAccount;
	}

	@Override
	public void remove(String accNumber) {
		// TODO Auto-generated method stub
		if (search(accNumber) != null) {
			// Uses search to find the desired account
			Account wantedAccount = search(accNumber);
			// Remove the ' from the RepoList
			System.out.println("The account "
					+ wantedAccount.getNumber()
					+ " was removed.");
			accList.remove(accList.indexOf(wantedAccount));

		} else {
			System.err.println("The RepoList is empty");
		}

	}

	// Method to show the items of the array - FROM SLIDE
	public List<Account> showAccounts() {
		return this.accList;
	}

	// Method to show the items of the array
	public void showAccounts2() {
		int i = 0;
		for (Account account : accList) {
			System.out.println("["+i+"]" + account.getNumber());
			i++;
		}
	}

}

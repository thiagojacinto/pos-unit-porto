package extraActivity02;

import java.util.ArrayList;

public class AccountsRepoArray implements AccountsRepository{

	// ATTRIBUTES
	ArrayList<Account> accArrayList;
	int index;

	// CONSTRUCTOR
	AccountsRepoArray() {}; // Empty constructor

	AccountsRepoArray(int size) {
		accArrayList = new ArrayList<Account>(size);
	}

	// METHODS

	@Override
	public void insert(Account acc) {
		// TODO Auto-generated method stub
		accArrayList.add(acc);
	}

	@Override
	public Account search(String accNumber) {
		// TODO Auto-generated method stub
		Account wantedAccount = null;
		for (Account account : accArrayList) {
			if (account.getNumber().equals(accNumber)) {
				wantedAccount = account;
			}
		}
		return wantedAccount;
	}

	@Override
	public void remove(String accNumber) {
		// TODO Auto-generated method stub
		// Uses 'search' method to find
		if (search(accNumber) != null) {
			Account wantedAccount = search(accNumber);
			accArrayList.remove(wantedAccount);
		} else {
			System.err.println("The RepoArray is empty");
		}
	}
	
	// Method to show the items of the array - FROM SLIDE
	public ArrayList<Account> showAccounts() {
		return this.accArrayList;
	}
	
	// Method to show the items of the array
	public void showAccounts2() {
		int i = 0;
		for (Account account : accArrayList) {
			System.out.println("["+i+"]" + account.getNumber());
			i++;
		}
	}
}

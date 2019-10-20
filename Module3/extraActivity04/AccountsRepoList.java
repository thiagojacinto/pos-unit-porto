package extraActivity04;

import java.util.ArrayList;
import java.util.List;

public class AccountsRepoList implements AccountsRepository{

	// ATTRIBUTES
	List<AbstractAccount> accList;

	// CONSTRUCTOR
	AccountsRepoList(){
		accList = new ArrayList<AbstractAccount>();
	}; // Empty constructor

	@Override
	public void insert(AbstractAccount acc) {
		// TODO Auto-generated method stub
		accList.add(acc);
	}

	@Override
	public AbstractAccount search(String accNumber) {
		// TODO Auto-generated method stub
		AbstractAccount wantedAccount = null;
		for (AbstractAccount account : accList) {
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
			AbstractAccount wantedAccount = search(accNumber);
			// Remove the ' from the RepoList
			System.out.println("The account "
					+ wantedAccount.getNumber()
					+ " was removed.");
			accList.remove(accList.indexOf(wantedAccount));

		} else {
			System.err.println("The RepoList is empty \n");
		}

	}

	// Method to show the items of the array - FROM SLIDE
	public List<AbstractAccount> showAccounts() {
		return this.accList;
	}

	// Method to show the items of the array
//	public void showAccounts2() {
//		int i = 0;
//		for (AbstractAccount account : accList) {
//			System.out.println("["+i+"]" + account.getNumber());
//			i++;
//		}
//	}

}

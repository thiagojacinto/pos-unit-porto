package activity10;

import java.util.HashMap;
import java.util.Map;

import extraActivity02.Account;
import extraActivity02.AccountsRepoList;
import extraActivity02.AccountsRepository;
import extraActivity02.RealAccount;
import extraActivity02.SavingsAccount;
import extraActivity02.BonusAccount;
import extraActivity02.Tax;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ****** Map implementation ******
		
		// Creating accounts:
		Account acc1 = new RealAccount("11111-1", 1000.0);
		Account acc2 = new RealAccount("22222-2", 4000.0);
		Account acc3 = new RealAccount("33333-3", 5000.0);
		
		// Creating a Map
		Map<String, Account> accMap = new HashMap<String, Account>();
		// Insert the accounts into the map
		accMap.put("Director", acc3);
		accMap.put("Manager", acc2);
		accMap.put("Developer", acc1);
		// Showing some info from the map
		System.out.println("Dev's " + accMap.get("Developer"));
	
	}

}

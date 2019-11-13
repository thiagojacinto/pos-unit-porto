package project.com.contentManagement;

import java.util.ArrayList;
import java.util.List;

import project.com.root.Main;

public class CollectionsRepo implements RepositoryOfCollections{
	// ATTRIBUTES
	private List<Collection> colRepo;

	// CONSTRUCTOR
	public CollectionsRepo() {
		// TODO Auto-generated constructor stub
		colRepo = new ArrayList<Collection>();
	}

	// METHODS

	@Override
	public void insert(Collection col) {
		// TODO Auto-generated method stub
		colRepo.add(col);
	}

	@Override
	public Collection search(int code) {
		// TODO Auto-generated method stub
		Collection wanted = null;
		ArrayList<Collection> allFound = new ArrayList<Collection>();
		for (Collection item : colRepo) { 	// Search from every item insite the Collection Repository
			if (item.getCode() == code) {
				switch (item.getType()) {	// Verify the code to return a right item
				case 1:		// Then it's a book
					allFound.add((Book) item);
					break ;
				case 2:		// Then it's a Newspaper
					allFound.add((Newspaper) item);
					break ;
				case 3:		// Then it's a Magazine
					allFound.add((Magazine) item);
					break ;
				default:
					System.out.println("Unknown type registered: " + item.getType());
				}
			} 
		}
		// Then loop into it to select the right one:
		if (allFound != null) {			// Not null 'allFound' == at least one found.
			if (allFound.size() > 1) {	// Found more than one with same code
				int i=0;
				
				System.out.println("\nSelect one of the duplicates found by typing the desired User number: ");
				for (Collection item : allFound) {
					System.out.println("\n[Item " + i + "] -> " + item.toString());
					i++;
				}
				int selected = Main.getIntFromKB(); 	// Imported from Main
				wanted = allFound.get(selected);	
			} else { 
				wanted = allFound.get(0);	// If has 1, will get the first (index=0)
			}
		}

		return wanted;
	}

	@Override
	public void remove(int code) {
		// TODO Auto-generated method stub

		// Using search to select
		Collection item = this.search(code);
		if (item != null) {
			colRepo.remove(item);
		}
	}

	// To list all items inside Collection Repository
	public List<Collection> list() {
		return this.colRepo;
	}

}

package activity15.contentMangement;

import java.util.ArrayList;
import java.util.List;

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
	public Collection search(Collection col) {
		// TODO Auto-generated method stub
		Collection wanted = null;
		for (Collection person : colRepo) {
			if (person.equals(col)) {
				wanted = col;
			} else System.err.println("Not found in the repository. \n");
		}
		return wanted;
	}

	@Override
	public void remove(int code) {
		// TODO Auto-generated method stub
		for (Collection collection : colRepo) {
			if (collection.getCode() == code) {
				colRepo.remove(collection);
			}
		}
	}
	
	// To list all itens inside Collection Repository
	public List<Collection> list() {
		return this.colRepo;
	}

}

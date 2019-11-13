package project.com.contentManagement;

import java.util.List;

public class Magazine extends Collection {
	// ATTRIBUTES
//	private String name;	// Passed to superclass as 'title'
	private RepositoryOfCollections repo = new CollectionsRepo();

	// CONSTRUCTOR

	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
		this.setType(3);
	}

	public Magazine(int c, int y, String n) {
		super(c, y);
		// TODO Auto-generated constructor stub
//		this.setName(n);
		super.setTitle(n);
		this.setType(3);
	}
	
	// GETTERS AND SETTERS


	// Repository connection
	public RepositoryOfCollections getRepo() {
		return repo;
	}
	public void setRepo(RepositoryOfCollections repo) {
		this.repo = repo;
	}
	public List<Collection> listRepo() {
		return ((CollectionsRepo) repo).list();
	}

}

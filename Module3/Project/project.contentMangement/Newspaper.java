package project.com.contentManagement;

import java.util.List;

public class Newspaper extends Collection {
	// ATTRIBUTES
//	private String nameNP;	// Passed to superclass as 'title'
	private RepositoryOfCollections repo = new CollectionsRepo();
	
	// CONSTRUCTOR
	
	public Newspaper() {
		super();
		// TODO Auto-generated constructor stub
		this.setType(2);
	}

	public Newspaper(int c, int y, String n) {
		super(c, y);
		// TODO Auto-generated constructor stub
		super.setTitle(n);
		this.setType(2);
	}
	
	// GETTERS AND SETTERS
	
//	public String getName() {
//		return nameNP;
//	}
//	public void setName(String nameNP) {
//		this.nameNP = nameNP;
//	}
	
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

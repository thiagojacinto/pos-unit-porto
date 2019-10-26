package activity15.contentMangement;

import java.util.List;

import activity15.loansManagement.CommonMethods;

public class Newspaper extends Collection implements CommonMethods{
	// ATTRIBUTES
	private String nameNP;
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
		this.setName(n);
		this.setType(2);
	}
	
	// GETTERS AND SETTERS
	
	public String getName() {
		return nameNP;
	}
	public void setName(String nameNP) {
		this.nameNP = nameNP;
	}
	
	// METHOD
	
	@Override
	public void register() {
		// TODO Auto-generated method stub
		repo.insert(this);
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		repo.remove(this.getCode());
	}
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

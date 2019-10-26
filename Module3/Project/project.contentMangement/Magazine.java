package activity15.contentMangement;

import java.util.List;
import activity15.loansManagement.CommonMethods;

public class Magazine extends Collection implements CommonMethods{
	// ATTRIBUTES
	private String name;
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
		this.setName(n);
		this.setType(3);
	}
	
	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// METHODS
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

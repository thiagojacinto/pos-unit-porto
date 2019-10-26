package activity15.contentMangement;

import java.util.List;
import activity15.contentMangement.CollectionsRepo;
import activity15.loansManagement.CommonMethods;


public class Book extends Collection implements CommonMethods {
	// ATTRIBUTES
	private String title ;
	private String editor;
	private String subject;
	private int ISBN;
	private	int edition;
	private RepositoryOfCollections repo = new CollectionsRepo();
		
	//CONSTRUCTOR
	public Book() {
		// TODO Auto-generated constructor stub
		this.setType(1);
	}
	
	public Book(int c, String title, int pubY) {
		super(c,pubY);
		this.title = title;
		this.setType(1);
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
	
	// GETTERS AND SETTERS:

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
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

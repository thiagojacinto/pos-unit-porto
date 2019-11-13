package project.com.contentManagement;

import java.util.List;


public class Book extends Collection {
	// ATTRIBUTES
//	private String title ; 	// Added to superclass
	private String author;
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
		super.setTitle(title);
		this.setType(1);
	}
	
	// GETTERS AND SETTERS
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
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

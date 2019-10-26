package activity15.contentMangement;

import java.util.Iterator;
import java.util.List;

import activity15.loansManagement.CommonMethods;

public class Book implements CommonMethods {
	// ATTRIBUTES
	private int code ;
	private String title ;
	private String editor;
	private int publicationYear;
	private int ISBN;
	private String subject;
	private	int edition;
	private int numPages;
	private String volume;
	private List<Book> bookList;
	
	
	//CONSTRUCTOR
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int c, String title, int pubY) {
		this.code = c;
		this.title = title;
		this.publicationYear = pubY;
	}
	
	// METHODS
	
	@Override
	public void register() {
		// TODO Auto-generated method stub
		bookList.add(this);
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		bookList.remove(this);
	}
	
//	public void addItem() {
//		
//	}
	
	public Book search(String wordSeq) {
		for (Book book : bookList) {
			if (book.title.contains(wordSeq)) {
				return this;
			} else return null;
		}
		return null;
	}
	
	// GETTERS AND SETTERS:

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

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

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
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

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
}

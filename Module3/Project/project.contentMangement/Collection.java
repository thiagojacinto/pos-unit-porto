package project.com.contentManagement;

abstract public class Collection {
	
	// ATTRIBUTES
	private String title;
	private int code;
	private int publicationYear;
	private String volume;
	private int numPages;
	private int type; // 1=Book, 2=Newspaper, 3=Mag
	private int quantity;
	
	// CONSTRUCTOR
	public Collection() {};
	 
	public Collection(int c, int y) {
		this.code = c;
		this.publicationYear = y;
	}

	// GETTERS AND SETTERS
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getType() {
		return type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// toString
	@Override
	public String toString() {
		return "[ type = " + this.getClass().getSimpleName() 
				+ ", title = " + title
				+ ", code = " + code 
				+ ", publicationYear = " + publicationYear 
				+ ", volume = " + volume
				+ ", numPages = " + numPages 
				+ ", quantity = " + quantity + "]\n";
	}
	
	
}

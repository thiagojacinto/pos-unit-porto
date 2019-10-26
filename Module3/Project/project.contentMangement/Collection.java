package activity15.contentMangement;

abstract public class Collection {
	
	// ATTRIBUTES
	private int code;
	private int publicationYear;
	private String volume;
	private int numPages;
	private int type; // 1=Book, 2=Newspaper, 3=Mag
	
	// CONSTRUCTOR
	public Collection() {};
	 
	public Collection(int c, int y) {
		this.code = c;
		this.publicationYear = y;
	}

	// GETTERS AND SETTERS
	
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

	// toString
	@Override
	public String toString() {
		return "Collection [type = " + type 
				+ ", code=" + code 
				+ ", publicationYear=" + publicationYear 
				+ ", volume=" + volume
				+ ", numPages=" + numPages + "]";
	}
	
	
}

package project.com.contentManagement;

public interface RepositoryOfCollections {
	// METHODS

	// Insert
	public void insert(Collection col);
	// Search
	public Collection search(int code);
	// Remove
	public void remove(int code);
	// List
//	public void list();
}

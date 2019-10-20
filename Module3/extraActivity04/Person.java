package extraActivity04;

public abstract class Person {
	// Attributes
	String name;
	
	// Constructor
	Person() {
		// Empty Constructor
	};
	
	Person(String n) {
		this.name = n;
	}
	
	// Getters and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};

	
}

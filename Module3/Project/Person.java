package activity15.peopleManagement;

abstract class Person {
	private String name;
	private int code;
	private int type; // 1-User, 2-Employee
	
	// CONSTRUCTOR
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String n, int c) {
		this.name = n;
		this.code = c;
	}
	
	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "[type = "+ type  + ", name = " + name + ", code = " + code + "]\n";
	}

}

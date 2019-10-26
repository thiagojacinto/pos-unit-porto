package activity15.peopleManagement;

abstract class Person {
	private String name;
	private int code;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String n, int c) {
		this.name = n;
		this.code = c;
	}
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
	
	
}

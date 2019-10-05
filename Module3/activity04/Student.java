package activity04;

public class Student extends Person{
	// ATTRIBUTES
	private String studentId;
	
	// CONSTRUCTOR
	public Student() {
		
	}
	
	public Student(String name, String cpf, int age, String id) {
		this.name = name;
		this.cpf = cpf;
		this.age = age;
		this.studentId = id;
		setStudentId(id);
	}
	
	// METHODS
	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String id) {
		this.studentId = id;
	}
}

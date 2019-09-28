package entities;

public abstract class Animals {
	String nameString, genderString;
	int age, numberOfPaws;
	float weight;
	
	// Methods:
	public void move() {
		if (this.nameString == null) {
			this.nameString = this.getClass().getName();
		}
		System.out.println(nameString + " has moved.");
	}
	
	public void sleep() {
		if (this.nameString == null) {
			this.nameString = this.getClass().getName();
		}
		System.out.println(this.nameString + " is sleeping now.");
	}
	
	public void eat() {
		if (this.nameString == null) {
			this.nameString = this.getClass().getName();
		}
		System.out.println(this.nameString + " is eating now.");
	}
	
	public void communicate() {
		if (this.nameString == null) {
			this.nameString = this.getClass().getName();
		}
		System.out.println(this.nameString + " is emmitting sound!");
	}
	
	// Getters and Setters:
	public String getGenderString() {
		return genderString;
	}
	
	public String getNameString() {
		return nameString;
	}
	
	public int getAge() {
		return age;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public int getNumberOfPaws() {
		return numberOfPaws;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGenderString(String genderString) {
		this.genderString = genderString;
	}
	
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	// toString() method implementation:
	@Override
	public String toString() {
		return String.format(
				"Animals [nameString = %s, genderString = %s, idade = %s, peso = %s, getGenderString() = %s, getNameString() = %s]",
				nameString, genderString, age, weight, getGenderString(), getNameString());
	}
	
}

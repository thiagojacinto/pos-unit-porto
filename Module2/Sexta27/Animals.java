package animals;

public class Animals {
	String nameString, genderString;
	int idade, numberOfPaws;
	float peso;
	
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
	
	// toString() method implementation:
	@Override
	public String toString() {
		return String.format(
				"Animals [nameString = %s, genderString = %s, idade = %s, peso = %s, getGenderString() = %s, getNameString() = %s]",
				nameString, genderString, idade, peso, getGenderString(), getNameString());
	}
	
}

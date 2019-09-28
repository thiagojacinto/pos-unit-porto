package animals;

public class Passaro extends Animals{
	String typeOfbird;

	// Methods:
	@Override
	public void communicate() {
		// TODO Auto-generated method stub
		if (this.nameString == null) {
			this.nameString = this.getClass().getName();
		}
		System.out.println("This " + typeOfbird + ", named " + nameString + ", sings like this.");
	}
}

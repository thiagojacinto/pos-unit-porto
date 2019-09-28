package animals;

public class Cachorro extends Animals {
	String racaString;
	
	// Methods
	@Override
	public void communicate() {
		if (this.nameString == null) {
			this.nameString = this.getClass().getName();
		}
		System.out.println(this.nameString + " barked!");
	}
	
}

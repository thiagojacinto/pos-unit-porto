package animals;

public class Gato extends Animals {
	String racaString;
	
	// Methods
	@Override
	public void communicate() {
		// TODO Auto-generated method stub
		if (this.nameString == null) {
			this.nameString = this.getClass().getName();
		}
		System.out.println(this.nameString + " meows!");
	}
	
	
}

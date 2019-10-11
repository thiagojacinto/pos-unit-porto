package activity07;

public class Rectangle implements AbleToCalculateArea{
	private int height, width;
	
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
//		return 0;
		return this.height * this.width;
	}
	
	// Constructor:
	Rectangle() {
		//Empty constructor
	}
	
	Rectangle(int h, int w) {
		this.height = h;
		this.width = w;
	}
}

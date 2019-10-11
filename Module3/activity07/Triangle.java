package activity07;

public class Triangle implements AbleToCalculateArea{
	private int base, height;

	// Constructor:
	Triangle() {
		//Empty constructor
	}

	Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return (this.base * this.height)/2;
	}

}

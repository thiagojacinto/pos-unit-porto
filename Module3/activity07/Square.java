package activity07;

public class Square implements AbleToCalculateArea/*,InterfaceTest*/ {
	private int side;

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return this.side * this.side;
	}
	
	//	Constructor:
	Square() {
		//Empty constructor
	}
	
	Square(int side) {
		this.side = side;
	}

//	@Override
//	public void testMethod() {
//		// TODO Auto-generated method stub
//		
//	}
}

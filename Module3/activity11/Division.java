package activity11;

public class Division {
	
	public int divide(int a, int b) throws DivisionException {
		if (b == 0) {
			throw new DivisionException();
		} 
			return a/b;
	}
}

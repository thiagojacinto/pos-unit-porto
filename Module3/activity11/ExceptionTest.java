package activity11;

public class ExceptionTest {
	public static void main(String[] args) {
		Division divide = new Division();
		try {
			int division = divide.divide(3*5, 0);
			System.out.println(division);
		} catch (DivisionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

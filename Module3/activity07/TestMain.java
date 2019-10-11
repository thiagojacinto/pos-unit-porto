package activity07;

public class TestMain {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(10,5);
		Triangle tri1 = new Triangle(5,10);
		Square sq1 = new Square(10);
		
		System.out.println(
				"Rectangle's Area: " + rec1.CalculateArea()
				+ "\nTriangle's Area: " + tri1.CalculateArea()
				+ "\nSquare's Area: " + sq1.CalculateArea()
				);
		
		// Proferssor way:
		AbleToCalculateArea area1 = new Square(10);
		System.out.println("Total area 1 = " + area1.CalculateArea());
		AbleToCalculateArea area2 = new Triangle(10,5);
		System.out.println("Total area 2 = " + area2.CalculateArea());
		AbleToCalculateArea area3 = new Rectangle(10,5);
		System.out.println("Total area 3 = " + area3.CalculateArea());
	}
}

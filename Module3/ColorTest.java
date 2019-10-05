package activity02;

public class ColorTest {

	public class Colors {
		public final static String PRETO = "preto";
		public final static String AZUL = "azul";
		public final static String VERMELHO = "vermelho";
		
//		public void changeColor() {
//			System.out.println("Color changed.");
//		}
	}
	
//	public class Yellow extends Colors {
//		public void showColor() {
//			System.out.println("Yellow is the color.");
//		}
//	}
	
	
	public static void main(String[] args) {
//		Cores.PRETO = "amarelo"; // Not possible
		System.out.println(Colors.PRETO + ", " + Colors.AZUL + ", " + Colors.VERMELHO);
	
//	// Testing inheritance & cast
//		Colors color1 = new Yellow();
//		color1.changeColor();
	
	}
}

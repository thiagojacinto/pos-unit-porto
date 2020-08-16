package desafio08;

public class Desafio08 {
	
	/**
	 * Calcula as raízes de uma equação de segundo grau a partir da fórmula de Bhaskara
	 * @param a
	 * @param b
	 * @param c
	 * @return raízes, {@code int[2]}
	 */
	private Double[] calcularBhaskara(Double a, Double b, Double c) {
		
		Double delta = Math.pow(b, 2d) -  4 * a * c;
		
		Double[] bhaskara = new Double[2];
		
		bhaskara[0] = (-b - Math.sqrt(delta))/(2 * a);
		bhaskara[1] = (-b + Math.sqrt(delta))/(2 * a);
		
		return bhaskara;
	}
	
	public void exibirRaizes(Double a, Double b, Double c) {
		
		Double[] raizes = calcularBhaskara(a, b, c);
		
		if (raizes[0].isNaN()  || raizes[1].isNaN()) {
			
			System.out.println("Indeterminadas");
			
		} else if (raizes[0].equals(raizes[1])) {
			
			System.out.println(
					String.format("X1 = %.0f",  raizes[0])
					);
		} else {
		System.out.println(
				String.format("X1 = %.0f ;  X2 = %.0f", raizes[0], raizes[1])
				);
		}
	}
	
	
}

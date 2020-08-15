package desafio02;

import java.text.DecimalFormat;

public class Desafio02 {
	
	private final String padrao = "##,###0.0#";
	private DecimalFormat formato = new DecimalFormat(padrao);
	
	/**
	 * Calcula a sequencia de números a partir de um {@code Double} número de entrada.
	 * @param numero {@code Double}
	 * @return {@code Double} o resultado do cálculo da sequência.
	 */
	private Double calcularSequencia(Double numero) {
		
		Double resultado = 0d;
		
		for (double i = 0; numero - i > 0; i++) {
			resultado += (numero - i)/(i + 1);
		}
		
		return resultado;
	}
	
	/**
	 * Exibe no console a sequência de números a partir da entrada de um {@code Double} número.
	 * @param numero {@code Double}
	 */
	public void exibirSequencia(Double numero) {
		formato.setMaximumFractionDigits(13);
		System.out.println(
				"Para N = " + formato.format(numero)
				+ " A = " + formato.format(calcularSequencia(numero))
				);
		
	}
	
	
}

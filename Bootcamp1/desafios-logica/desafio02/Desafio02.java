package desafio02;

import java.text.DecimalFormat;

public class Desafio02 {
	
	private final String padrao = "##,###0.0#";
	private DecimalFormat formato = new DecimalFormat(padrao);
	
	private Double calcularSequencia(Double numero) {
		
		Double resultado = 0d;
		
		for (double i = 0; numero - i > 0; i++) {
			resultado += (numero - i)/(i + 1);
		}
		
		return resultado;
	}
	
	public void exibirSequencia(Double numero) {
		formato.setMaximumFractionDigits(13);
		System.out.println(
				"Para N = " + formato.format(numero)
				+ " A = " + formato.format(calcularSequencia(numero))
				);
		
	}
	
	
}

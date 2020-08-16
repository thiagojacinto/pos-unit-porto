package desafio07;

import java.text.NumberFormat;
import java.util.Locale;

public class Desafio07 {

	/**
	 * Cálculo do FATORIAL de um número.
	 * @param numero {@code Double}
	 * @return resultado do fatorial {@code Double}
	 */
	private Double calcularFatorial(Double numero) {

		if (numero < 1) {
			return 1d;
		}

		return numero * calcularFatorial(numero - 1); 

	}
	
	/**
	 * Calcula a subtração entre duas somas: a soma dos pares e dos ímpares contidos em um intervalo.
	 * @param intervalo {@code int[]}
	 * @return resultado da subtração {@code Double}
	 */
	private Double calcularSubtracaoDaSomaDosParesESomaDosImpares(int[] intervalo) {
		
		Double somaPares = 0d;
		Double somaImpares = 0d;
		
		for (int i = intervalo[0]; i <= intervalo[1]; i++) {
			
			if (i % 2 == 0) {
				somaPares += i;
			} else  {
				somaImpares += i;
			}
		}
		
		return somaPares - somaImpares;
	}
	
	/**
	 * Utiliza os métodos "{@code calcularSubtracaoDaSomaDosParesESomaDosImpares}" e "{@code calcularFatorial}"
	 * @param intervalo {@code int[]}
	 * @return resultado {@code Double} do cálculo composto: fatorial do resultado da subtração.
	 */
	private Double calculoComposto(int[] intervalo) {
		
		Double resultadoSubtracao = calcularSubtracaoDaSomaDosParesESomaDosImpares(intervalo);
		
		return calcularFatorial(resultadoSubtracao);
	}
	
	/**
	 * Exibe no console o resultado do cálculo composto pretendido.
	 * @param intervalo {@code int[]} contendo os limites inferior e superior.
	 */
	public void exibirResultadoCalculoComposto(int[] intervalo) {
		
		Double resultado = calculoComposto(intervalo);		
		System.out.println(
				NumberFormat
					.getInstance(new Locale("pt", "Brasil"))
					.format(resultado)
				);
	}
	
}

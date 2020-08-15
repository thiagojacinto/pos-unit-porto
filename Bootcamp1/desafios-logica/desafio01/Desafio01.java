package desafio01;

import java.text.NumberFormat;
import java.util.Locale;

public class Desafio01 {
	
	static final int MAX_CASAS = 64;
	static final Locale LOCAL = new Locale("pt", "Brasil");
	static final NumberFormat FORMATO_NUMERO = NumberFormat.getInstance(LOCAL);
	
	Double quantidade = 1d;
	Double soma = 0d;
	
	/**
	 * Exibe a representação da quantidade de grãos em cada casa do tabuleiro de Xadrez.
	 */
	public void apresentar() {
		
		for (int casa = 1; casa <= MAX_CASAS; casa++) {
			
			soma += quantidade;
			
			System.out.println(
//					String.format("Casa: %d - Qtd: %d - Soma: %d", casa, quantidade, soma)
					"Casa: " + FORMATO_NUMERO.format(casa)
					+ " - Qtd: " + FORMATO_NUMERO.format(quantidade)
					+ " - Soma: " + FORMATO_NUMERO.format(soma)
					);
			quantidade *= 2d;
		}
	}
}

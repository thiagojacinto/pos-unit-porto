package desafio04;

public class Desafio04 {
	
	/**
	 * Dada uma frase, separa as palavras pelo espaço " ".
	 * @param frase {@code String}
	 */
	private int separarPalavras(String frase) {
		
		int totalNaoNulo = 0;
		String[] particoesDaFrase = frase.split(" ");
//		System.out.println(" a frase dividida é :" + Arrays.toString(particoesDaFrase));	// DEBUG
		
		for (int i = 0; i < particoesDaFrase.length; i++) {
			
			if ( !particoesDaFrase[i].isBlank()) {
				
				totalNaoNulo++;
			}
		}
		
		return totalNaoNulo;
	}
	
	/**
	 * Dada uma frase {@code String} de entrada, exibe no console o total de palavras contidas (i.e. caracteres não nulos)
	 * @param frase {@code String}
	 */
	public void exibirTotalDePalavras(String frase) {
		int total = separarPalavras(frase);
		
		System.out.println(
				String.format("TOTAL DE PALAVRAS = %d", total)
				);
	}
	
}

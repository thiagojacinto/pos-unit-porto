package desafio06;

public class Desafio06 {
	
	/**
	 * A partir de uma frase {@code String[]}, retorna a palavra de maior extensão em caracteres.
	 * @param frase {@code String[]}
	 * @return palavra de maior extensão {@code String}
	 */
	private String maiorPalavra(String frase) {
		String[] particoes = frase.split(" ");
		
		String maiorPalavra = particoes[0];
		
		for (int index = 0; index < particoes.length; index++) {
			
			maiorPalavra = 
					maiorPalavra.length() < particoes[index].length()
					? particoes[index]
					: maiorPalavra;
		}
		
		return maiorPalavra;
	}
	
	/**
	 * Exibe no console a maior palavra de uma determinada frase.
	 * @param frase {@code String}
	 */
	public void exibirMaiorPalavra(String frase) {
		System.out.println(
				String.format("Maior Palavra = %s", maiorPalavra(frase))
				);
	}
}

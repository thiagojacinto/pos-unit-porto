package desafio03;

public class Desafio03 {
	
	/**
	 * Exibe formatado a quantidade de letras "A" contida em uma {@code String} de entrada.
	 * @param entrada {@code String}
	 */
	public void exibirLetrasA(String entrada) {
		
		int quantidadeDeLetrasA = contarLetrasA(entrada);
		
		System.out.println(
				String.format("TOTAL DE A = %d", quantidadeDeLetrasA)
				);
	}

	/**
	 * Conta a ocorrência de letras "A" na {@code String} de entrada.
	 * @param entrada {@code String} 
	 * @return {@code int} quantidade de letras "A"
	 */
	private int contarLetrasA(String entrada) {
		int contagem = 0;
		
		for (int i = 0; i < entrada.length(); i++) {
			
			Boolean comparaLetraA = entrada.substring(i, i + 1).toUpperCase().equals("A");
			
			if (comparaLetraA) {
				contagem++;
			}
		}
		
		return contagem;
	}
	
}

package quesito01;

public interface Publicacao {
	
	/**
	 * Permite a leitura de um livro
	 */
	public void abrir();
	
	/**
	 * Finaliza a leitura de um livro
	 */
	public void fechar();
	
	/**
	 * Permite a navegação entre as páginas válidas de um livro, respeitando os limites inicial e final do livro.
	 * @param pagina {@code int}
	 */
	public void folhear(int pagina);
	
	/**
	 * Passa da página atual para a próxima página, se houver.
	 */
	public void avancarPagina();
	
	/**
	 * Retonar da página atual para a página anterior, se houver.
	 */
	public void voltarPagina();
}

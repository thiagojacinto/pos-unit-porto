package quesito01;

public class Almanaque extends Livro {
	
	public Almanaque() {
		super();
	}
	
	/** Construtor com parametros:
	 * @param titulo {@code String}
	 * @param autor {@code String}
	 * @param totalPaginas {@code int}
	 */
	public Almanaque(String titulo, String autor, int totalPaginas) {
		super(titulo, autor, totalPaginas);
	}
	
	@Override
	public void folhear(int pagina) {
		
		if (this.getPaginaAtual() != 2) {
			System.err.println("Erro: é preciso estar no índice (Página 2) para folhear.");
			return;
		}
		
		super.folhear(pagina);
	}
	
	@Override
	public void avancarPagina() {
		
		if (!this.isAberto()) {
			System.err.println("Erro: é preciso abrir o livro para navegar por suas páginas.");
			return;
		}
		
		if (this.getPaginaAtual() > this.getTotalPaginas() - 2) {
			System.err.println("Erro: Só se pode navegar por páginas válidas, respeitando os limites inicial e final do livro."
					+ "\n > Almanaque avança de 2 em 2 páginas.");
			return;
		}
		
		this.setPaginaAtual(this.getPaginaAtual() + 2);
		
	}
}

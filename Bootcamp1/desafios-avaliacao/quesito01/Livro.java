package quesito01;

public class Livro implements Publicacao {
	
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro() {
		this.iniciarLivro();
	}

	/**
	 * Inicia um livro novo, configurando como aberto = {@code false} e a paginaAtual como zero.
	 */
	private void iniciarLivro() {
		this.aberto = false;
		this.paginaAtual = 0;
	}
	
	/** Construtor com parametros:
	 * @param titulo {@code String}
	 * @param autor {@code String}
	 * @param totalPaginas {@code int}
	 */
	public Livro(String titulo, String autor, int totalPaginas) {
		this.iniciarLivro();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
	}


	@Override
	public void abrir() {
		
		if (this.isAberto()) {
			System.err.println("Erro: O livro já está aberto.");
			return;
		}
		
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		
		if (!this.isAberto()) {
			System.err.println("Erro: O livro já está fechado.");
			return;
		}
		
		this.setAberto(false);
		
	}

	@Override
	public void folhear(int pagina) {
		
		if (!this.isAberto()) {
			System.err.println("Erro: é preciso abrir o livro para navegar por suas páginas.");
			return;
		}
		
		if (pagina < 0  || pagina > getTotalPaginas()) {
			System.err.println("Erro: Só se pode navegar por páginas válidas, respeitando os limites inicial e final do livro.");
			return;
		}
		
		this.setPaginaAtual(pagina);
		
	}

	@Override
	public void avancarPagina() {
		
		if (!this.isAberto()) {
			System.err.println("Erro: é preciso abrir o livro para navegar por suas páginas.");
			return;
		}
		
		if (this.getPaginaAtual() == getTotalPaginas()) {
			System.err.println("Erro: Só se pode navegar por páginas válidas, respeitando os limites inicial e final do livro.");
			return;
		}
		
		this.setPaginaAtual(this.getPaginaAtual() + 1);
		
	}

	@Override
	public void voltarPagina() {
		
		if (!this.isAberto()) {
			System.err.println("Erro: é preciso abrir o livro para navegar por suas páginas.");
			return;
		}
		
		if (this.getPaginaAtual() == 0) {
			System.err.println("Erro: Só se pode navegar por páginas válidas, respeitando os limites inicial e final do livro.");
			return;
		}
		
		this.setPaginaAtual(this.getPaginaAtual() - 1);
		
	}

	/**
	 * Deve retornar todas as informações do livro, inclusive o nome da Pessoa que está lendo o livro, separadas por vírgula, sem espaço.
	 * @return detalhes sobre o livro.
	 */
	public String detalhes() {
		return String.format("%s,%s,%s,%s,%s,%s",
				getTitulo(), getAutor(), getTotalPaginas(), getPaginaAtual(), isAberto(), getLeitor().getNome());
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the totalPaginas
	 */
	public int getTotalPaginas() {
		return totalPaginas;
	}

	/**
	 * @param totalPaginas the totalPaginas to set
	 */
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	/**
	 * @return the paginaAtual
	 */
	public int getPaginaAtual() {
		return paginaAtual;
	}

	/**
	 * @param paginaAtual the paginaAtual to set
	 */
	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	/**
	 * @return the aberto
	 */
	public boolean isAberto() {
		return aberto;
	}

	/**
	 * @param aberto the aberto to set
	 */
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	/**
	 * @return the leitor
	 */
	public Pessoa getLeitor() {
		return leitor;
	}

	/**
	 * @param leitor the leitor to set
	 * @throws Exception se o livro estiver aberto e já tiver sendo lido por alguma Pessoa.
	 */
	public void setLeitor(Pessoa leitor) throws Exception {
		
		if (this.isAberto() && this.getLeitor() != null) {
			throw new Exception("Erro: o livro já está sendo lido por " + this.getLeitor().getNome());
		}
		
		this.leitor = leitor;
	}

}

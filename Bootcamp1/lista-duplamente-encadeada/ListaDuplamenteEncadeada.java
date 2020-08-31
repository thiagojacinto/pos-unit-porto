package pkg;

public class ListaDuplamenteEncadeada<J> {
	
	private No<J> cabeca;
	private Long tamanho;
	
	public ListaDuplamenteEncadeada() {
		this.setTamanho(0L);
	}
	
	/**
	 * Exibe a quantidade de elementos da lista.
	 */
	public Long length() {
		return this.getTamanho();
	}
	
	/**
	 * Verifica se a lista está vazia.
	 * @return {@code boolean}
	 */
	public boolean isEmpty() {
		return this.getCabeca() == null ? true : false;
	}
	
	/**
	 * Elimina os dados da lista.
	 */
	public void clear() {
		this.setCabeca(null);
		this.setTamanho(0L);
	}
	
	/**
	 * Busca um determinado valor na lista.
	 * @param valor
	 * @return {@code boolean TRUE} se contiver o valor, {@code FALSE} caso contrário.
	 */
	public boolean contem(J valor) {
		
		if (!this.isEmpty()) {
			
			No<J> noProcurado = this.getCabeca();
			
			while (noProcurado != null && !noProcurado.getValor().equals(valor)) {
				noProcurado = noProcurado.getProximo();
			}
			
			if (noProcurado != null) {
				return noProcurado.getValor().equals(valor);
			}
		}
		
		return false;
	}
	
	/**
	 * Adiciona um valor ao final da lista
	 * @param valor
	 */
	public void add(J valor) {
		
		if (this.isEmpty()) {
			
			this.setCabeca(new No<J>(valor));
			this.setTamanho(this.getTamanho() + 1);
			return;
		}
		
		No<J> penultimoNo = this.getCabeca();
		
		while (penultimoNo.getProximo() != null) {
			penultimoNo = penultimoNo.getProximo();
		}
		
		penultimoNo.setProximo(new No<J>(valor));
		
		penultimoNo.getProximo().setAnterior(penultimoNo);
		this.setTamanho(this.getTamanho() + 1);
	}

	/**
	 * Remove o primeiro elemento da lista
	 * @throws Exception caso a lista esteja vazia.
	 */
	public void removerPrimeiro() throws Exception {
		
		if (this.isEmpty()) {
			throw new Exception("Erro ao remover de lista vazia.");
		}
		
		if (this.getCabeca().getProximo() == null) {
			this.setCabeca(null);
			this.setTamanho(0L);
			return;
		}
		
		No<J> novaCabeca = new No<J>();
		
		this.getCabeca().getProximo().setAnterior(null);
		novaCabeca.setProximo(this.getCabeca().getProximo().getProximo());
		novaCabeca.setValor(this.getCabeca().getProximo().getValor());
		
		this.setCabeca(novaCabeca);
		this.setTamanho(this.getTamanho() - 1);
	}
	
	/**
	 * Remove o último elemento da lista
	 * @throws Exception
	 */
	public void removerUltimo() throws Exception {
		
		if (this.isEmpty()) {
			throw new Exception("Erro ao remover de lista vazia.");
		}
		
		if (this.length() <= 1) {
			this.setCabeca(null);
			this.setTamanho(0L);
			return;
		}
		
		No<J> penultimoNo = this.getCabeca();
		
		while (penultimoNo.getProximo().getProximo() != null) {
			penultimoNo = penultimoNo.getProximo();
		}
		
		penultimoNo.setProximo(null);
		
		this.setTamanho(this.getTamanho() - 1);
		
	}
	
	public void remover(J valor) throws Exception {
		
		if (this.isEmpty()) {
			throw new Exception("Erro ao remover de lista vazia.");
		}
		
		No<J> noProcurado = this.getCabeca();
		
		while (noProcurado != null && !noProcurado.getValor().equals(valor)) {
			
			noProcurado = noProcurado.getProximo();
		}
		
		if (noProcurado == null) {
			System.out.println("Remoção não realizada: Valor " + valor + " não encontrado.");
			return;
		}
		
		if (noProcurado.getAnterior() == null) {
			this.removerPrimeiro();
			return;
		}
		
		if (noProcurado.getProximo() == null) {
			this.removerUltimo();
			return;
		}
		
		noProcurado.getAnterior().setProximo(noProcurado.getProximo());
		noProcurado.getProximo().setAnterior(noProcurado.getAnterior());
		
		this.setTamanho(this.getTamanho() - 1);
	}
	
	/**
	 * @return the cabeca
	 */
	public No<J> getCabeca() {
		return cabeca;
	}

	/**
	 * @param cabeca the cabeca to set
	 */
	public void setCabeca(No<J> cabeca) {
		this.cabeca = cabeca;
	}

	/**
	 * @return the tamanho
	 */
	private Long getTamanho() {
		return tamanho;
	}

	/**
	 * @param tamanho the tamanho to set
	 */
	public void setTamanho(Long tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("[ ");
		
		for (No<J> no = this.getCabeca(); no != null; no = no.getProximo()) {
			builder
				.append(no.getValor())
				.append(no.getProximo() == null ? "" : ", ");
		}
	
		builder.append(" ]");

		return builder.toString();
	}
	
}

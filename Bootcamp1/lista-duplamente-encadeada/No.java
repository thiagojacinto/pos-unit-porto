package pkg;

public class No<J> {
	
	private J valor;
	private No<J> proximo;
	private No<J> anterior;
	
	public No() {
		
	}
	/**
	 * Construtor de No<J> apenas passando o <J> Valor.
	 * @param valor
	 */
	public No(J valor) {
		this.valor = valor;
	}
	
	/**
	 * Construtor para incluir o valor, o No<J> anterior e No<J> proximo
	 * @param valor
	 * @param anterior
	 * @param proximo
	 */
	public No(J valor, No<J> anterior, No<J> proximo) {
		this.valor = valor;
		this.anterior = anterior;
		this.proximo = proximo;
	}

	/**
	 * @return the valor
	 */
	public J getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(J valor) {
		this.valor = valor;
	}

	/**
	 * @return the proximo
	 */
	public No<J> getProximo() {
		return proximo;
	}

	/**
	 * @param proximo the proximo to set
	 */
	public void setProximo(No<J> proximo) {
		this.proximo = proximo;
	}

	/**
	 * @return the anterior
	 */
	public No<J> getAnterior() {
		return anterior;
	}

	/**
	 * @param anterior the anterior to set
	 */
	public void setAnterior(No<J> anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nó [ valor = ").append(valor).append(", proximo = ").append(proximo).append(", anterior = ")
				.append(anterior).append("]");
		return builder.toString();
	}
	
}

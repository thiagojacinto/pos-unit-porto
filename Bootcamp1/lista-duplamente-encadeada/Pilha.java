package pkg;

public class Pilha<J> {
	
	private ListaDuplamenteEncadeada<J> lista;
	
	public Pilha() {
		lista = new ListaDuplamenteEncadeada<J>();
	}
	
	/**
	 * Adiciona um novo valor a pilha.
	 * @param valor
	 */
	public void push(J valor) {
		lista.add(valor);
	}
	
	/**
	 * Remove o valor da pilha.
	 * @throws Exception caso não encontre.
	 */
	public void pop() throws Exception {
		lista.removerUltimo();
	}
}

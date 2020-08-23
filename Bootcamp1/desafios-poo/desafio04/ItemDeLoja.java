package desafio04;

public class ItemDeLoja {
	
	private int codigoDoItem;
	private String nomeDoItem;
	private String descricaoDoItem;
	private double valorDoItem;
	
	/**
	 * @return the codigoDoItem
	 */
	public int getCodigoDoItem() {
		return codigoDoItem;
	}

	/**
	 * @return the nomeDoItem
	 */
	public String getNomeDoItem() {
		return nomeDoItem;
	}

	/**
	 * @return the descricaoDoItem
	 */
	public String getDescricaoDoItem() {
		return descricaoDoItem;
	}

	/**
	 * @return the valorDoItem
	 */
	public double getValorDoItem() {
		return valorDoItem;
	}

	/**
	 * @param codigoDoItem the codigoDoItem to set
	 */
	public void setCodigoDoItem(int codigoDoItem) {
		this.codigoDoItem = codigoDoItem;
	}

	/**
	 * @param nomeDoItem the nomeDoItem to set
	 */
	public void setNomeDoItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	}

	/**
	 * @param descricaoDoItem the descricaoDoItem to set
	 */
	public void setDescricaoDoItem(String descricaoDoItem) {
		this.descricaoDoItem = descricaoDoItem;
	}

	/**
	 * @param valorDoItem the valorDoItem to set
	 */
	public void setValorDoItem(double valorDoItem) {
		this.valorDoItem = valorDoItem;
	}
	
	/**
	 * Deve retornar o identificador.
	 * @return {@code int} Identificador
	 */
	public int getIdentificador() {
		return this.getCodigoDoItem();
	}
}

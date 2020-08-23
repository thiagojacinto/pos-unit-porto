package desafio11;

public class ZonaEleitoral {
	
	private Eleitor[] eleitores;
	private String endereco;
	private String cep;
	
	public ZonaEleitoral() {
	}
	
	public ZonaEleitoral(Eleitor[] eleitores, String endereco, String cep) {
		this.eleitores = eleitores;
		this.endereco = endereco;
		this.cep = cep;
	}

	/**
	 * @return the eleitores
	 */
	public Eleitor[] getEleitores() {
		return eleitores;
	}

	/**
	 * @param eleitores the eleitores to set
	 */
	public void setEleitores(Eleitor[] eleitores) {
		this.eleitores = eleitores;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
}

package desafio06;

public class Dependente {
	
	private int sequencial;
	private String nomeCompleto;
	private Integer sexo;
	private String dataDeNascimento;
	private boolean participaPlano;
	
	/**
	 * @return the sequencial
	 */
	public int getSequencial() {
		return sequencial;
	}
	/**
	 * @return the nomeCompleto
	 */
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	/**
	 * @return the sexo
	 */
	public Integer getSexo() {
		return sexo;
	}
	/**
	 * @return the dataDeNascimento
	 */
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	/**
	 * @return the participaPlano
	 */
	public boolean isParticipaPlano() {
		return participaPlano;
	}
	/**
	 * @param sequencial the sequencial to set
	 */
	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}
	/**
	 * @param nomeCompleto the nomeCompleto to set
	 */
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}
	/**
	 * @param dataDeNascimento the dataDeNascimento to set
	 */
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	/**
	 * @param participaPlano the participaPlano to set
	 */
	public void setParticipaPlano(boolean participaPlano) {
		this.participaPlano = participaPlano;
	}
}

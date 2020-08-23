package desafio09;

public class PessoaJuridica {
	
	private int id;
	private String cnpj;
	private PessoaFisica responsavel;
	private Adotante adotante;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	/**
	 * @return the responsavel
	 */
	public PessoaFisica getResponsavel() {
		return responsavel;
	}
	/**
	 * @return the adotante
	 */
	public Adotante getAdotante() {
		return adotante;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	/**
	 * @param responsavel the responsavel to set
	 */
	public void setResponsavel(PessoaFisica responsavel) {
		this.responsavel = responsavel;
	}
	/**
	 * @param adotante the adotante to set
	 */
	public void setAdotante(Adotante adotante) {
		this.adotante = adotante;
	}
	
}

package desafio09;

public class PessoaFisica {
	private int id;
	private String cpf;
	private String rg;
	private char genero;
	private Adotante adotante;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	/**
	 * @return the genero
	 */
	public char getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}
	/**
	 * @return the adotante
	 */
	public Adotante getAdotante() {
		return adotante;
	}
	/**
	 * @param adotante the adotante to set
	 */
	public void setAdotante(Adotante adotante) {
		this.adotante = adotante;
	}
	
}

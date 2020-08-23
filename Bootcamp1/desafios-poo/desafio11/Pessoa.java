package desafio11;

public class Pessoa {
	private String nome;
	private boolean pessoaJuridica;
	private String cpf;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, boolean pessoaJuridica, String cpf) {
		this.nome = nome;
		this.pessoaJuridica = pessoaJuridica;
		this.cpf = cpf;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the pessoaJuridica
	 */
	public boolean isPessoaJuridica() {
		return pessoaJuridica;
	}
	/**
	 * @param pessoaJuridica the pessoaJuridica to set
	 */
	public void setPessoaJuridica(boolean pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
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
	
	
}

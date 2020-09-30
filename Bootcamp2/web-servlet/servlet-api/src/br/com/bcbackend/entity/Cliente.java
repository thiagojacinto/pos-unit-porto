package br.com.bcbackend.entity;

import java.sql.Date;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String email;
	private String cpf;
	private Date dataNascimento;
	private String sexo;
	private String nomeSocial;
	private String apelido;
	private String telefone;
	
	public Cliente() {
	}
	
	
	/**
	 * @param nome
	 * @param email
	 * @param cpf
	 * @param dataNascimento
	 * @param sexo
	 * @param nomeSocial
	 * @param apelido
	 * @param telefone
	 */
	public Cliente( String nome, String email, String cpf, Date dataNascimento, String sexo,
			String nomeSocial, String apelido, String telefone) {

		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.nomeSocial = nomeSocial;
		this.apelido = apelido;
		this.telefone = telefone;
	}
	
	
	/**
	 * @param nome
	 * @param email
	 * @param cpf
	 */
	public Cliente(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the nomeSocial
	 */
	public String getNomeSocial() {
		return nomeSocial;
	}
	/**
	 * @param nomeSocial the nomeSocial to set
	 */
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}
	/**
	 * @return the apelido
	 */
	public String getApelido() {
		return apelido;
	}
	/**
	 * @param apelido the apelido to set
	 */
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}

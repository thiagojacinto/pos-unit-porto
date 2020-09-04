package quesito01;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	private List<Livro> livros;
	
	public Pessoa() {
		this.livros = new ArrayList<Livro>();
	}
	/**
	 * Construtor setando o nome, idade e o sexo
	 * @param nome {@code String}
	 * @param idade {@code int}
	 * @param sexo {@code String}
	 */
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.livros = new ArrayList<Livro>();
	}
	
	/**
	 * Deve incrementar a idade da Pessoa.
	 */
	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
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
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
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
	 * @return the livros
	 */
	public List<Livro> getLivros() {
		return livros;
	}
	
}

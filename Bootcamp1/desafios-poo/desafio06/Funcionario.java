package desafio06;

import java.util.List;

public class Funcionario {
	
	private Integer matricula;
	private String nomeCompleto;
	private String cpf;
	private Integer sexo;
	private String dataDeNascimento;
	private double salario;
	private int telefone;
	private List<Dependente> dependentes;
	
	/**
	 * @return the matricula
	 */
	public Integer getMatricula() {
		return matricula;
	}
	/**
	 * @return the nomeCompleto
	 */
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
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
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @return the telefone
	 */
	public int getTelefone() {
		return telefone;
	}
	/**
	 * @return the dependentes
	 */
	public List<Dependente> getDependentes() {
		return dependentes;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	/**
	 * @param nomeCompleto the nomeCompleto to set
	 */
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	/**
	 * @param dependentes the dependentes to set
	 */
	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	
}

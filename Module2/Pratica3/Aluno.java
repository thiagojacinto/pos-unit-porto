package introOO;

public class Aluno {
	int matricula;
	String cpf, nome;

	// Auto getters and setters:
	public int getMatricula() {
		return matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", cpf=" + cpf + ", nome=" + nome + "]";
	}
	
}

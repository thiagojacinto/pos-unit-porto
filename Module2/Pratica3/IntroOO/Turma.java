package introOO;

public class Turma {
	int Identificador;
	String descricao;
	//ArrayList<Aluno> alunos  = new ArrayList<Aluno>();
	
	
	// AUTO Getters and Setters
	public final int getIdentificador() {
		return Identificador;
	}
	public final String getDescricao() {
		return descricao;
	}
//	/**
//	 * @return the alunos
//	 */
//	public final ArrayList<Aluno> getAlunos() {
//		return alunos;
//	}
//	
	public final void setIdentificador(int identificador) {
		Identificador = identificador;
	}
	public final void setDescricao(String descricao) {
		this.descricao = descricao;
	}
//	/**
//	 * @param alunos the alunos to set
//	 */
//	public final void setAlunos(ArrayList<Aluno> alunos) {
//		this.alunos = alunos;
//	}
	@Override
	public String toString() {
		return String.format("Turma [Identificador=%s, descricao=%s]", Identificador, descricao);
	}

	
	
}

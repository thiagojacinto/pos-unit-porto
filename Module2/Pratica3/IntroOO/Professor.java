package introOO;

import java.util.ArrayList;

public class Professor {
	int matricula;
	String cpfString, nomeString;
	ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	// Auto Getters and Setters
	protected final int getMatricula() {
		return matricula;
	}
	protected final String getCpfString() {
		return cpfString;
	}
	protected final String getNomeString() {
		return nomeString;
	}
	protected final ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	protected final void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	protected final void setCpfString(String cpfString) {
		this.cpfString = cpfString;
	}
	protected final void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}
	final void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	@Override
	public String toString() {
		return String.format("Professor [matricula=%s, cpfString=%s, nomeString=%s, disciplinas=%s]", matricula,
				cpfString, nomeString, disciplinas);
	}
	

}

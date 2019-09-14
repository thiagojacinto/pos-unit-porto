package introOO;

import java.util.ArrayList;

public class Disciplina {
	int identifier;
	String descriptionString, materialString;
	ArrayList<Turma> turmas = new ArrayList<Turma>();
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	ArrayList<Professor> prof = new ArrayList<Professor>();
	
	public final int getIdentifier() {
		return identifier;
	}
	public final String getDescriptionString() {
		return descriptionString;
	}
	public final String getMaterialString() {
		return materialString;
	}
	public final ArrayList<Turma> getTurmas() {
		return turmas;
	}
	public final ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public final ArrayList<Professor> getProf() {
		return prof;
	}
	public final void setIdentifier(int identifier) {
		this.identifier = identifier;
	}
	public final void setDescriptionString(String descriptionString) {
		this.descriptionString = descriptionString;
	}
	public final void setMaterialString(String materialString) {
		this.materialString = materialString;
	}
	public final void setTurmas(ArrayList<Turma> turmas) {
		this.turmas = turmas;
	}
	public final void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public final void setProf(ArrayList<Professor> prof) {
		this.prof = prof;
	}
	
	
}

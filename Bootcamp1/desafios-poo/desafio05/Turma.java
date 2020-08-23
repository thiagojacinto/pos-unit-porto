package desafio05;

import java.util.List;

public class Turma {
	
	private String cod;
	private Integer turno;
	private Integer sala;
	private List<Aluno> alunos;
	/**
	 * @return the cod
	 */
	public String getCod() {
		return cod;
	}
	/**
	 * @return the turno
	 */
	public Integer getTurno() {
		return turno;
	}
	/**
	 * @return the sala
	 */
	public Integer getSala() {
		return sala;
	}
	/**
	 * @return the alunos
	 */
	public List<Aluno> getAlunos() {
		return alunos;
	}
	/**
	 * @param cod the cod to set
	 */
	public void setCod(String cod) {
		this.cod = cod;
	}
	/**
	 * @param turno the turno to set
	 */
	public void setTurno(Integer turno) {
		this.turno = turno;
	}
	/**
	 * @param sala the sala to set
	 */
	public void setSala(Integer sala) {
		this.sala = sala;
	}
	/**
	 * @param alunos the alunos to set
	 */
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}

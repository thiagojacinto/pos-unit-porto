package desafio11;

import java.util.Calendar;

//Seria voto?
public class Votar {
	
	private int candidatoID;
	private int eleitorID;
	private Calendar data;
	private String cargoCandidato;
	
	public Votar() {
	}
	
	/*
	 * Construtor para voto registrado naquele instante.
	 */
	public Votar(int candidatoID, int eleitorID, String cargoCandidato) {
		this.candidatoID = candidatoID;
		this.eleitorID = eleitorID;
		this.data = Calendar.getInstance();
		this.cargoCandidato = cargoCandidato;
	}
	
	public Votar(int candidatoID, int eleitorID, Calendar data, String cargoCandidato) {
		this.candidatoID = candidatoID;
		this.eleitorID = eleitorID;
		this.data = data;
		this.cargoCandidato = cargoCandidato;
	}

	/**
	 * @return the candidatoID
	 */
	public int getCandidatoID() {
		return candidatoID;
	}

	/**
	 * @param candidatoID the candidatoID to set
	 */
	public void setCandidatoID(int candidatoID) {
		this.candidatoID = candidatoID;
	}

	/**
	 * @return the eleitorID
	 */
	public int getEleitorID() {
		return eleitorID;
	}

	/**
	 * @param eleitorID the eleitorID to set
	 */
	public void setEleitorID(int eleitorID) {
		this.eleitorID = eleitorID;
	}

	/**
	 * @return the data
	 */
	public Calendar getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Calendar data) {
		this.data = data;
	}

	/**
	 * @return the cargoCandidato
	 */
	public String getCargoCandidato() {
		return cargoCandidato;
	}

	/**
	 * @param cargoCandidato the cargoCandidato to set
	 */
	public void setCargoCandidato(String cargoCandidato) {
		this.cargoCandidato = cargoCandidato;
	}
	
	/**
	 * Registra o voto
	 */
	public void votar() {
		System.out.println(this.getClass().getName() + " > votar(): void");
	}
	/**
	 * Cancela o voto
	 */
	public void cancelar() {
		System.out.println(this.getClass().getName() + " > cancelar(): void");
	}
	
}

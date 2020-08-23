package desafio11;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ServidorDeVotos {
	private int candidatoID;
	private int eleitorID;
	private Calendar data;
	private int contaVotos;
	private List<Votar> votos;
	
	public ServidorDeVotos() {
		votos = new ArrayList<Votar>();
	}

	public ServidorDeVotos(int candidatoID, int eleitorID, Calendar data, int contaVotos, List<Votar> votos) {
		this.candidatoID = candidatoID;
		this.eleitorID = eleitorID;
		this.data = data;
		this.contaVotos = contaVotos;
		this.votos = votos;
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
	 * @return the contaVotos
	 */
	public int getContaVotos() {
		return contaVotos;
	}

	/**
	 * @param contaVotos the contaVotos to set
	 */
	public void setContaVotos(int contaVotos) {
		this.contaVotos = contaVotos;
	}
	
	/**
	 * @return the votos
	 */
	public List<Votar> getVotos() {
		return votos;
	}

	/**
	 * @param votos the votos to set
	 */
	public void setVotos(List<Votar> votos) {
		this.votos = votos;
	}

	public int contarVotos() {
		System.out.println(this.getClass().getName() + " > contarVotos(): int");
		
		this.setContaVotos(this.getVotos().size());
		
		return this.getContaVotos();
	}
}

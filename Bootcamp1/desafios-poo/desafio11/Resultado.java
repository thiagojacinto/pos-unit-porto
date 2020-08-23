package desafio11;

import java.util.ArrayList;
import java.util.List;

public class Resultado {
	
	private int candidatoID;
	private List<ServidorDeVotos> servidores;
	
	public Resultado() {
		servidores = new ArrayList<ServidorDeVotos>();
	}

	public Resultado(int candidatoID, List<ServidorDeVotos> servidores) {
		this.candidatoID = candidatoID;
		this.servidores = servidores;
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
	 * @return the servidores
	 */
	public List<ServidorDeVotos> getServidores() {
		return servidores;
	}

	/**
	 * @param servidores the servidores to set
	 */
	public void setServidores(List<ServidorDeVotos> servidores) {
		this.servidores = servidores;
	}
	
	/**
	 * Retorna o total de votos.
	 * @return total de votos.
	 */
	public int getTotalVotos() {
		System.out.println(this.getClass().getName() + " > getTotalVotos(): void");

		return servidores.stream()
				.map(servidor -> servidor.contarVotos())
				.reduce(0, (totalDeVotos, votos) -> totalDeVotos + votos);
	}
	
	public void divulgarVencedor() {
		System.out.println(this.getClass().getName() + " > divulgarVencedor(): void");
		
	}
	
}

package desafio11;

public class TER extends ZonaEleitoral {
	private int numeroZona;

	public TER() {
	}
	
	public TER(int numeroZona) {
		this.numeroZona = numeroZona;
	}

	/**
	 * @return the numeroZona
	 */
	public int getNumeroZona() {
		return numeroZona;
	}

	/**
	 * @param numeroZona the numeroZona to set
	 */
	public void setNumeroZona(int numeroZona) {
		this.numeroZona = numeroZona;
	}
	
}

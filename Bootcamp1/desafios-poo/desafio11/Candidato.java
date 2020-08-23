package desafio11;

public class Candidato extends Pessoa {
	private int cadidatoID;
	private String cargo;
	private Partido partido;
	private boolean resultado;
	private String uf;
	
	public Candidato() {
	}

	public Candidato(int cadidatoID, String cargo, Partido partido, boolean resultado, String uf) {
		this.cadidatoID = cadidatoID;
		this.cargo = cargo;
		this.partido = partido;
		this.resultado = resultado;
		this.uf = uf;
	}

	/**
	 * @return the cadidatoID
	 */
	public int getCadidatoID() {
		return cadidatoID;
	}

	/**
	 * @param cadidatoID the cadidatoID to set
	 */
	public void setCadidatoID(int cadidatoID) {
		this.cadidatoID = cadidatoID;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return the partido
	 */
	public Partido getPartido() {
		return partido;
	}

	/**
	 * @param partido the partido to set
	 */
	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	/**
	 * @return the resultado
	 */
	public boolean isResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public int candidatura() {
		System.out.println(this.getClass().getName() + " > candidatura(): int");

		return 1;
	}
}

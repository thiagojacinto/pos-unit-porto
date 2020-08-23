package desafio11;

public class Eleitor extends Pessoa {
	
	private String endereco;
	private int eleitorID;
	private ZonaEleitoral zonaEleitoral;
	
	public Eleitor() {
	}

	public Eleitor(String endereco, int eleitorID) {
		super();
		this.endereco = endereco;
		this.eleitorID = eleitorID;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	 * @return the zonaEleitoral
	 */
	public ZonaEleitoral getZonaEleitoral() {
		return zonaEleitoral;
	}

	/**
	 * @param zonaEleitoral the zonaEleitoral to set
	 */
	public void setZonaEleitoral(ZonaEleitoral zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}
	
	/**
	 * Validar identidade do eleitor.
	 * @return 1
	 */
	public int validar() {
		System.out.println(this.getClass().getName() + " > validar()");
		return 1;
	}
}

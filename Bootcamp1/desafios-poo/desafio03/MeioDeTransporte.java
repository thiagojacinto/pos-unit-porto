package desafio03;

public abstract class MeioDeTransporte {
	
	private int id;
	private short ano;
	private String modelo;
	private double carga_maxima;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the ano
	 */
	public short getAno() {
		return ano;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @return the carga_maxima
	 */
	public double getCarga_maxima() {
		return carga_maxima;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param ano the ano to set
	 */
	public void setAno(short ano) {
		this.ano = ano;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @param carga_maxima the carga_maxima to set
	 */
	public void setCarga_maxima(double carga_maxima) {
		this.carga_maxima = carga_maxima;
	}
	
	public abstract double consumo();
}

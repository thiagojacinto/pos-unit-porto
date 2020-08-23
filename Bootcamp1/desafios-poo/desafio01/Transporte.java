package desafio01;

public class Transporte {
	
	private Integer id;
	private Integer ano;
	private String modelo;
	private Double carga_maxima;
	private Double potencia;
	
	public Transporte() {
		
	}

	public Transporte(Integer id, Integer ano, String modelo, Double carga_maxima, Double potencia) {
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.carga_maxima = carga_maxima;
		this.potencia = potencia;
	}
	
	/**
	 * O cálculo do consumo leva em conta a {@code POTENCIA} e a {@code CARGA MÁXIMA} do transporte.
	 * @return o consumo calculado: {@code Double}.
	 */
	public Double consumo() {
		
		return this.potencia * this.carga_maxima * 100;
	}
	
	/**
	 * Devolve o modelo do Transporte: {@code String}
	 * @return modelo do Transporte: {@code String}
	 */
	public String leiaModelo() {
//		return this.modelo;
		return this.getModelo();
	}
	
	/**
	 * Possibilita a alteração do modelo do Transporte.
	 * @param modelo: {@code String}
	 */
	public void gravaModelo(String modelo) {
//		this.modelo = modelo;
		this.setModelo(modelo);
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the ano
	 */
	public Integer getAno() {
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
	public Double getCarga_maxima() {
		return carga_maxima;
	}

	/**
	 * @return the potencia
	 */
	public Double getPotencia() {
		return potencia;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(Integer ano) {
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
	public void setCarga_maxima(Double carga_maxima) {
		this.carga_maxima = carga_maxima;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}
	
	
}

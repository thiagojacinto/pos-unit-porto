package desafio07;

import java.util.Date;

public class Carro {
	
	private String chassi;
	private String cor;
	private int anoFabricacao;
	private int anoModelo;
	private Date dataEntrada;
	private Modelo modelo;
	
	/**
	 * @return the chassi
	 */
	public String getChassi() {
		return chassi;
	}
	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * @return the anoFabricacao
	 */
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	/**
	 * @return the anoModelo
	 */
	public int getAnoModelo() {
		return anoModelo;
	}
	/**
	 * @return the dataEntrada
	 */
	public Date getDataEntrada() {
		return dataEntrada;
	}
	/**
	 * @return the modelo
	 */
	public Modelo getModelo() {
		return modelo;
	}
	/**
	 * @param chassi the chassi to set
	 */
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
	/**
	 * @param anoFabricacao the anoFabricacao to set
	 */
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	/**
	 * @param anoModelo the anoModelo to set
	 */
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	/**
	 * @param dataEntrada the dataEntrada to set
	 */
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
}

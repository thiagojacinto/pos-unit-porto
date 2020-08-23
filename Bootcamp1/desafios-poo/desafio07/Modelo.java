package desafio07;

import java.util.List;

public class Modelo {
	
	private int codigo;
	private String marca;
	private String nome;
	private double motor;
	private int serie;
	private List<Item> items;
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the motor
	 */
	public double getMotor() {
		return motor;
	}
	/**
	 * @return the serie
	 */
	public int getSerie() {
		return serie;
	}
	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @param motor the motor to set
	 */
	public void setMotor(double motor) {
		this.motor = motor;
	}
	/**
	 * @param serie the serie to set
	 */
	public void setSerie(int serie) {
		this.serie = serie;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}

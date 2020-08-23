package desafio09;

import java.util.Date;

public class Adocao {
	private int id;
	private Animal animal;
	private Adotante adotante;
	private Date dataAdocao;
	private Date dataDevolucao;
	private Usuario usuario;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the animal
	 */
	public Animal getAnimal() {
		return animal;
	}
	/**
	 * @param animal the animal to set
	 */
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	/**
	 * @return the adotante
	 */
	public Adotante getAdotante() {
		return adotante;
	}
	/**
	 * @param adotante the adotante to set
	 */
	public void setAdotante(Adotante adotante) {
		this.adotante = adotante;
	}
	/**
	 * @return the dataAdocao
	 */
	public Date getDataAdocao() {
		return dataAdocao;
	}
	/**
	 * @param dataAdocao the dataAdocao to set
	 */
	public void setDataAdocao(Date dataAdocao) {
		this.dataAdocao = dataAdocao;
	}
	/**
	 * @return the dataDevolucao
	 */
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	/**
	 * @param dataDevolucao the dataDevolucao to set
	 */
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}

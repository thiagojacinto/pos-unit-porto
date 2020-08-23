package desafio04;

public class Ferramenta extends ItemDeLoja {
	
	private String categoria;
	private Integer serial;
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @return the serial
	 */
	public Integer getSerial() {
		return serial;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	/**
	 * @param serial the serial to set
	 */
	public void setSerial(Integer serial) {
		this.serial = serial;
	}
	
	@Override
	public int getIdentificador() {
		return this.getSerial();
	}
	
	public void separar() {
		this.setCategoria("Outros");
	}
	
	public void separar(String categoria) {
		this.setCategoria(categoria);
	}
}

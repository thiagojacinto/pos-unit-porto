package desafio12;

public class RelogioImpl implements Relogio {
	private String marca;
	private String tipo;
	
	public RelogioImpl() {
	}

	public RelogioImpl(String marca, String tipo) {
		this.marca = marca;
		this.tipo = tipo;
	}
	
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void ajustarHora() {
		System.out.println(this.getClass().getName() + " > ajustarHora(): void");		
	}

	@Override
	public void ajustarAlarme() {
		System.out.println(this.getClass().getName() + " > ajustarAlarme(): void");		
		
	}

}

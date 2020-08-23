package desafio12;

public class RadioRelogio implements Radio, Relogio {
	
	private String marca;
	
	public RadioRelogio() {
	}
	
	public RadioRelogio(String marca) {
		this.marca = marca;
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

	@Override
	public void ajustarHora() {
		System.out.println(this.getClass().getName() + " > ajustarHora(): void");		
	}

	@Override
	public void ajustarAlarme() {
		System.out.println(this.getClass().getName() + " > ajustarAlarme(): void");		
		
	}

	@Override
	public void mudarEstacao() {
		System.out.println(this.getClass().getName() + " > mudarEstacao(): void");		
		
	}

	@Override
	public void tocar() {
		System.out.println(this.getClass().getName() + " > tocar(): void");		
		
	}

}

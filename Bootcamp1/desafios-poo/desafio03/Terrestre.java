package desafio03;

public class Terrestre extends MeioDeTransporte {

	private int qtdeRodas;
	private double potencia;
	
	/**
	 * @return the qtdeRodas
	 */
	public int getQtdeRodas() {
		return qtdeRodas;
	}

	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * @param qtdeRodas the qtdeRodas to set
	 */
	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public double consumo() {
		
		return this.getPotencia() * this.getCarga_maxima() * 100;
	}

}

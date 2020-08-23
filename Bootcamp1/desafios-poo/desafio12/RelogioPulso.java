package desafio12;

public class RelogioPulso extends RelogioImpl {
	private int tipoPulseira;
	
	public RelogioPulso() {
		super();
	}

	public RelogioPulso(int tipoPulseira) {
		super();
		this.tipoPulseira = tipoPulseira;
	}

	/**
	 * @return the tipoPulseira
	 */
	public int getTipoPulseira() {
		return tipoPulseira;
	}

	/**
	 * @param tipoPulseira the tipoPulseira to set
	 */
	public void setTipoPulseira(int tipoPulseira) {
		this.tipoPulseira = tipoPulseira;
	}
	
}

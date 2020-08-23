package desafio04;

public class Alimento extends ItemDeLoja {
	
	private Integer selo;

	/**
	 * @return the selo
	 */
	public Integer getSelo() {
		return selo;
	}

	/**
	 * @param selo the selo to set
	 */
	public void setSelo(Integer selo) {
		this.selo = selo;
	}
	
	@Override
	public int getIdentificador() {
		return this.getSelo();
	}
}

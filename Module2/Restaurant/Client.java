package entities;

public class Client {
	String name;
	float wallet;


	// Setters and Getters

	public final String getName() {
		return name;
	}
	public final float getWallet() {
		return Math.round(wallet);
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final void setWallet(float wallet) {
		this.wallet = wallet;
	}
}

package entities;

public class Foodstuffs {
	// ATTRIBUTES
	String description, type;
	float volume, price;

	// METHODS


	// Setters and Getters

	public final String getDescription() {
		return this.description;
	}
	public final float getVolume() {
		return this.volume;
	}
	public float getPrice() {
		return price;
	}
	public final void setDescription(String descriString) {
		this.description = descriString;
	}
	public final void setVolume(float volume) {
		this.volume = volume;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}

package week1d2.parking;

public class Moto {
	private int durability;
	public String model;
	public int currentDurability;
	public int price;
	public Biker owner;
	
	public Moto(String model, int price, int durability) {
		this.model = model;
		this.price = price;
		this.durability = durability;
	}

	public int getDurability() {
		return durability;
	}
}

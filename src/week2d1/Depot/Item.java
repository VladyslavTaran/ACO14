package week2d1.Depot;

public class Item {
	private String name;
	private Size size;
	private Client client;
	private int price;
	
	public Item(String name, Size size, Client client, int price) {
		super();
		this.name = name;
		this.size = size;
		this.client = client;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

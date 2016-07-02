package week1d1;

public class Address {
	

	String city;
	String street;
	int houseNumber;
	
	public Address(String city, String street, int houseNumber) {
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
	}

		
	@Override
	public String toString() {
		return String.format("[city=%s, street=%s, houseNumber=%s]", city, street, houseNumber);
	}
}
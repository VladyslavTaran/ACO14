package week1d1;

public class Contact {
	private static int Id;
	
	int id;
	String name;
	int age;
	String phone;
	Address address;

	Contact(String name, int age, String phone, Address address){
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		id = Id;
		Id++;
	}
	
	public int getId() {
		return id;
	}
	
	public String toJson(){
		return String.format("{ \n \"name\" : \"%s\",\n \"phone\" : \"%s\",\n \"address\": {\n\t\"city\": \"%s\",\n\t\"street\": \"%s\",\n\t\"num\": %s\n\t}\n}", name, phone, address.city, address.street, address.houseNumber);
	}

	@Override
	public String toString() {
		return String.format("[name=%s, age=%s, phone=%s]", name, age, phone);
	}
	
}

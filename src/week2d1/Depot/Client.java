package week2d1.Depot;

public class Client {
	private String phone;
	private Passport passport;
	
	public Client(String phone, Passport passport) {
		this.phone = phone;
		this.passport = passport;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
}

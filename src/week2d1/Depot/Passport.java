package week2d1.Depot;

public class Passport {
	private String firstName;
	private String lastName;
	private String passportNumber;
	
	public Passport(String firstName, String lastName, String passportNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.passportNumber = passportNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
}

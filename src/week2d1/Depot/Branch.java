package week2d1.Depot;

public class Branch {
	private int numBranch;
	private Address address;
	
	public Branch(int numBranch, Address address) {
		this.numBranch = numBranch;
		this.address = address;
	}
	
	public int getNumBranch() {
		return numBranch;
	}
	public void setNumBranch(int numBranch) {
		this.numBranch = numBranch;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
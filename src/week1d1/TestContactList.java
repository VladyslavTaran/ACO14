package week1d1;

import java.util.List;

public class TestContactList {
	public static boolean testAddContact(ContactList contactLst, int amountExpctd){
		return (contactLst.amount == amountExpctd);
	}
	
	public static boolean testGetContactById (Contact contact1, Contact contact2){
		return (contact1 == contact2);
	}
	
	public static boolean testGetContactsByFilter(List<Contact> contactLst, int amountExpctd){
		return (contactLst.size() == amountExpctd);
	}
}
              
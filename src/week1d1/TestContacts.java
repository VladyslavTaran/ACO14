package week1d1;

public class TestContacts {

	public static void main(String[] args) {
		ContactList contactLst = new ContactList();
		
		Contact con1 = new Contact("Ivan", 23, "+380667834571", 
									new Address("Kyiv", "Dontsia", 12));
		Contact con2 = new Contact("Sergiy", 24, "+38096482772", 
									new Address("Lviv", "Bandery", 33));
		Contact con3 = new Contact("Stepan", 30, "+380502987264", 
									new Address("Vinnytsia", "Peremohy", 52));
		Contact con4 = new Contact("Veniamin", 31, "+380637744562", 
									new Address("Ternopil", "Sirka", 17));
		contactLst.addContact(con1);
		contactLst.addContact(con2);
		contactLst.addContact(con3);
		contactLst.addContact(con4);
		
		//test Contact
		System.out.println("test Contact.getId: " + TestContact.testGetId(con2, 1)); 
		
		//test ContactList
		System.out.println("test ContactList.add: " + TestContactList.testAddContact(contactLst, 4));
		System.out.println("test ContactList.getById: " + TestContactList.testGetContactById(con3, contactLst.getById(2)));
		System.out.println("test ContactList.getContactByFilter: " + TestContactList.testGetContactsByFilter(contactLst.getContactsByFilter("e"), 3));
		
		//contactLst.showAllContacts();
		contactLst.showAllAsJason();
	}

}

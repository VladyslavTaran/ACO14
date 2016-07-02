package week1d1;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
	List<Contact> contacts = new ArrayList<>();
	int amount;
	
	public void addContact(Contact contact){
		contacts.add(contact);
		amount++;
	}
	
	public void showAllContacts(){
		for (Contact contact : contacts){
			System.out.println("Contact Id:" + contact.getId() + " " + contact.toString() + "Address: " + contact.address.toString());
		}
	}
	
	public void showAllAsJason(){
		for (Contact contact : contacts){
			if (contact.getId() == (contacts.size() - 1)){
				System.out.println(contact.toJson());
			}else{
				System.out.println(contact.toJson() + ",");
			}
		}
	}
	
	public Contact getById(int Id){
		return contacts.get(Id);
	}
	
	public List<Contact> getContactsByFilter(String filter){
		List<Contact> res = new ArrayList<>();
		for (Contact contact : contacts){
			if (contact.name.toLowerCase().contains(filter.toLowerCase())) res.add(contact);
		}
		return res;
	}
}

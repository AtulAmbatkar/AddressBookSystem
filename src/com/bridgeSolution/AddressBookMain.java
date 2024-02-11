package com.bridgeSolution;

public class AddressBookMain {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book");
		
		AddressBook addBook = new AddressBook();
		
		Contacts con = new Contacts("Atul","Ambatkar","At.karve","Pune","Maharashtra",411052,8605971384L);
		Contacts con1 = new Contacts("Rushi","Ambatkar","At.karve","Pune","Maharashtra",411052,9763182726L);
		
		addBook.addContact(con);
		addBook.addContact(con1);
		
//		before editing name
		System.out.println("\nAdded Contacts in AddressBook:  " + addBook);
		
		addBook.editContactByName(args[0],args[1],con);
		
//		after editing name by existing contact data
		System.out.println("\nAfter Editing byName: " + addBook);
		
//		delete existing contcts by name
		
		addBook.deleteContactByName(args[2], args[3], con);
		
		System.out.println("\nAfter delete name: " + addBook);
		
		
	}
}

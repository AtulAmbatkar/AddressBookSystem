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
		System.out.println(addBook);
		
		addBook.editContactByName(args[0],args[1],con);
		
//		after diting name by existing contact data
		System.out.println(addBook);
		
		
	}
}

package com.bridgeSolution;

public class AddressBookMain {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book");
		
		AddressBook ab = new AddressBook();
		
		Contacts con = new Contacts("Atul","Ambatkar","At.karve","Pune","Maharashtra",411052,8605971384L);
		
		ab.add(con);
		
		System.out.println(ab);
	}
}

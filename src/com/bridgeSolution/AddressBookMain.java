package com.bridgeSolution;

public class AddressBookMain {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book");
		
		AddressBook ab = new AddressBook();
		
		Contacts con = new Contacts("Atul","Ambatkar","At.karve","Pune","Maharashtra",411052,8605971384L);
		Contacts con1 = new Contacts("Rushi","Ambatkar","At.karve","Pune","Maharashtra",411052,9763182726L);
		
		ab.add(con);
		ab.add(con1);
		
		System.out.println(ab);
	}
}

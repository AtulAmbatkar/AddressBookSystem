package com.bridgeSolution;

import java.rmi.Remote;
import java.util.Arrays;

public class AddressBook {

	private Object[] elementData;
	private int element;
	
	public AddressBook() {
		elementData  = new Object[3];
	}

	public void addContact(Object obj) {
		if(!(obj == null)) {
			elementData[element] = obj;
			element++;
		}
	}
	
	public void editContactByName(String firstName , String lastName , Contacts con) {
		if(!(firstName.equals(con.getFirstName()) && lastName.equals(con.getLastName()))) {
			
			con.setFirstName(firstName);
			con.setLastName(lastName);
		}
	}
	
	public void deleteContactByName(String firstName,String lastName,Contacts con) {
		
		if(firstName.equals(con.getFirstName()) && lastName.equals(con.getLastName())) {
			
			con.setFirstName(null);
			con.setLastName(null);
		}
		
	}
	
	@Override
	public String toString() {
		return "AddressBook "+ Arrays.toString(elementData) + " "; 
	}

	

}

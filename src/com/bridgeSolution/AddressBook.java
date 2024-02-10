package com.bridgeSolution;

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
	
	public void editContactByName(String name , String name1 , Contacts con) {
		if(!(name.equals(con.getFirstName()) && name1.equals(con.getLastName()))) {
			
			con.setFirstName(name);
			con.setLastName(name1);
		}
	}
	
	@Override
	public String toString() {
		return "AddressBook "+ Arrays.toString(elementData) + " "; 
	}

	

}

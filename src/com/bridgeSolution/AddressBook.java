package com.bridgeSolution;

import java.util.Arrays;

public class AddressBook {

	private Object[] elementData;
	private int element;
	
	public AddressBook() {
		elementData  = new Object[1];
	}

	public void add(Object obj) {
		if(!(obj == null)) {
			elementData[element] = obj;
			element++;
		}
	}
	
	@Override
	public String toString() {
		return "AddressBook "+ Arrays.toString(elementData) + " "; 
	}

}

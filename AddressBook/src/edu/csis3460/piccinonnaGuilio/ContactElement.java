//Giulio Piccinonna
//HW #4 Address Book
//ContactElement.java
//April 12th 2015
//Version 1.1 

package edu.nova.csis3460.piccinonnaGiulio.hw4;

public abstract class ContactElement {
	String element;
	private int listSize; 
	
	public ContactElement(){
	}
	
	public abstract void print();
	
	public void ContactElement(String value){
		element = value;
	}

}

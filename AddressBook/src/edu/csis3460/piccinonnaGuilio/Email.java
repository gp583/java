//Giulio Piccinonna
//HW #4 Address Book
//Email.java
//April 12th 2015
//Version 1.1 

package edu.nova.csis3460.piccinonnaGiulio.hw4;

public class Email extends ContactElement{
	public Email(String value){
		element = value;
	}
	public void print(){
		System.out.print(" Email:"+element);
	}

}

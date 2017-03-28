//Giulio Piccinonna
//HW #4 Address Book
//ContactElement.java
//April 12th 2015
//Version 1.1 

package edu.nova.csis3460.piccinonnaGiulio.hw4;

public class PhoneNumber extends ContactElement {

		public PhoneNumber(String value){
			element = value;
		}
	
	public void print(){
		System.out.print(" Phone:"+element);
	}
}

//Giulio Piccinonna
//HW #4 Address Book
//Contact.java
//April 12th 2015
//Version 1.1 

package edu.nova.csis3460.piccinonnaGiulio.hw4;

public class Contact {

	private ContactElement[] contactElements;
	int listSize;

	public Contact(ContactElement element){
		contactElements = new ContactElement[20];
		listSize = 0;
	}

	private void addContactElement(ContactElement element){
		contactElements[listSize] = element;
		listSize++;
	}

	public void addEmail(String value){
		Email email = new Email(value);
		addContactElement(email);
	}

	public void addPhoneNumber(String value){
		PhoneNumber phone = new PhoneNumber(value);
		addContactElement(phone);
	}

	private String name;
	private String email;
	private String number;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String mail) {
		this.email = mail;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String Num) {
		this.number = Num;
	}

	public Contact(String n, String c, String e){
		name = n;
		number = c;
		email = e;
	}
	public Contact(String n){
		name = n;
	}

	public void print(){
		System.out.println("name: " + name + " \ncell number: " + number + " \nemail: " + email);
	}
	public static void test(){
		Contact aContact = new Contact("Guilio");

		aContact.print();
	}
	public static void main(String[] args){
		test();
	}
}

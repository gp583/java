//Giulio Piccinonna
//HW #4 Address Book
//AddressBook.java
//April 12th 2015
//Version 1.1 

package edu.nova.csis3460.piccinonnaGiulio.hw4;
import java.util.*;

public class AddressBook {

	private ArrayList <Contact> addressBook = new ArrayList <Contact>();
	private int listSize; 

	public AddressBook(){

		listSize = 0;
	}

	public void addContact(String c){

		addressBook.add(new Contact(c));
		listSize++;
	}

	public void addeMail(String n, String e){
		for (int i= 0; i<listSize; i++)
			if(addressBook.get(i).getName().equals(n))
				addressBook.get(i).setEmail(e);
	}

	public void addNumber(String n, String c){
		for (int i= 0; i<listSize; i++)
			if(addressBook.get(i).getName().equals(n))
				addressBook.get(i).setNumber(c);
	}

	public void findNumber(String na){
		for (int i= 0; i<listSize; i++)
			if(addressBook.get(i).getName().equals(na))
				System.out.println(addressBook.get(i).getNumber());
	}

	public void findeMail(String na){
		for (int i= 0; i<listSize; i++)
			if(addressBook.get(i).getName().equals(na))
				System.out.println(addressBook.get(i).getEmail());
	}


	public void printAddressBook(){
		for (int i=0; i < listSize; i++){
			addressBook.get(i).print();
			System.out.println();
		}
	}

	public void printPerson(String s){
		for (int i= 0; i<listSize; i++)
			if(addressBook.get(i).getName().equals(s))
				addressBook.get(i).print();
	}

	public static void test(){
		AddressBook phonebook = new AddressBook();
		phonebook.addContact("Giulio");
		phonebook.addeMail("Giulio", "heynow333@aol.com");
		phonebook.addNumber("Giulio", "954-433-9219");
		phonebook.printPerson("Giulio");
		phonebook.addContact("Berta");
		phonebook.addeMail("Berta", "berta212@aol.com");
		phonebook.addNumber("Berta", "561-396-7722");
		phonebook.printAddressBook();
		phonebook.menu();
		phonebook.printAddressBook();
	}

	public void menu() {

		Scanner input = new Scanner(System.in);

		int choice = -1;

		while(choice != 8){
			System.out.println("1. Add a new contact to your address book");
			System.out.println("2. Add a phone number to an existing contact");
			System.out.println("3. Add an email address to an existing contact");
			System.out.println("4. Find a phone number of an existing contact");
			System.out.println("5. Find an email address of an existing contact");
			System.out.println("6. Print a contact from your address book");
			System.out.println("7. Print your entire address book");
			System.out.println("8. Quit"); 
			System.out.println("Select your menu choice");

			choice = input.nextInt();
			input.nextLine(); //clear the input buffer
			if (choice == 1) {
				if (this.listSize < 100) {

					System.out.println("Enter contact name:");
					String n = input.nextLine();
					this.addContact(n);
				}
				if (this.listSize >= 100){
					System.out.println("Sorry, your phonebook is full");
				}	
			}
			else if (choice == 2){
				System.out.println("Enter contact name:");
				String name = input.nextLine();
				System.out.println("Please enter " + name + "'s phone number");
				String phone = input.next();
				this.addNumber(name, phone);
			}

			else if (choice == 3){
				System.out.println("Enter contact name:");
				String name = input.nextLine();
				System.out.println("Please enter " + name + "'s email address");
				String address = input.next();
				this.addeMail(name, address);
			}
			else if (choice == 4){
				System.out.println("Enter contact name to retrieve number:");
				String name = input.nextLine();
				this.findNumber(name);
			}
			else if (choice == 5){
				System.out.println("Enter contact name to retrieve email:");
				String name = input.nextLine();
				this.findeMail(name);
			}
			else if (choice == 6){
				System.out.println("Enter contact name");
				String name = input.nextLine();
				this.printPerson(name);
			}
			else if (choice == 7){
				this.printAddressBook();
			}
			else break;
		}
		input.close();
	}

	public static void main(String[] args) {
		//	test();
		AddressBook phonebook = new AddressBook();
		phonebook.menu();
	}
}


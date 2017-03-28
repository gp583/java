import java.util.*;
public class Player {
	
	private String name;
	private String position;
	private String college;
	private int yearsPro;
	
	public Player() {
	}
	public String getName() {
		return name;
	
	}
	public String getPosition() {
		return position;
	}

	public String getCollege() {
		return college;
}

	public int getyearsPro() {
		return yearsPro;
}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setPosition(String p) {
		position = p;
	}
	public void setCollege(String c) {
		college = c;
	}
	
	public void setyearsPro(int y) {
		yearsPro = y;
	}		
	
public void printIt() {
	System.out.println( name + " is a " + position + " out of " + college + " that has been in the league " + yearsPro + " years.");
}
	
public String toString() {
	return "" + name + " is a " + position + " out of " + college + " that has been in the league " + yearsPro + " years.";
}
	
	public void readInPlayer(Scanner myInput) {

	System.out.println("What is the player's name?");
	name = myInput.nextLine();
	this.setName(name);
	System.out.println("College? ");
	college = myInput.nextLine();
	setCollege(college);
	System.out.println("What is the position of the player? ");
	position = myInput.nextLine();
	setPosition(position);
	System.out.println("And career length? (in years): ");
	yearsPro = myInput.nextInt();
	this.setyearsPro(yearsPro);
	
	}
	
	public void readInPlayer2(Scanner myInput2) {

	System.out.println("What is the player's name?");
	name = myInput2.nextLine();
	this.setName(name);
	System.out.println("College? ");
	college = myInput2.nextLine();
	setCollege(college);
	System.out.println("What is the position of the player? ");
	position = myInput2.nextLine();
	setPosition(position);
	System.out.println("And career length? (in years): ");
	yearsPro = myInput2.nextInt();
	this.setyearsPro(yearsPro);
	
	}
	
	public void readInPlayer3(Scanner myInput3) {

	System.out.println("What is the player's name?");
	name = myInput3.nextLine();
	this.setName(name);
	System.out.println("College? ");
	college = myInput3.nextLine();
	setCollege(college);
	System.out.println("What is the position of the player? ");
	position = myInput3.nextLine();
	setPosition(position);
	System.out.println("And career length? (in years): ");
	yearsPro = myInput3.nextInt();
	this.setyearsPro(yearsPro);
	
	}
	}
	
	
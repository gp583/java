/* Amanda Brown, September 15th, 2014. The purpose of Assignment IV was to create three new objects and allow data to be read for the
 instance variables of the objects in the method of my class (each time I called it). Using logic the object's value (or price) would
 be ordered from highest to lowest (or most to least expensive). */

import java.util.*;
public class Flower {

	private String name;
	private String color;
	private String season;
	private double price; 
	
	public Scanner myInput; //creating Scanner variable
	
	public Flower() {
		myInput = new Scanner(System.in); //initialize Scanner for every constructor Scanner will be used in
		
		}
			
		//9-8-14
	public Flower (String name, String color, String season, double price){
		this.name = name; 
		this.color = color;
		this.season = season;
		this.price = price;
		
		myInput = new Scanner(System.in); //initialize Scanner for every constructor Scanner will be used in
		
	}		 
		
	//Name getter and setter
		public String getName(){
			return this.name; }
		public void setName (String name){
			this.name = name;}
			
	//Color getter and setter
		public String getColor(){
			return this.color;	}
		public void setColor (String color){
			this.color = color;}
		
	// Season getter and setter
		public String getSeason(){
			return this.season; }
		public void setSeason (String season){
			this.season = season;}
		
	//Price getter and setter
		public double getPrice(){
			return this.price;}
		public void setPrice (double price){
			this.price = price;} 

		//9-15-14
		public void readInFlower(){
			String tempName, tempColor, tempSeason;
			double tempPrice;
			
		System.out.print("What is the flower's name? ");
			tempName = myInput.nextLine();
			this.setName(tempName);
		System.out.print("What is the flower's color? ");
			tempColor = myInput.nextLine();
			this.setColor(tempColor);
		System.out.print("What season does the flower grow in? ");
			tempSeason = myInput.nextLine();
			this.setSeason(tempSeason);
		System.out.print("How much does a dozen cost? ");
		    tempPrice = myInput.nextDouble();
			this.setPrice(tempPrice);
	//cannot close scanner, or program will not run
		
		}	 
		
		//We need to close the Scanner (Destructors)
		protected void finalize(){
			
			myInput.close();
		}
			
		public String toString() {
			return "The " + color + " " + name + " grows in the " + season + " and cost $" + price + " a dozen";
		}   
		}

		
			
		
	
	 

	
		


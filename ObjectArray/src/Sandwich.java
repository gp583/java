import java.util.Scanner;
public class Sandwich {
	private Scanner kb = new Scanner(System.in);
	private String cheese;//instance variable
	private String meat;//instance variable
	private double price;//instance variable
	private String bread;//instance variable for sandwich
	
	
	public Sandwich() {
	
	}
	
	public void SandwichIngrediants(){

	System.out.print("What type of cheese would you like?");
	cheese = kb.next();
	System.out.print("What type of meat would you like?");
	meat = kb.next();
	System.out.print("How much does the Sandwich cost?");
	price = kb.nextDouble();
	System.out.print("What type of bread would you like?");
	bread = kb.next();
	}
	
	public double getprice(){
	return price;
		
	}
	
	public String compareSandwiches(Sandwich s1, Sandwich s2, Sandwich s3){
	double p1 = s1.getprice();
	double p2 = s2.getprice();
	double p3 = s3.getprice();
	String greatest = "";
	String middle = "";
	String least = "";
	if (p1 > p2 && p1 >p3){
		
		greatest = s1.getSandwich();	
	if (p2 >p3){
		
		middle = s2.getSandwich();
		least = s3.getSandwich();	
	}
	else{
		
		middle = s3.getSandwich();
		least = s2.getSandwich();
		
	}
	}
	
	
	if (p2 > p1 && p2 >p3){
		
		greatest = s2.getSandwich();	
	if (p1 >p3){
		
		middle = s1.getSandwich();
		least = s3.getSandwich();	
	}
	else{
		
		middle = s3.getSandwich();
		least = s1.getSandwich();
		
	}
	}
	
	
	if (p3 > p2 && p3 >p1){
		
		greatest = s3.getSandwich();	
	if (p2 >p1){
		
		middle = s2.getSandwich();
		least = s1.getSandwich();	
	}
	else{
		
		middle = s1.getSandwich();
		least = s2.getSandwich();
		
	}
	}
	
	return "the most expensive sandwich is " + greatest + ", the second most expensive Sandwich is " + middle + ", the cheapest sandwich is " + least;
	}
	public void setSandwich(String c, String m, Double p, String b){
		cheese = c;//Setting our string to a single letter for ease of access
		meat = m;//Setting our double to a single letter for ease of access
		price = p;//Setting our string to a single letter for ease of access
		bread = b;//Setting our string to a single letter for ease of access
	}
	public String toString() {//setting a print command for our driver that also creates a english sentence.
	return "The " + price + " dollars sandwich contains " + cheese + " and " + meat  + " on " +  bread + " bread.";
	}

	public String getSandwich() {//setting a print command for our driver that also creates a english sentence.
	return "The " + price + " dollars sandwich contains " + cheese + " and " + meat  + " on " +  bread + " bread.";
	}
}

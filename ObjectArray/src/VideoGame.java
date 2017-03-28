import java.util.Scanner;

public class VideoGame {

	public String name;
	public String type; 
	public String platform; 
	public double price; 
	
	public VideoGame(){};
	public VideoGame (String n, String t, String pl, double pr ) {
		name=n;
		type=t;
		platform=pl;
		price=pr;
	}
	
	//Method to input data to object from keyboard
		Scanner keyboard=new Scanner (System.in);
		public void readInData (Scanner keyboard) {
			
			System.out.print("Enter the name of the game: ");
			this.setName(keyboard.nextLine());
			
			System.out.print("Enter the type of the game: ");
			this.setType(keyboard.nextLine());
			
			System.out.print("Enter the platform(s) the game runs on: ");
			this.setPlatform(keyboard.nextLine());
			
			System.out.print("Enter the price of the game: ");
			this.setPrice(keyboard.nextDouble());
			
			keyboard.nextLine();
			System.out.println();
			
		}
	
	public void PrintIt (){
		System.out.println("The name of the videogame is " 
							+ name + "\n" + "It's type is " +
							type +"\n" + "It runs on " + platform +
							"\n"+ "It costs " +price+ "$"+"\n");}
		
	
	public String toString (){
		return "The name of the videogame is " 
							+ name + "\n" + "It's type is " +
							type +"\n" + "It runs on " + platform +
							"\n"+ "It costs " +price+ "$";
		}
		
	public void setName(String setN)
	{
		name=setN;
	}
	public void setType(String setT)
	{
		type=setT;
	}
	public void setPlatform(String setPl)
	{
		platform=setPl;
	}
	public void setPrice(double setPr)
	{
		price=setPr;
	}
	
	public String getName() 
	{
		return name;
	}
	public String getType() 
	{
		return type;
	}
	public String getPlatform() 
	{
		return platform;
	}
	public double getPrice() 
	{
		return price;
	}
	
	
			
	
}

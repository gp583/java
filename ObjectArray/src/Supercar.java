import java.util.Scanner;


public class Supercar {
	private String makeAndModel;
	private String country;
	private double zeroTo60;
	private int totalCost;
	// Primary classes for program
	
	public Supercar() {
		
	}

	public Supercar(String m, String c, double z, int t) {
		makeAndModel = m;
		country = c;
		zeroTo60 = z;
		totalCost = t;
	}
	
	public String getFullName() {
		return makeAndModel;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getCost() {
		return totalCost;
	}
	
	public double getTime() {
		return zeroTo60; 
	}
	
	public void setMakeAndModel(String x) {
		makeAndModel = x;
	}
	
	public void setCountry(String x) {
		country = x;
	}
	
	public void setTotalCost(int x) {
		totalCost = x;
	}
		
	public void setZeroTo60(double x) {
		zeroTo60 = x;
	}
	
	// core of input reader method
	public void readInSupercar() {
		Scanner kbInput = new Scanner(System.in);
		System.out.print("Car's make and model? ");
		this.setMakeAndModel(kbInput.nextLine());
		System.out.print("Country of origin? ");
		this.setCountry(kbInput.nextLine());
		System.out.print("0 to 60 time (in seconds)? ");
		this.setZeroTo60(kbInput.nextDouble());
		System.out.print("Total cost? $");
		this.setTotalCost(kbInput.nextInt());
		}
	
	// printIt method output for program
	public String toString() {
		return "The " + makeAndModel + " is made in " + country + ", has a 0-60 time of "
				+ zeroTo60 +  " seconds, and costs $" + totalCost + ".";
		}  	
}

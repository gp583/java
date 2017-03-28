package jsjf;
import java.util.*;

public class Golfers implements Comparable<Object> { 

	String fname;
	String lname;
	int numTourn;
	int totalMoney;
	int averageMoney;
	
	public Golfers(String fname, String lname, int numTourn, int totalMoney, int averageMoney) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.numTourn = numTourn;
		this.totalMoney = totalMoney;
		this.averageMoney = averageMoney;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getNumTourn() {
		return numTourn;
	}

	public void setNumTourn(int numTourn) {
		this.numTourn = numTourn;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	
	public int getAverageMoney() {
		return averageMoney;
	}

	public void setAverageMoney(int averageMoney) {
		this.averageMoney = averageMoney;
	}
	
	public String toString()
	{

		//System.out.println("First name:       Last name:     Number of Tournaments:   Total Money Won:       Average Money Won:  \n");        
		return String.format("%11s            %11s             %11d                  $%11d            $%11d    ", fname, lname, numTourn, totalMoney, averageMoney);
}
	
	public int compareTo(Object obj){
		if (this.getClass() != obj.getClass())
			return 0;
		Golfers other = (Golfers) obj;
		
		 if (this.averageMoney > other.averageMoney)
		 		return -1;
		 if (this.averageMoney < other.averageMoney)
		 		return 1;
		 return 0;
}
}

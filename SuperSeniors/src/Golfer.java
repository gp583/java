import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Golfer {

	private String fname;
	private String lname;
	private int numTourn;
	private double totalMon;
	
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
	public double getTotalMon() {
		return totalMon;
	}
	public void setTotalMon(double totalMon) {
		this.totalMon = totalMon;
	}
	
	public Golfer(String f,String l, int nTourn, double tMon){
		fname = f;
		lname = l;
		numTourn = nTourn;
		totalMon = tMon;
	}

public String toString(){
	return  "First name:   " + fname + "First name:   " + lname + "First name:   " + numTourn +
			" Money earned:   " + totalMon;
}
}

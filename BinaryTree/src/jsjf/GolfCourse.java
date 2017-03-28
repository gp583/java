//Guilio Piccinonna
//Assignment 8

package jsjf;

public class GolfCourse {

	String courseName;
	String location;
	double greensFee;
	String par;
	String designer;
	String yearBuilt;
	String yards;
	

	public GolfCourse(String c, String l, double g, String p, String d, String yB, String y){
		courseName = c;
		location = l;
		greensFee = g;
		par = p;
		designer = d;
		yearBuilt = yB;
		yards = y;
	}
		
	public GolfCourse(){
		
	}
	
	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public double getGreensFee() {
		return greensFee;
	}


	public void setGreensFee(double greensFee) {
		this.greensFee = greensFee;
	}


	public String getPar() {
		return par;
	}


	public void setPar(String par) {
		this.par = par;
	}


	public String getDesigner() {
		return designer;
	}


	public void setDesigner(String designer) {
		this.designer = designer;
	}


	public String getYearBuilt() {
		return yearBuilt;
	}


	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}


	public String getYards() {
		return yards;
	}


	public void setYards(String yards) {
		this.yards = yards;
	}


	
	public String toString() {
		String result = String.format("%-55s          %-15s             $%-2.2f         %-8s           %-45s         %-7s          %-8s", courseName, location, 
								greensFee, par,designer, yearBuilt, yards );
		return result;
	
}
}

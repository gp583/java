
public class Employee {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	private String job;
	private Date dob;
	private int years;
	private Date start;
	
	public Employee(String n, String j, Date d, int y, Date s){
		name = n;
		job = j;
		dob = d;
		years = y;
		start = s;
	}

	public String toString() {
		return "Employee " + name + " was born on " + dob + " is a " + job + " and has been working for " + years +" years since " 
				+ start + ".";
}
}

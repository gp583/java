import java.util.*;

public class Student implements Comparable{
	private String name;
	private String major;
	private int age;
	private double gpa;
	
	public Student() {
	}
	
	public Student(String n, String m, int a, double g) {
		name = n;
		major = m;
		age = a;
		gpa = g;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public void readInStudent(Scanner myInput) {
		int tempAge;
		double tempGpa;
		String temp, cr;
		System.out.print("What is your major? ");
		temp = myInput.next();
		this.setMajor(temp);
		System.out.print("What is your name? ");
		temp = myInput.next();
		setName(temp);
		System.out.print("What is your age? ");
		tempAge = myInput.nextInt();
		this.setAge(tempAge);
//		cr = myInput.nextLine();     // clear input buffer
		System.out.print("What is your grade point average? ");
		tempGpa = myInput.nextDouble();
		setGpa(tempGpa);
//		cr = myInput.nextLine();     // clear input buffer
	}
	public String toString() {
		return "The " + age + " year old student " + name + " is majoring in "
				+ major +  " with a " + gpa + " grade point average";
	}
	
	public int compareTo(Object obj){
		if (this.getClass() != obj.getClass())
			return 0;
		Student other = (Student) obj;
//		return this.name.compareTo(other.name);
		
		 if (this.age > other.age)
		 		return -1;
		 if (this.age < other.age)
		 		return 1;
		 return 0;
	
		 
	}
}

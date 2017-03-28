//Giulio Piccinonna
//HW #3 Address Book
//Student.java
//April 12th 2015
//Version 1.1 

package edu.nova.csis3460.piccinonnaGiulio.hw3;

public class Student extends Teacher {

	protected	String name;
	protected	String assignment = null;
	protected 	String grade = null;
//	private Student StudName;
	
	//public Student(Student name) {
//		this.name = name;
//	}
	
	public Student(String name) {
		this.name = name;
	}
	public String getAssignment() {
		if (assignment == null) {
			return "No assignment submitted from " + name;
		}
		return name + "submitted assignment " + assignment;
	}
	
	public String getGrade() {
		if (grade == null) {
			return "No Grade";
		}
		return grade;
	}
	
	public String getName() {
		return name;
	}

	public Student(String n, String a, String g) {
		name = n;
		assignment = a;
		grade = g;
	}

//	public Student(Student StudName) {
	//	this.StudName = StudName;
	//}
	public void assignGrade(String assignGr){
		grade = assignGr;
	}

	public void submitAssignment(String subAssign){
		this.assignment = subAssign;
	}


	public static void test(){
		Student stud1 = new Student("Jim");
		stud1.assignGrade("B");
		stud1.submitAssignment("This is my first assignment");
		System.out.println("The grade " + stud1.name + " received on his first assignment, " +  stud1.getAssignment() + ", is a " +
				stud1.getGrade() + ".");
	}

	public static void main(String[] args){
		test();
	}
}


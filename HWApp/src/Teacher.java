//Giulio Piccinonna
//HW #3 HW App
//Teacher.java
//April 12th 2015
//Version 1.1 

package edu.nova.csis3460.piccinonnaGiulio.hw3;
import java.util.*;

public class Teacher {

	static ArrayList <Student> students  = new ArrayList <Student>();


	public void getAssignmentByName(String assignName){
		try {
			for (int i = 0; i > students.size(); i++)
				if (assignName.equals(students.get(i).name))
					System.out.println(students.get(i).assignment);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Student not found");
		}
	}

	public void assignGradebyName(String assignName, String theGrade){
		try {
			for(int i = 0; i < students.size(); i++)
				if (assignName.equals(students.get(i).name))
					students.get(i).assignGrade(theGrade);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Student not found");
		}
	}
	public void addStudent(String name) {
		students.add(new Student(name));
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void printStudent(String name) {
		for (int i = 0; i < students.size(); i++)
			if (students.get(i).getName().equalsIgnoreCase(name))
				System.out.println("Student: " + students.get(i).getName() + "\nAssignment : " + students.get(i).getAssignment() 
						+ "\nGrade: " + students.get(i).getGrade());
	}

	public void printClass() {
		for (int i = 0; i < students.size(); i++)
			System.out.println("Student: " + students.get(i).getName() + "\nAssignment: " + students.get(i).getAssignment() 
					+ "\nGrade: " + students.get(i).getGrade());  

	}
	public static void test(){
		Teacher drRajput = new Teacher();
		Student giulio = new Student("Giulio");
		Student sam = new Student("Sam");
		Student george = new Student("George");
		drRajput.addStudent(giulio);
		drRajput.addStudent(sam);
		drRajput.addStudent(george);
		drRajput.addStudent("Roberta");
		drRajput.assignGradebyName("Roberta", "B");
		drRajput.assignGradebyName("Giulio",  "A");
		drRajput.printStudent("Giulio");
		drRajput.printClass();

	}

	public static void main(String[] args){
		test();

	}
}

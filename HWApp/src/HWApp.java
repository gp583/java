//Giulio Piccinonna
//HW #3 Address Book
//HWApp.java
//April 12th 2015
//Version 1.1 

package edu.nova.csis3460.piccinonnaGiulio.hw3;
import java.util.*;

public class HWApp {
	String assignment = null;


	public void menu(){
		String studentName;
		Teacher drRajput = new Teacher();
		Scanner input = new Scanner(System.in);
		int iInput;
		

		outerLoop: {
			System.out.println("Are you a student? (yes/no)");
			String answer = input.next();
			if (answer.equalsIgnoreCase("yes")){
				boolean studentOption = false;
				System.out.println("Enter your name");
				studentName = input.next();
				while (!studentOption) {
				Student student  = new Student(studentName);
				System.out.println("Press 1 to submit an assignment");
				System.out.println("Press 2 view your grade");
				System.out.println("Press 9 to start over");
				System.out.println("Press 0 to quit");
				iInput = input.nextInt();
				
				if (iInput == 1){
					System.out.println("Please submit your assignment");
					String studAssign = input.next();
					student.submitAssignment(studAssign);
						System.out.println("Assignment " + studAssign + " submitted. Would you like to do something else?");
						answer = input.next();
						if (answer.equalsIgnoreCase("yes")) {
							studentOption = false;
						} else {
							break outerLoop;
						}
				} else if (iInput == 2){
					System.out.println(student.getGrade() + " for " + studentName);
					System.out.println("Would you like to do something else?");
					answer = input.next();
					if (answer.equalsIgnoreCase("yes")) {
						studentOption = false;
					} else {
						break outerLoop;
					}
					} else if (iInput == 9) {
						studentOption = false;
					} else if (iInput == 0) {
						break outerLoop;
					} else {
						System.out.println("Please enter a valid option");
					}
				}
			} else if (answer.equalsIgnoreCase("no"))
			{
				boolean teachOption = false;
			while (!teachOption) {
				System.out.println("Press 1 to get an assignment");
				System.out.println("Press 2 to grade an assignemnt");
				System.out.println("Press 3 to print all student grades");
				System.out.println("Press 9 to start over");
				System.out.println("Press 0 to quit");
				iInput = input.nextInt();
			if (iInput == 1) {
				System.out.println("Enter the name of the Student to view Assignments");
				String studName = input.next();
				drRajput.getAssignmentByName(studName);
				System.out.println("Would you like to do something else?");
				answer = input.next();
				if (answer.equalsIgnoreCase("yes")) {
					teachOption = false;
				} else {
					break outerLoop;
				}
			}else if (iInput == 2) {
				System.out.println("Enter the name of the Student");
				String studName = input.next();
				System.out.println("Enter the grade for " + studName);
				String grade = input.next();
				drRajput.assignGradebyName(studName, grade);
				System.out.println("Anything else?");
				answer = input.next();
				if (answer.equalsIgnoreCase("yes")) {
					teachOption = false;
				} else {
					break outerLoop;
				}
				}else if (iInput == 3) {
					drRajput.printClass();
				System.out.println("Would you like to do something else?");
				answer = input.next();
				if (answer.equalsIgnoreCase("yes")) {
					teachOption = false;
				} else {
					break outerLoop;
				}
				}else if (iInput == 9) {
					teachOption = false;
				} else if (iInput == 0) {
					break outerLoop;
					
				} else {
					System.out.println("Please enter a valid option");
				}
			}
			}
		}	
		input.close();
	}
	


	public static void test(){
		HWApp gradebook = new HWApp();
		Teacher drRajput = new Teacher();
		Student james = new Student("James");
		Student sam = new Student("Sam");
		Student roberta = new Student("Roberta");
		drRajput.addStudent(james);
		drRajput.addStudent(sam);
		drRajput.addStudent(roberta);
		drRajput.addStudent("Giulio");
		gradebook.menu();
	}

	public static void main(String[] args) {
		test();
	
	}

}


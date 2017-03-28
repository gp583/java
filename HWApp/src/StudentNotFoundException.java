//Giulio Piccinonna
//HW #3 HWApp
//StudentNotFoundException.java
//April 12th 2015
//Version 1.1 

package edu.nova.csis3460.piccinonnaGiulio.hw3;

@SuppressWarnings("serial")
public class StudentNotFoundException extends Exception {
	
	public StudentNotFoundException(String e){
		System.out.println("Student not found");
	}
}

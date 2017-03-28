package edu.csis3100.piccinonnaGuilio;

import java.util.*;

public class HWApp extends Teacher {

	public static void main(String[] args) {
			Teacher Rajput = new Teacher();
			students.add(new Student("James"));
			students.add(new Student("Samantha"));
			students.add(new Student("Roberta"));
			students.add(new Student("Cameron"));
			students.add(new Student("Giulio"));	
	
		Scanner kb = new Scanner(System.in);
		String sInput;
		int result = 0;
		
		while (result != 9){
			
		System.out.println("Are you a student?");
		sInput = kb.nextLine();

		if (sInput.equalsIgnoreCase("yes")){
			do{
				try {
					result = studOptions();
				} catch (studentNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}while(result != 0 && result != 9);

		}
		else	if (sInput.equalsIgnoreCase("no")){
			do{
				result = teachOptions(Rajput);
			}while(result != 0 && result != 9);

		}
		else System.out.println("Invalid entry");
		}
	}

	public static int teachOptions(Teacher Rajput){
		Scanner kb = new Scanner(System.in);
		int iInput;
		System.out.println("Press 1 to get an assignment");
		System.out.println("Press 2 to grade an assignemnt");
		System.out.println("Press 3 to print all student grades");
		System.out.println("Press 9 to start over");
		System.out.println("Press 0 to quit");
		iInput = Integer.parseInt(kb.nextLine());
		
	//	kb.nextLine(); //clearing the input buffer
		if (iInput == 1){
			System.out.println("Please enter Student's name");
			String studName = kb.nextLine();
			try {
				getAssignmentByName(studName);
			} catch (studentNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if (iInput == 2){
			System.out.println("Please enter Student's name");
			String studName = kb.nextLine();
			System.out.println("Please enter Student's grade");
			String studGrade = kb.next();
			try {
				assignGradebyName(studName, studGrade);
			} catch (studentNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if (iInput == 3){
			for (int i = 0; i < students.size(); i++){
				System.out.print(students.get(i).name);
				System.out.print(" " + students.get(i).grade);
			}
		}
		else if (iInput == 9){
			kb.close();
			return iInput;
		} 
		kb.close();
		return iInput;
	}


	public static int studOptions() throws studentNotFoundException{
		Scanner kb = new Scanner(System.in);
		int iInput;
		System.out.println("Press 1 to submit an assignment");
		System.out.println("Press 2 view your grade");
		System.out.println("Press 9 to start over");
		System.out.println("Press 0 to quit");
		iInput = kb.nextInt();
		
		if (iInput == 1){
		System.out.println("Please enter Student's name");
		String studName = kb.nextLine();
		System.out.println("Please submit your assignment");
		String studAssign = kb.next();
		try {
			submitAssignbyName(studName, studAssign);
		} catch (studentNotFoundException e) {
			e.printStackTrace();
		}
		}
		else if (iInput == 2){
			System.out.println("Please enter Student's name");
			String studName = kb.nextLine();
			for(int i = 0; i < students.size(); i++){ 
				if (studName.equals(students.get(i).name))
					System.out.println(students.get(i).name);
				System.out.println(students.get(i).grade);
			}
			}
		else if (iInput == 9){
			kb.close();
			return iInput;
		}
		else if (iInput == 0){
			kb.close();
			return iInput;
		}
		kb.close();
		return iInput;
	}
}

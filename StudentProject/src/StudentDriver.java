import java.io.*;
import java.util.*;

public class StudentDriver {

	public static void main(String[] args) { // throws IOException {
		int size = 0;
		Scanner kb = new Scanner(System.in);
//		Student[] theStudents = new Student[2];
		ArrayList <Student> myList = new ArrayList <Student>();
		int i;
		int wrongCount = 0;
		Scanner myFile;
		String fileName = "StudentInput.text";

		boolean notFound = true;
		
		while (notFound) { 
		try {
			myFile = new Scanner(new File(fileName));
			notFound = false;
			String junk;
			size = myFile.nextInt();

			junk = myFile.nextLine(); // clear buffer
			Student [] theStudents = new Student[size];
			String temp, first, last;
			int tempAge;
			double tempGpa;
			for (i = 0; i < size; i++) {
				temp = myFile.nextLine();
				tempMajor = myFile.nextLine();
				tempAge = myFile.nextInt();
				tempGpa = myFile.nextDouble();
				junk = myFile.nextLine();
	//			theGolfers[i] = new Golfer(tempName, tempMajor, tempAge,tempGpa);
						}
			myFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("Incorrect filename please re-enter ");
			wrongCount ++;
			fileName = kb.nextLine();
			if (wrongCount == 3)
				break;
		}
		}

		System.out.println("The data is the array of Students before the sort is:");
		for (i = 0; i < size; i++) {
//			System.out.println(theStudents[i]);
			System.out.println(myList.get(i));
		}
//		Arrays.sort(theStudents);
		Collections.sort(myList);
		System.out.println("\nThe data is the array of Students after the sort is:");
		for (i = 0; i < size; i++) {
//			System.out.println(theStudents[i]);
			System.out.println(myList.get(i));
		}
	}
}

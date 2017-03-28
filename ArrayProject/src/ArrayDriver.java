//Guilio Piccinonna
//11/11/14
//Assignment IX: Arrays & Arraylist from textfile
//Program reads in objects from a text file and sorts them
//Program contains a try/catch and boolean while loop to prevent error

import java.io.*;
import java.util.*;

public class ArrayDriver {

	public static void main(String[] args){ // throws IOException {
			int size = 0;
	//		ArrayPlayer[] thePlayers = new ArrayPlayer[16];
			ArrayList <ArrayPlayer> myList = new ArrayList <ArrayPlayer>();
			int i;
			int wrongCount = 0;
			Scanner kb = new Scanner(System.in);
			String fileName = "PlayerInput.text";
			boolean notFound = true;
			
			while (notFound) { 
			try {
				Scanner myStats;
				myStats = new Scanner(new File(fileName));
				notFound = false;
				
				String junk;
				size = myStats.nextInt();

				junk = myStats.nextLine(); // clear buffer
			//	thePlayers = new ArrayPlayer[size];
				String tempName, tempPosition, tempCollege;
				int tempYearsPro;
				for (i = 0; i < size; i++) {
					tempName = myStats.nextLine();
					tempPosition = myStats.nextLine();
					tempCollege = myStats.nextLine();
					tempYearsPro = myStats.nextInt();
					junk = myStats.nextLine();
		//			thePlayers[i] = new ArrayPlayer(tempName, tempPosition, tempCollege,tempYearsPro);
					myList.add(new ArrayPlayer(tempName, tempPosition, tempCollege,tempYearsPro));
							}
				myStats.close();
			} catch (FileNotFoundException e) {
				if (wrongCount == 3)
					break;
				System.out.println("Incorrect, please re-enter " + e);
				wrongCount ++;
				fileName = kb.nextLine();
			}
			}
			System.out.println("The Players in the array before the sort is:");
			for (i = 0; i < size; i++) {
		//		System.out.println(thePlayers[i]);
				System.out.println(myList.get(i));
			}
		//	Arrays.sort(thePlayers);
			Collections.sort(myList);
			System.out.println("\nThe Players in the array after the sort is:");
			for (i = 0; i < size; i++) {
		//		System.out.println(thePlayers[i]);
				System.out.println(myList.get(i));
			}
			
	}
}
	
/*
Incorrect, please re-enter java.io.FileNotFoundException: PlayerInput.text (No such file or directory)
PlayerInput.txt
The Players in the array before the sort is:
Miami Dolphin Charles Clay is a Tight End out of Tulsa. He has been in the league for 4 years.
Miami Dolphin Cortland Finnegan is a Cornerback out of Samford. He has been in the league for 9 years.
Miami Dolphin Brandon Gibson is a Wide Receiver out of Washington State. He has been in the league for 6 years.
Miami Dolphin Brent Grimes is a Cornerback out of Shippensburg. He has been in the league for 8 years.
Miami Dolphin LaMichael James is a Running Back out of Oregon. He has been in the league for 3 years.
Miami Dolphin Ryan Tannehill is a Quarterback out of Texas A&M. He has been in the league for 3 years.
Miami Dolphin Dion Jordan is a Defensive End out of Oregon. He has been in the league for 2 years.
Miami Dolphin Jared Odrick is a Defensive Tackle out of Penn State. He has been in the league for 5 years.
Miami Dolphin Lamar Miller is a Running Back out of University of Miami. He has been in the league for 3 years.
Miami Dolphin Koa Misi is a Linebacker out of Utah. He has been in the league for 5 years.
Miami Dolphin Olivier Veron is a Defensive End out of University of Miami. He has been in the league for 3 years.
Miami Dolphin Cameron Wake is a Defensive End out of Penn State. He has been in the league for 6 years.
Miami Dolphin Mike Wallace is a Wide Receiver out of Mississippi. He has been in the league for 6 years.
Miami Dolphin Jarvis Landry is a Wide Receiver out of LSU. He has been in the league for 0 years.
Miami Dolphin Jelani Jenkins is a Linebacker out of Florida. He has been in the league for 2 years.
Miami Dolphin Mike Pouncey is a Center out of Florida. He has been in the league for 4 years.
Miami Dolphin Louis Delmas is a Safety out of Western Michigan. He has been in the league for 6 years.
Miami Dolphin Walt Aikens is a Cornerback out of Liberty. He has been in the league for 0 years.
Miami Dolphin Will Davis is a Cornerback out of Utah State. He has been in the league for 2 years.
Miami Dolphin Terence Fede is a Defensive End out of Marist. He has been in the league for 0 years.
Miami Dolphin Nate Garner is a Guard out of Arkansas. He has been in the league for 7 years.
Miami Dolphin Brian Hartline is a Wide Receiver out of Ohio State. He has been in the league for 6 years.
Miami Dolphin JaWuan James is a Tackle out of Tennessee. He has been in the league for 0 years.
Miami Dolphin Jordan Kovacs is a Safety out of Michigan. He has been in the league for 2 years.
Miami Dolphin Rishard Matthews is a Wide Receiver out of Nevada. He has been in the league for 3 years.
Miami Dolphin Chris McCain is a Linebacker out of Calfornia . He has been in the league for 0 years.
Miami Dolphin Earl Mitchell is a Defensive Tackle out of Arizona. He has been in the league for 5 years.
Miami Dolphin Derrick Shelby is a Defensive End out of Utah. He has been in the league for 3 years.
Miami Dolphin Jordan Tripp is a Linebacker out of Montana. He has been in the league for 0 years.
Miami Dolphin Damien Williams is a Running Back out of Oklahoma . He has been in the league for 0 years.

The Players in the array after the sort is:
Miami Dolphin Cortland Finnegan is a Cornerback out of Samford. He has been in the league for 9 years.
Miami Dolphin Brent Grimes is a Cornerback out of Shippensburg. He has been in the league for 8 years.
Miami Dolphin Nate Garner is a Guard out of Arkansas. He has been in the league for 7 years.
Miami Dolphin Brandon Gibson is a Wide Receiver out of Washington State. He has been in the league for 6 years.
Miami Dolphin Cameron Wake is a Defensive End out of Penn State. He has been in the league for 6 years.
Miami Dolphin Mike Wallace is a Wide Receiver out of Mississippi. He has been in the league for 6 years.
Miami Dolphin Louis Delmas is a Safety out of Western Michigan. He has been in the league for 6 years.
Miami Dolphin Brian Hartline is a Wide Receiver out of Ohio State. He has been in the league for 6 years.
Miami Dolphin Jared Odrick is a Defensive Tackle out of Penn State. He has been in the league for 5 years.
Miami Dolphin Koa Misi is a Linebacker out of Utah. He has been in the league for 5 years.
Miami Dolphin Earl Mitchell is a Defensive Tackle out of Arizona. He has been in the league for 5 years.
Miami Dolphin Charles Clay is a Tight End out of Tulsa. He has been in the league for 4 years.
Miami Dolphin Mike Pouncey is a Center out of Florida. He has been in the league for 4 years.
Miami Dolphin LaMichael James is a Running Back out of Oregon. He has been in the league for 3 years.
Miami Dolphin Ryan Tannehill is a Quarterback out of Texas A&M. He has been in the league for 3 years.
Miami Dolphin Lamar Miller is a Running Back out of University of Miami. He has been in the league for 3 years.
Miami Dolphin Olivier Veron is a Defensive End out of University of Miami. He has been in the league for 3 years.
Miami Dolphin Rishard Matthews is a Wide Receiver out of Nevada. He has been in the league for 3 years.
Miami Dolphin Derrick Shelby is a Defensive End out of Utah. He has been in the league for 3 years.
Miami Dolphin Dion Jordan is a Defensive End out of Oregon. He has been in the league for 2 years.
Miami Dolphin Jelani Jenkins is a Linebacker out of Florida. He has been in the league for 2 years.
Miami Dolphin Will Davis is a Cornerback out of Utah State. He has been in the league for 2 years.
Miami Dolphin Jordan Kovacs is a Safety out of Michigan. He has been in the league for 2 years.
Miami Dolphin Jarvis Landry is a Wide Receiver out of LSU. He has been in the league for 0 years.
Miami Dolphin Walt Aikens is a Cornerback out of Liberty. He has been in the league for 0 years.
Miami Dolphin Terence Fede is a Defensive End out of Marist. He has been in the league for 0 years.
Miami Dolphin JaWuan James is a Tackle out of Tennessee. He has been in the league for 0 years.
Miami Dolphin Chris McCain is a Linebacker out of Calfornia . He has been in the league for 0 years.
Miami Dolphin Jordan Tripp is a Linebacker out of Montana. He has been in the league for 0 years.
Miami Dolphin Damien Williams is a Running Back out of Oklahoma . He has been in the league for 0 years.*/
//Guilio Piccinonna
//11-23-14
//Assignment XI
//Program utilizes the StringTokenizer in order to take in
//a text file, sort it, and print it in
//with proper alignment

import java.io.*;
import java.util.*;

public class SuperSrDriver {

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int i;
		int wrongCount = 0;
		Scanner myFile;
		String fileName = "supersenior.txt";
		boolean notFound = true;
		Golfer[] theGolfers = new Golfer[2];
		int size = 3;
		String temp;
		StringTokenizer st;
		String junk;
		
		while (notFound) {
			try {
				myFile = new Scanner(new File(fileName));
				size = myFile.nextInt();
				junk = myFile.nextLine();
				theGolfers = new Golfer[size];
				notFound = false;
				for (i = 0; i < size; i++){
					temp = myFile.nextLine();
					st = new StringTokenizer(temp, ",");
					String lname = st.nextToken();
					String fname  = st.nextToken();
					int numTourn = myFile.nextInt();
					Double totalMon = myFile.nextDouble();
					junk = myFile.nextLine();
					theGolfers[i] = new Golfer(fname, lname, numTourn,totalMon);	
				}
				myFile.close();
			}	
			catch (FileNotFoundException e) {
				System.out.println("Incorrect filename please re-enter ");
				wrongCount ++;
				fileName = kb.nextLine();
				if (wrongCount == 3)
					break;
			}
		}
		bubbleSort(theGolfers,size);
		printIt(theGolfers);
	}
	static void bubbleSort(Golfer[]theGolfers,int size){
		Golfer temp = null;
		int n = theGolfers.length;

		for (int passno = 1; passno < n-1; passno++)
		{
			for (int i=0;i < n-passno;i++)
			{
				if(theGolfers[i].getTotalMon() > theGolfers[i+1].getTotalMon()){
					temp = theGolfers[i];
				theGolfers[i] = theGolfers[i+1];
				theGolfers[i+1] = temp;
				}
			}
		}
	}
	static void printIt(Golfer[]theGolfers){
		System.out.printf(" First name          Last name          Tournaments Won          Winnings \n");
	for (int i=0;i<theGolfers.length;i++){
		System.out.printf("%-14s       %-14s                %4d      %12.2f\n",
				
				theGolfers[i].getFname(), theGolfers[i].getLname(), theGolfers[i].getNumTourn(), theGolfers[i].getTotalMon());
	}
	}
}

/*
First name          Last name          Tournaments Won          Winnings 
 Walter              Zembriski                        2            750.00
 Jim                 Ferree                           1           2000.00
 Dick                Hendrickson                      1           3000.00
 Bob                 Betley                           1           3500.00
 Bob                 Wynn                             1           4000.00
 Bobby               Nichols                          2           7500.00
 Bruce               Devlin                           2           7625.00
 Don                 Bies                             1           8000.00
 Ray                 Floyd                            1          12000.00
 Tom                 Shaw                             4          15250.00
 Simon               Hobday                           2          23542.00
 Dave                Hill                             1          25500.00
 Harold              Henning                          5          29875.00
 Al                  Geiberger                        2          30000.00
 Orville             Moody                            9          33500.00
 Miller              Barber                          10          39175.00
 Gene                Littler                          9          45517.00
 Kermit              Zarley                           4          49333.00
 DeWitt              Weaver                           7          50125.00
 Isao                Aoki                             2          59000.00
 Chi Chi             Rodriguez                       11          73958.00
 Jummy               Powell                           9          82933.00
 Gary                Player                           9          89758.00
 Rocky               Thompson                        17         152283.00
 Larry               Ziegler                         13         156175.00
 Bob                 Charles                         15         170925.00
 J. C.               Snead                           15         184542.00
 Terry               Dill                            17         196592.00
 Walter              Morgan                          15         199175.00
 Jim                 Albus                           16         200958.00
 Charles             Coody                           17         206167.00
 Lee                 Trevino                         12         207376.00
 Dale                Douglass                        16         207958.00
 Jim                 Colbert                         14         223258.00
 Jim                 Dent                            15         271350.00
 Mike                Hill                            13         290042.00
 Dave                Stockton                        16         304292.00
 Gibby               Gilbert                         16         309141.00
 George              Archer                          17         318925.00
*/


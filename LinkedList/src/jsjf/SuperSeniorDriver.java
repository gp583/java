//Guilio Pccinonna
//10-1-15
//Data Structures


package jsjf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SuperSeniorDriver {

	public static void main(String[] args) { 
		proccessGolfers();
	}

	public static void proccessGolfers(){
	//	ArrayOrderedList<Golfers> golfers = new ArrayOrderedList<Golfers>();
		LinkedOrderedList<Golfers> golfers = new LinkedOrderedList<Golfers>();
		Golfers superSenior;
		String filename = "supersenior.txt";
		String temp;
		int size = 39;b 
		StringTokenizer st;
		String fname;
		String lname;
		int numTourn;
		int totalMoney;
		int averageMoney;
		String junk;
		System.out.println("First name:              Last name:          Number of Tournaments:       Total Money Won:       Average Money Won:  \n"); 

		try {
			Scanner jobs = new Scanner(new File(filename));
			for (int i = 1; i <= size; i++){
				temp = jobs.nextLine();
				st = new StringTokenizer(temp, ",");
				lname = st.nextToken();
				fname = st.nextToken();
				numTourn = jobs.nextInt();
				totalMoney = jobs.nextInt();
				junk = jobs.nextLine();
				averageMoney = (totalMoney/numTourn);
				superSenior = new Golfers(fname, lname, numTourn, totalMoney, averageMoney);
				golfers.add(superSenior);
				System.out.println(golfers);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

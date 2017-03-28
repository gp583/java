//Guilio Piccinonna
//Assignment: StdDev
//10-2-14
//program asks for # of inputs, prints average of those #s 
//and standard deviation

import java.util.Scanner;

public class StdDev {

	public static void main(String[] args) {
		StdDev myObj = new StdDev();
		myObj.findStdDev();

	}


	public void findStdDev() {
		int n, i; 
		Scanner kb = new Scanner(System.in);
		System.out.println("How many #'s are you going to input?");	
		n = kb.nextInt();
		int [] x = new int [n];

		for (i=0;i<n;i++)
			x[i] = kb.nextInt();

		double sum = 0;
		for (i=0;i<n;i++)
			sum = sum + x[i];
		double average = sum/n;

		System.out.println(" The average is " + average);
		double stdDev = Math.sqrt(sum/n);
		System.out.println(" The standard deviation is " + stdDev);
	}

}
/*

How many #'s are you going to input?
5
1
2
3
4
5
 The average is 3.0
 The standard deviation is 1.7320508075688772

 */
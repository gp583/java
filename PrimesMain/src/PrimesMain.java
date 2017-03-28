//Guilio Piccinonna
//Assignment 6
//prime numbers

import javax.swing.*;

public class PrimesMain {

	public static void main(String[] args){ 

		int num = Integer.parseInt(JOptionPane.showInputDialog(" Please enter a number: "));
		PrimeFactors(num); 
	} 
	private static void PrimeFactors(int num){ 
		if(Prime(num)){ 
			System.out.print(" " + num); 

		} 
		else{ 
			int divider = 2; 
			boolean found = false; 
			while(!found){ 
				if(num % divider ==0){ 
					PrimeFactors(divider); 
					PrimeFactors(num / divider); 
					found = true; 
				}
				else divider++; 
			} 
		}
	}

	private static boolean Prime(int num){ 
		for(int i = 2; i <= num/2; i++) 
		{ 
			if(num % i == 0 ){ 
				return false; 
			} 
		} 
		return true; 
	} 

}

//please enter a number:
//150
//2 3 5 5 
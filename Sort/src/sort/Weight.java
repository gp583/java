package sort;

import java.util.Scanner;

public class Weight {

		public void readInWeight(Scanner myInput) {
		String tempName, cr;
		int tempWeight;
		
		System.out.print("\n\nWhat is your name? ");
		tempName = myInput.nextLine();
		setName(tempName);
		System.out.print("How much do you weigh? ");
		tempWeight = myInput.nextInt();
		setWeight(tempWeight);
		cr = myInput.nextLine();
	
	
		
		}
		
		private void setName(String tempName) {
			// TODO Auto-generated method stub
			
		}

		private void setWeight(int tempWeight) {
			// TODO Auto-generated method stub
			
		}
		
		public void printIt() {
			System.out.println( tempName + " is a " + position + " out of " + college + ". He has been in the league for "
					+ yearsPro + " years. ");
		
	}

}

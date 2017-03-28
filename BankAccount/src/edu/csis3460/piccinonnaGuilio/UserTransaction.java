package edu.csis3460.piccinonnaGuilio;
import java.util.*;

public class UserTransaction {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double deposit;
		double withdraw;
		double interest;
		int option;

		UserAccount account1 = new UserAccount("Giulio", 1000);
		UserAccount account2 = new UserAccount("Jim", 5000);

		boolean run = true;
		while (run){
			System.out.println("Please select an option from below");
			System.out.println("1 - Deposit, 2 - Withdrawal, 3 - Calculate Interest, 4 - Compare Accounts, 5 - Exit");
			option = kb.nextInt();

			if (option == 1){
				System.out.println("How much would you like to deposit?");
				deposit = kb.nextDouble();
				account1.Deposit(deposit);
			}
			if (option == 2){
				System.out.println("How much would you like to withdraw?");
				withdraw = kb.nextDouble();
				account1.Withdraw(withdraw);
			}
			if (option == 3){
				System.out.println("Please enter interest percentage");
				interest = kb.nextDouble();
				account1.Interest(interest);
			}
			if (option == 4){
				account1.compareTo(account2);
			}
			if (option == 5){
				System.out.println("Goodbye!");
				run = false;
			}
		}
	}
}


		
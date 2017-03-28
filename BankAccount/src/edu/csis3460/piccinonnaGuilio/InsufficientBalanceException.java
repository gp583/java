package edu.csis3460.piccinonnaGuilio;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(double withdrawal) {
	System.out.println("Insufficient Balance:");
}
}
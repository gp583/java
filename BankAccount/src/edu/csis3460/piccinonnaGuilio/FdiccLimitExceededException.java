package edu.csis3460.piccinonnaGuilio;

public class FdiccLimitExceededException extends Exception {

	public FdiccLimitExceededException(double deposit) {
	System.out.println("FDICC Limit exceeded");	
	}
}
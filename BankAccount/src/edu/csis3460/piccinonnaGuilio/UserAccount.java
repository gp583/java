package edu.csis3460.piccinonnaGuilio;

public class UserAccount { 

	String name;
	double balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}


	public UserAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public void Deposit(double dep){
		final double MAXDEPOSIT = 2500000;
		boolean cont = true; 

		while (cont){
			try {
				if (dep > MAXDEPOSIT)
					throw new FdiccLimitExceededException(dep);

				cont = false;
				balance = this.getBalance() + dep;

				System.out.println("Your current balance is $" + balance);
			}catch (FdiccLimitExceededException e) {
				System.out.println(e);;
			}
		}	
	}

	public void Withdraw(double wit){
		boolean cont = true;

		while (cont){
			try{
				if (wit > this.getBalance())
					throw new InsufficientBalanceException(wit);
				cont = false;
				balance = this.getBalance() - wit;
				System.out.println("Your current balance is $" + balance);
			}catch (InsufficientBalanceException e) {
				System.out.println(e);
			}
		}
	}
	public void Interest (Double intPerc){
		
		balance = this.getBalance() + (this.getBalance()*intPerc);
		System.out.println("At " + (intPerc) + "%" + " interest, your current balance is $" + balance);
	}
	
	public void compareTo(UserAccount account2){
		
			if (this.getBalance() > account2.getBalance()){
		System.out.println("The account with the highest balance is " + this.getName() + " ($" + this.getBalance() + ")");
			}
			
			if (account2.getBalance() > this.getBalance()){
				System.out.println("The account with the highest balance is " + account2.getName() + " ($" + account2.getBalance() + ")");
			}
	}
}

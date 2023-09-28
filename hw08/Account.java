package hw08;

public class Account {
	
	private double bal; //The current balance
	private int accnum; //The account number
	
	
	public Account(int accNo, double bal){
		
		bal = 0.0;
		accnum = accNo;
	}

	public void deposit(double sum){
		
		if (sum > 0)
			bal += sum;
		else
			System.err.println("Account.deposit(...): " + "cannot deposit negative amount.");
	}
	
	public void withdraw(double sum){
		
		if (sum > 0)
			bal -= sum;
		else
			System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
	}
	
	public double getBalance(){
		
		return bal;
	}
	
	public double getAccountNumber(){
		
		return accnum;
	}
	
	@Override
	public String toString(){
		
		return "Acc " + accnum + ": " + "balance = " + bal;
	}
	
	public final void print()
	{
	//Don't override this,
	//override the toString method
	System.out.println( toString() );
	}
}

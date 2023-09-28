package hw08;

public class CheckingAccount extends Account{
	
	private double creditLim;

	public CheckingAccount(int accNo, double bal, double creditLim) {
		super(accNo, bal);
		this.creditLim = creditLim;
	}
	
	@Override
	public void deposit(double amt) {
		super.deposit(amt);
	}
	
	@Override
	public void withdraw(double amt) {
		if(getBalance() >= amt)
			super.withdraw(amt);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Credit Limit: " + creditLim;
	}
}

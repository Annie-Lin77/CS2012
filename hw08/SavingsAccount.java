package hw08;

public class SavingsAccount extends Account{
	
	private double annualInt;
	
	public SavingsAccount(int accNo, double bal, double rate) {
		super(accNo, bal);
		this.annualInt = rate;
	}
	
	public double getAnnualInt() {
		return annualInt;
	}
	
	public void setAnnualInt(double annualInt) {
		this.annualInt = annualInt;
	}
	
	@Override
	public void deposit(double amt) {
		super.deposit(amt);
	}
	
	@Override
	public void withdraw(double amt) {
		if(getBalance() > amt)
			super.withdraw(amt);
	}

	public double monthlyIntRate() {
		return annualInt / 12;
	}
	
	public double getMonthlyInt() {
		return getBalance() * (monthlyIntRate() / 100);
	}
	
	public void addInt() {
		super.deposit(getMonthlyInt());
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Annual Interest: " + annualInt;
	}
	
}

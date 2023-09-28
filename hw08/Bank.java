package hw08;

import java.util.ArrayList;

public class Bank {
	
	private static int nextacc = 101;
	Object[] accounts;
	
	public void openSavingsAcc(double bal, double rate) {
		
			SavingsAccount accounts = new SavingsAccount(nextacc, bal, rate);
	}

	public void openCheckingAcc( double bal, double creditLim) {
		
			CheckingAccount accounts = new CheckingAccount(nextacc, bal, creditLim);
	}
	
	public void deposit(int accNo, double amt) {
		
		if(((Account) accounts[accNo]).getAccountNumber() == accNo) {
		//accounts.deposit(amt);
		}
	}
	
	public void withdraw(int accNo, double amt) {
		
		if(((Account) accounts[accNo]).getAccountNumber() == accNo){
		//accounts.withdraw(amt);
		}
	}
	
	public void addInt(int accNo) {
		
		if(((Account) accounts[accNo]).getAccountNumber() == accNo){
		//((SavingsAccount)(accounts[accNo])).addInterest();
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Account> bank = new ArrayList<Account>();
		bank.addAll(nextacc, bank);
		//bank.openCheckingAccount(100, 22);
		//bank.openSAvingsAccount(101, 0.2);
		//bank.withdraw(100, 50);
		//bank.addInterest(101);
		
		System.out.println(bank);
		
	}
	
}

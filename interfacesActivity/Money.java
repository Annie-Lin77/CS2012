package interfacesActivity;

public class Money implements Comparable<Money>, Calculable<Money> {

	private double amount;
	
	public Money(double amount) {
		this.amount = amount;
	}
	
	public Money(Money money) {
		this.amount = money.amount;
	}
	
	public Money add(Money o) {
		double newAmount = amount + o.getAmount();
		newAmount = (double)Math.round(newAmount * 100)/100;
		return new Money(newAmount);
	}

	private double getAmount() {
		return this.amount;
	}

	public Money subtract(Money o) {
		double newAmount = amount - o.getAmount();
		newAmount = (double)Math.round(newAmount * 100)/100;
		return new Money(newAmount);
	}

	public int compareTo(Money o) {
		if(this.amount > o.amount) {
			return 1;
		}
		else if(this.amount < o.amount) {
			return -1;
		}
		else { 
			return 0;
		}
	}
	
	public String toString() {
		return "$" + amount;
	}
}
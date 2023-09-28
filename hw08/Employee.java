package hw08;

public class Employee extends Person{
	
	private double salary;
	private int year;
	private String insurance;
	
	public Employee(String name) {
		
		super(name);
	}
	
	public Employee(String name, double salary, int year, String insurance) {
		super(name);
		this.insurance = insurance;
		this.salary = salary;
		this.year = year;
	}
	
	public void setSalary(double salary) {
		
		this.salary = salary;
	}
	
	public double getSalary() {
		
		return salary;
	}
	
	public void setYear(int year) {
		
		this.year = year;
	}
	
	public int getYear() {
		
		return year;
	}
	
	public void setInsurance(String insurance) {
		
		this.insurance = insurance;
	}
	
	public String getInsurance() {
		
		return insurance;
	}
	
	public int compareTo(Employee rhs) {
		
		String s1 = this.toString().toLowerCase();
		String s2 = rhs.toString().toLowerCase();
		return s1.compareTo(s2);
	}
	
	public boolean equals(Employee rhs) {
		
		return this.compareTo(rhs) == 0;
	}
	

}

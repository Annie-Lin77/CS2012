package university;

public class Employee extends Person {
	
		private int office;
		private double salary;
		private DateHired dateHired;
		
	public Employee(String name, String address, String phone, String email, int office, double salary) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new DateHired();
		}
		
		public int getOffice() {
			return office;
		}
	
		public String getSalary() {
			return String.format("%.2f", salary);
		}
	
		public String getDateHired() {
			return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
		}
		
		public void setOffice(int office) {
			this.office = office;
		}
	
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		public void setDateHired() {
			dateHired = new DateHired();
		}
		
		public String toString() {
		return super.toString() + "Office: " + office + "Salary: $" + getSalary() + "Date hired: " + getDateHired();
		}

}

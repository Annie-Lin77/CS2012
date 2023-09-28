package hw08;

public class EmployeesMain {
	
	public static void main(String[] args) {
		
		Employee janis = new Employee("Janis", 28300, 2000, "871728394");
		Employee EEEE = new Employee("EEEE", 827322, 1999, "8162931");
		Person person = new Person();
		
		System.out.println(person.getName());
		System.out.println(janis.equals(EEEE));
		System.out.println(janis.getName());
		System.out.println(EEEE.getSalary());
	}

}

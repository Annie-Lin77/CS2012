package university;

public class UniversityMain {
	
	public static void main(String args[] ) {
	
	Person person = new Person("Joseph", "101 Randome Road", "7329394824", "JJJohnson@email.com");
	Student student = new Student("Sam", "100 Treestate Drive", "1740283742", "samroady@email.com", + Student.freshman);
	Employee employee = new Employee("Jesus", "34 Ringcity", "82084724221", "JesCity@email.com", 610, 90000);
	Faculty faculty = new Faculty("Offnir", "Something Street", "63822849342", "Offsun@email.com", 300, 50000, "12am to 3pm", "Professor");
	Staff staff = new Staff("John", "90 Liurn Road", "1242828783", "john@email.com", 46, 20000, "Professor Assistant");
			
	System.out.println(person.toString());
	System.out.println(student.toString());
	System.out.println(employee.toString());
	System.out.println(faculty.toString());
	System.out.println(staff.toString());
			
	}
}

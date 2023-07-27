package hierarchicalInheritiance;

public class Test {

	public static void main(String[] args) 
	
	{
		Student s = new Student();
		Employee emp = new Employee();
		
		System.out.println("*********Students Details*********");
		s.inputPerson();
		s.inputStudent();
		s.displayStudent();
		
		
		System.out.println("*********Employee Details*********");
		emp.inputPerson();
		emp.inputEmployee();
		emp.displayEmployee();

	}

}

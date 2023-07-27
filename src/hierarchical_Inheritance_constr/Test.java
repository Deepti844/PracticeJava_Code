package hierarchical_Inheritance_constr;

public class Test {

	public static void main(String[] args)
	{
		System.out.println("---------Students Details---------");
		Student s =new Student(11, "SITA", 45, 'B');
		s.studentdisplay();
		
		
		Employee e = new Employee(31, "RAMESH", 3421, 23000);
		e.employeedisplay();
		

	}

}

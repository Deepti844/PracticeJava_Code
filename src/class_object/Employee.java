package class_object;

public class Employee 
{
	int empid,salary;
	String name;
	
	Employee(int empid, String name, int salary)
	{
		this.empid =empid;
		this.name =name;
		this.salary =salary;
		
	}
	
	void employeedisplay()
	{
		System.out.println(empid + " " +name+" "+salary);
	}
	

	public static void main(String[] args) 
	{
		Employee e =new Employee(101,"John",12000);
		e.employeedisplay();
		
		Employee e1 =new Employee(102,"Ramesh",20000);
		e1.employeedisplay();
		
		Employee e2 =new Employee(103,"harsh",17000);
		e2.employeedisplay();
		

	}

}

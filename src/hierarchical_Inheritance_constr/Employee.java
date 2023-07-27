package hierarchical_Inheritance_constr;

public class Employee extends Person
{
	int empid;
	int sal;
	
	Employee(int age,String name,int empid,int sal)
	{
		super(age,name);
		this.empid =empid;
		this.sal=sal;
		
	}
	
	void employeedisplay() {
		System.out.println("---------EMPLOYEE Details----------");
		System.out.println(age+" "+name+" "+empid+" "+sal);
	}

}

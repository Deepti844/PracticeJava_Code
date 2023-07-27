package hierarchical_Inheritance_constr;

public class Student extends Person
{
	int rollno;
	char grade;
	
	Student(int age,String name,int rollno, char grade)
	{
		super(age,name);
		this.rollno =rollno;
		this.grade =grade;
		
		
	}
	
	void studentdisplay()
	{
		
		System.out.println(age+" "+name+" "+rollno+" "+grade);
	}

}

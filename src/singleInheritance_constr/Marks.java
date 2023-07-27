package singleInheritance_constr;

public class Marks extends Student
 {
	char grade;
	
	Marks(int rollno,String name,char grade)//pc
	{
		super( rollno, name);//inherits parent class constr
		this.grade=grade;
		
	}

	
		void display()
		{
			System.out.println(rollno+ " "+name+" "+grade);
		}
}

package class_object;

public class Student2 
{
	int rollno;
	String name;
	
	//default constru
	
	Student2()
	{
		System.out.println("Hello.......");
		
	}
	
	//parmeterized constru
	
	Student2(int rollno, String name)
	{
		this.rollno =rollno;
		this.name =name;
	}
	
	void display()
	{
		System.out.println(rollno +" "+ name);
	}

	public static void main(String[] args)
	{
		Student2 s= new Student2();//dc
		Student2 s2= new Student2(102,"John");//pc
		s2.display();

	}

}

package statickeywords;

public class Student 

{
	int rollno;
	String name;
	static String clgname ="ITS";
	
	Student(int rollno,String name)//pc
	{
		this.rollno =rollno;
		this.name = name;
		
	}
	
	void displaystudent()
	{
		System.out.println(rollno+" "+name+ " "+clgname);
	}
	
	static void changeclgname()
	{
		clgname ="MGM";
	}
}

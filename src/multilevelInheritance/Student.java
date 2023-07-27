package multilevelInheritance;

import java.util.Scanner;

//Student
//Marks
//Sports--score


public class Student 

{
	int rollno;
	String name;
	
	Scanner sc = new Scanner(System.in);
	
	void inputStudent()
	{
		System.out.println("Enter the roll no :");
		rollno= sc.nextInt();
		
		System.out.println("Enter the name : ");
		name =sc.next();
		
	}
	

}

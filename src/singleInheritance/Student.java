package singleInheritance;

import java.util.Scanner;

//Student
//marks


public class Student
{

	int rollno;
	String name;
	
	Scanner sc = new Scanner(System.in);
	
	void inputStudent()
	{
	
	System.out.println("Enter the rollno : ");
	rollno = sc.nextInt();
	
	System.out.println("Enter the name : ");
	name = sc.next();
	
	}
	
}

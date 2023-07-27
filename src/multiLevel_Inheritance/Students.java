package multiLevel_Inheritance;

import java.util.Scanner;

public class Students {
	
	int roll_no;
	String name;
	Scanner sc = new Scanner(System.in);
	
	void inputStudents() {
		
		System.out.println("Enter the rollno");
		roll_no = sc.nextInt();
		
		System.out.println("Enter the name");
		name = sc.next();
	}

}

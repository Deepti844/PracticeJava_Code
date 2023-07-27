package singleInhertiance_Method;

import java.util.Scanner;

public class Students {

	
		
		int roll_no;
		String name;
		Scanner sc = new Scanner(System.in);
		
		void inputStudent1() {
			
			System.out.println("Enter the rollno: ");
			roll_no = sc.nextInt();
			System.out.println("Enter the name : ");
			name = sc.next();
			
		}
		
	}



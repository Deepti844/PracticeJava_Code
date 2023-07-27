package javaTest;

import java.util.Scanner;

//Write a program to ask the age from user and check the eligibility for the Rollar Coaster ride
//a)age less than 12 ---Print a message “ You should have come after ---- years”
//b)age greater than 65---Print a message” You should have before -- --- years”
//c) Enjoy the ride

public class RollerCoast {

	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age =sc.nextInt();
		
		if (age<12)
		{
			System.out.println("You should have come after "+ (12-age)+" years");
		}
		
		else if(age>65)
		{
			System.out.println("You should have come before "+ (age-65)+" years");
		
		}
		
		else
		{
			System.out.println("--ENJOY THE RIDE--");
		}

	}

}

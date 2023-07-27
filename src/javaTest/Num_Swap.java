package javaTest;

import java.util.Scanner;

//1)Write a program to ask two numbers form user and swap them(interchange the numbers)
public class Num_Swap {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number :");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd number :");
		int b = sc.nextInt();
		
		System.out.println("Enter the 1st number :"+a);
		
		System.out.println("Enter the 2st number :"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("+++++++++Swaping++++++++");
		System.out.println("Enter the 1st number :"+a);
		
		System.out.println("Enter the 2st number :"+b);
		

	}

}

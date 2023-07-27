package javaTest;
//Write a program to ask the limit from user and print the squares till the limit 
//and also find the cube of squares.

import java.util.Scanner;

public class CubeofSquare {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int lim = sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=lim;i++)
		{
			int c=i*i;
			System.out.println("\nSquare of "+i+" is : "+c);
			
			
			System.out.println("Cube of "+i+" is : "+c*c*c);
			
			
		}
		
		
		

	}

}

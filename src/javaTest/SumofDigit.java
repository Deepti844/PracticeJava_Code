package javaTest;
//3)Write a program to ask a number from user and find the sum of 
//digits.(Example:123=1+2+3=6)

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number, to find the sum of digits :");
		int num = sc.nextInt();
		
//		int a=num/10;123
//		3
//		2
//		
//		int sum =0;
//		sum =sum +a;
		int sum=0;
		int a;
		
			
		
		
		while(num>0)//123,12,1
		{
			a= num%10;//3,2,1
			sum=sum+a;//3,5,6
			num= num/10;//12,1,.
			
		}
		System.out.println("Sum of digit : "+sum);
		

	}

}

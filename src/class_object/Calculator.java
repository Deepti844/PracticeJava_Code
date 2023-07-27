package class_object;

import java.util.Scanner;

public class Calculator
{
	void  add(int n1,int n2)
	{
		int sum =n1+n2;
		System.out.println("Sum is : "+sum);
		
	}
	
	void minus(int num1,int num2)
	{
		int minus = num1- num2;
		System.out.println(" Minus result is : "+minus);
	}
	
	float div(float d1,float d2)
	{
		return(d1/d2);
	}
	
	float multi(float m1, float m2)
	{
		return(m1*m2);
	}
	
	
	String concat(String s1, String s2)
	{
		return (s1+s2);
	}

	public static void main(String[] args)
	{
		
		Calculator c=new Calculator();
		c.add(5, 9);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st num : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2nd num : ");
		int num2 = sc.nextInt();
		
		c.minus(num1, num2);
		
		System.out.println("Division is : "+c.div(6,2));
		
		System.out.println("Multiply is : "+c.multi(2.1f, 3.2f));
		
		System.out.println("Concate is : "+c.concat("Good", " Morning"));

	}

}

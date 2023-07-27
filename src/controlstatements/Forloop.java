package controlstatements;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit for sum of square of numbers");
		int limit = sc.nextInt();
		int sum =0;
		
		for(int i=1;i<=limit; i++)
		{
			System.out.println(i);
			System.out.println("Square of "+i +" is "+(i*i));
			sum= sum+(i*i);
			
		}
		System.out.println("\nThe sum of the square of the numbers : "+sum);
		
	}

}

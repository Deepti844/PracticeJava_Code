package Control;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) 
	
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of integers to get its sum : ");
		int size =sc.nextInt();
		
		//declare the array
		int arr[]= new int[size];
		int sum=0;
		
		//take user input
		System.out.println("Enter "+size+" integer values : ");
		
		for(int i=0; i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("\n___________Normal FORLOOP______________\n");//display the array
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
			sum=sum+arr[i];
		}
		System.out.println("Sum of integers : "+sum);
		System.out.println("\n___________ENCHANCED FORLOOP______________\n");//display the array
		
		for (int a:arr)
		{
			System.out.println(a);
		}
		System.out.println("Sum of integers : "+sum);
		
		
		
		
		
		

	}

}

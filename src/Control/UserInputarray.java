package Control;

import java.util.Scanner;

public class UserInputarray {

	public static void main(String[] args) 
	
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array");//ask user the array size
		int size =sc.nextInt();
		
		
		
		
		//declare the array
		int arr[]=new int[size];
		
		System.out.println("Enter the values in array :  ");//ask user the array values
		
		for(int i=0;i<size;i++)
		{
			 arr[i]=sc.nextInt();
			
		}
		System.out.println("---NORMAL FORLOOP----");
		System.out.println("Display array value  ");//display the array values
		
		for(int i=0;i<size;i++)
		{
			 System.out.println(arr[i]);
			
		}
		
		System.out.println("---ENCHANCED FORLOOP----");
		
		for(int a:arr)
		{
			System.out.println(a);
		}

	}

}

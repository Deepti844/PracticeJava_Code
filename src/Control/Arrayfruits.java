package Control;

import java.util.Scanner;

public class Arrayfruits {

	public static void main(String[] args)
	
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of fruits :");
		int num =sc.nextInt();
		
		//declare array
		String arr[]= new String[num];
		
		//take the fruit name from user
		
		System.out.println("Enter "+num+" fruit name");
		
		
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.next();
		}
		
		System.out.println("\nNormal forloop\n");
		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("\nEnchanced forloop\n");
		for(String a:arr)
		{
			System.out.println(a);
		}


	}

}

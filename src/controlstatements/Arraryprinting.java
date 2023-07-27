package controlstatements;

import java.util.Scanner;

public class Arraryprinting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of array : ");
		
		int lim = sc.nextInt();
		
		//declare array
		int arr[]= new int[lim];
		
		System.out.println("Enter the values :");
		
		for (int i=0;i<lim;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The array is :");
		
		//displaying the array
		
		for (int i=0;i<lim;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}

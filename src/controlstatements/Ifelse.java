package controlstatements;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  three numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("\nThe number are : \n"+num1+ "\n"+num2+ "\n"+num3);
		
		if ((num1>num2)&&(num1>num3))
		{
			System.out.println("\n"+num1+" is greatest");
		}
		else if((num2>num1)&&(num2>num3))
		{
			System.out.println("\n"+num2+" is greatest");
		}
		
		else
		{
			System.out.println("\n"+num3+" is greatest");
		}

	}

}

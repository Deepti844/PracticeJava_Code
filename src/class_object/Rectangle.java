package class_object;

import java.util.Scanner;

public class Rectangle 

{ //data member
	int length, breadth;
	
	//declaration
	void inputRectangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle : ");
		length= sc.nextInt();
		System.out.println("Enter the breadth of the rectangle : ");
		breadth= sc.nextInt();
	}
	
	// method or function for calculation of area & perimeter
	
	void calculation()
	{
		System.out.println("The area of rectangle : "+(length*breadth));
		System.out.println("The perimeter of rectangle : "+2*(length*breadth));
	}

	public static void main(String[] args)
	{
		Rectangle rect =new Rectangle();
		rect.inputRectangle();
		rect.calculation();

	}

}

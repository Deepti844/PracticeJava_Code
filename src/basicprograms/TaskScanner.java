package basicprograms;
import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args)
	
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		float rad= sc.nextFloat();
		
		System.out.println("The radius is : "+ rad);
		System.out.println("The area is : "+(3.14f*rad*rad));

	}

}

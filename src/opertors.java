
public class opertors 
{

	public static void main(String[] args)
	{
		int a=16;
		int b=4;
		
		int small=(b<a)?b:a;
		{
			System.out.println("smallest number : "+ small);
			
			b+=2;
			System.out.println(b);
		}
		
		int c=3;
		
		System.out.println("Square is : "+(c*c));
		System.out.println("Cube is : "+(c*c*c));

		int e= 3;
		int f=2;
		int g=2;
		
		System.out.println("Product is: "+(e*f*g));
		
		System.out.println("Area of the rectangle is : "+(e*f));
		System.out.println("Perimeter of the rectangle is : "+2*(e+f));
		
		
	}

}

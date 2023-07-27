package methodOverriding;

public class Vehicle 

{
	 final int speed =100;
		
	
	 final void displayspeed()
	{
		//speed=300;
		System.out.println("Speed is : "+speed);
	}

public static void main(String[] args) 
{
	Vehicle b= new Vehicle();
	b.displayspeed();
	
}

}

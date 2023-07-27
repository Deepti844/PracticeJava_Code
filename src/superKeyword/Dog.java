package superKeyword;

public class Dog extends Animal 
{
	String color ="white";
	
	void eat()
	{
		System.out.println("Eating,Sleeping!!");
	}
	
	
	void printcolor()
	{
		System.out.println(color);
		System.out.println(this.color);//pts color within the same class
		
		System.out.println(super.color);//pts to the Parent class
		
		eat();
		super.eat();
	}
}

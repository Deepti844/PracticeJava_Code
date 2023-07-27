package methodOverriding;

public class Apple extends Fruit
{
	void eat(String color)
	{
		super.eat("Sweet");
		System.out.println("Eating apple :"+color);
	}

		
	void msg()
	{
		System.out.println("Hello......");
	}

}

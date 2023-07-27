package methodOverriding;

public class Test {

	public static void main(String[] args) 
	{	
		
		Apple a =new Apple();
		a.eat("Red");
		a.msg();
		
		//dynamic dispatch--restricted to overrided class
		//Parent p =new Child();
		Fruit f =new Apple();
		f.eat("Not good");
		
		

	}

}

package methodoverriding1;

public class Test {

	public static void main(String[] args)
	{
		
//		Apple a = new Apple();
//		a.eat("red");
		
		//Dynamic dispatch- restricted to overrided methods only
		Fruit f= new Apple();
		f.eat("bad");
		

	}

}

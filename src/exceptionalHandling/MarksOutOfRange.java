package exceptionalHandling;

public class MarksOutOfRange extends Exception
{

	MarksOutOfRange (String s){
		super(s);//inherits the constr of Exception Class
	}
}

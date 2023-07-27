package class_object;

public class furniture 
{	//data member 
	String color ="Brown";
	String shape ="Round";
	
	void displaydetails()//declaration
	{
		System.out.println(color+ " " + shape);//defination
	}
	
	

	public static void main(String[] args)//calling 
	{
		furniture table = new furniture();//create the object
		table.displaydetails();//calling the function using object

		

	}

}

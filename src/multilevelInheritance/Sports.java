package multilevelInheritance;

public class Sports extends Marks 
{
	int score;
	
	void score()
	{
		System.out.println("Enter the score : ");
		score =sc.nextInt();
		
	}
	
	void display()
	{
		System.out.println(rollno+"  "+name+"  "+grade+"  "+score);
	}
}

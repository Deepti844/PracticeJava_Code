package multiLevel_Inheritance;

public class Sports extends Marks {
	
	float score;
	
	void score() {
		System.out.println("Enter the score : ");
		score =sc.nextFloat();
		
	}
	
	void display() {
		System.out.println( roll_no+","+name+","+marks+","+score);
	}

}

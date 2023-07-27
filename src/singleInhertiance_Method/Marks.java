package singleInhertiance_Method;

public class Marks extends Students {
	
	char grade;
	
	void inputGrade() {
		 
		System.out.println("Enter the grade: ");
		grade =sc.next().charAt(0);
	}
	
	void display() {
		 System.out.println(roll_no+ " "+name+" "+grade);
	}

	

}

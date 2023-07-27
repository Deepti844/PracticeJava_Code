package statickeyword;

public class Student {

		int rollno;
		String name;
		static String clgname =" ITS";
		
		Student(int rollno,String name)
		{
			this.rollno = rollno;
			this.name = name;
		}
		
		void display()
		{
			System.out.println(rollno+" "+name+" "+clgname);
		}
		
		static void changename() {
			clgname = " bts1"; 
			
		}
		
		

	}



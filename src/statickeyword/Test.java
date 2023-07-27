package statickeyword;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Alice");
		Student s2 = new Student(102,"John");
		Student s3 = new Student(103,"Ben");
		
		Student.changename();
		
		s1.display();
		s2.display();
		s3.display();

	}

}

package controlstatements;

public class Stringhandling {

	public static void main(String[] args) {
		
		
		//string is an object in java that represents 
		//a sequence of characters
		//declaring a string in java
		//1. String literal 2. new keyword
		 
		
		//1. String literal--same content in s1 & s2
		// with not create another object s2 and content is same
		//String s1="Hello world Welcome here!!";
		//String s2="Hello world Welcome here!!";
		String s3="Good morning";
		
		//new keyword- will create 
		String s = new String ("Welcome");
		String st = new String ("Welcome");
		
		String s2="Hello world Welcome here!!";
		String[] splitted =s2.split(" ");
		//String[] splitted =s2.split("Welcome");

		
		int arraylength= splitted.length;
		System.out.println("The length of splitted : "+arraylength);
		
		
		
		for(int i =0;i<splitted.length;i++) {
			
			System.out.println(splitted[i]);
		}
			
		
	}

}

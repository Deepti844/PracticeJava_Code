package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReadfile {

	public static void main(String[] args) throws IOException {
		//write a file 
		FileWriter fw =new FileWriter("D:\\myfile.txt");
		fw.write("Hi, How Are you doing today??");
		System.out.println("File has been created.....!!!!!");
		
		fw.close();
		
		// read a file
		FileReader fr = new FileReader("D:\\\\myfile.txt");
		int i;
		while((i=fr.read())!=-1)//!=-1--> end of the file(EOF)
		{
			
			System.out.print((char)i);//CONVERT interger to character, 
										//type casting
		}

	}

}

package controlstatements;

public class Duplicatecharacterinstring {

	public static void main(String[] args) {
		String s ="go to gym";
		int count;
		
		char string[]=s.toCharArray();
		System.out.println("The length of string : "+string.length);
		
		System.out.println("Duplicate characters in the string : ");
		
		for (int i =0;i<string.length;i++) {
			 count =1;
			for (int j=i+1;j<string.length;j++) {
				if (string[i] ==string[j] && string[i]!=' ') {
					count++;
					string[j]= '0';
				}
				
			}if(count>1 && string[i]!='0')
			{
				System.out.println("count of "+string[i]+":    "+count);
				System.out.println(string[i]);
			}
		}

	}

}

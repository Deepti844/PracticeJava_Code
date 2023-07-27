package controlstatements;

public class Duplicatewordsinstring {

	public static void main(String[] args) {
		
		String s= "Learn Java learn selenium learn api learn java";
		String s1 =s.toLowerCase();
		System.out.println("Lower case string : "+s1); 
		
		
		String[] splitted = s1.split(" ");
		int length = splitted.length;
		
		for(int i=0;i<length;i++) {
			System.out.println(splitted[i]);
		}
		System.out.println("The length of splitted s1 :"+length);
		
		System.out.println("Duplicate words in string s : ");
		int count;
		for (int i=0;i<length;i++)
		{
			count =1;
			for(int j =i+1;j<length;j++) {
				if(splitted[i].equals(splitted[j])) {
					count++;
					splitted[j]="0";
							
				}
				
				}
			if(count>1 && splitted[i]!="0") {
					System.out.println(splitted[i]);
			}
			
		} 

	}

}

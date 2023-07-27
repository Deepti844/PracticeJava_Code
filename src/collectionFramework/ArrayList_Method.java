package collectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Method {

	public static void main(String[] args) 
	
	{
		//Arraylist is generic to integer values and allows only integer values.
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(399);
		list1.add(129);
		list1.add(332);
		list1.add(458);
		list1.add(399);
		System.out.println(list1);//allows duplicates and insertion order
		
		list1.set(3,75);//modify or replace value at a particular position
		
//		System.out.println("\n"+list1);
		
		list1.add(2,5);//insert value at a particular position
		
		System.out.println("\n"+list1);
		
		//to get the sublist part
		System.out.println("\n"+list1.subList(2, 5));//last index is not included
		
		list1.remove(0);
		System.out.println(list1);
		
		//create one more arraylist list2
		
		   ArrayList <Integer> list2= new ArrayList <Integer>();
		   list2.add(4);
		   list2.add(8);
		   list2.add(3);
		   
		   System.out.println(list2);

		   //merge list1 and list2
//		   list1.addAll(list2);
//		   
//		   System.out.println(list1);
		   
		   
		   list2.addAll(list1);
		   
		   
		   System.out.println(list2);
		   System.out.println("\nList1:  "+list1+"\n");
		   
		   System.out.println("No of values +ent in List1 : "+list1.size());
		   
		   System.out.println("to print the value using index : "+list1.get(3));
		   
		   System.out.println("to check value is+ent or not : "+ list1.contains(75));
		   
		   System.out.println("to get index of any value : "+list1.indexOf(5));
		
		//sorting the data in arraylist
		   
		   Collections.sort(list1);// default ascending order
		   System.out.println("\n-----Ascending-by default--------");
		  System.out.println(list1);
		  
		  Collections.sort(list1,Collections.reverseOrder());
		  System.out.println("\n------Descending--------");
		  System.out.println(list1);
		  
		  
		  //print arraylist using enhanced forloop
		  
		  System.out.println("\nFOR LOOP");
		  
		  for (Integer a:list1)
		  {
			  System.out.println(a);
		  }
		  
		  
		  System.out.println("\n LIST ITERATOR");
		  //forward and backward
		  
		  ListIterator<Integer>itr1= list1.listIterator();
		  
		  System.out.println("\n FORWARD---");
		  
		  while(itr1.hasNext())
		  {
			  System.out.println(itr1.next());
		  }
		  
		  
			System.out.println("\n BACKWARD---");
					  
					  while(itr1.hasPrevious())
					  {
						  System.out.println(itr1.previous());
					  }	
		  
		  System.out.println("\n ITERATOR \n\nONLY FORWARD");
		  //ONLY FORWARD
		  
		  Iterator<Integer> itr2 = list1.iterator();
		  
		  while(itr2.hasNext())
		  {
			  System.out.println(itr2.next());
		  }
		  
		  
	}

}

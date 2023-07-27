package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Method {

	public static void main(String[] args) {
		
		
		LinkedList<Integer>list1 =new LinkedList<Integer>();
		
		list1.add(45);
		list1.add(74);
		list1.add(86);
		list1.add(23);
		list1.add(18);
				
		list1.add(18);//allow duplicate values
		System.out.println(list1);
		
		list1.set(3,10);//modify or replace value at a particular position
		
		System.out.println("\n"+list1);
		
		list1.add(3,68);//add/insert value at a particular position
		System.out.println("\n"+list1); 
		
		//to get sublist part
		
		System.out.println("\n"+list1.subList(2, 6));//last index is not included
		
		//remove value from an index
		System.out.println("\n Ordinal list : "+list1);
		System.out.println("\n"+list1.remove(4));
		System.out.println("\nList1 after removing 4th index value : "+list1);
		
		//create an arraylist and merge it with Linkedlist
		
		ArrayList<Integer>list2= new ArrayList<Integer>();
		list2.add(789);
		list2.add(159);
		list2.add(753);
		list2.add(456);
		list2.add(425);
		
		System.out.println("\n Array list, list2 : \n"+list2);
		
		list2.addAll(list1);
		System.out.println("\n Adding arraylist and linkedlist\n"+list2);
		
		System.out.println("\n Linkedlist l1 : "+list1);
		System.out.println("No.of values +ent in l1 : "+list1.size());
		System.out.println("To print the value using index : "+list1.get(3));
		System.out.println("TO check if the value is +ent or not : "+list1.contains(34));
		System.out.println("To get the index of a value : "+list1.indexOf(74));
		
		System.out.println("\n SORTING THE DATA OF LINKEDLIST: ");
		Collections.sort(list1);
		System.out.println("Ascending order : "+list1);
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("\nDescending order : "+list1);
		
		System.out.println("\nPrint the values of LinkedList");
		System.out.println("\n Using for-loop---");
		
		System.out.println("\n List1 : "+list1);
		
		for (Integer a:list1)
		{
			System.out.println(a);
		}
		
		System.out.println("\n Using ListIterators : __");
		
		ListIterator<Integer>itr1=  list1.listIterator();
		
		System.out.println("\n FORWARD ");
		
		while (itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
		System.out.println("\n BACKWARD ");
		
		while (itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
		
		System.out.println("\nIterator\n\n------ONLY FORWARD-----");
		Iterator<Integer>itr2 =list1.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		System.out.println("Method which are in Linkedlist :: ");
		System.out.println("\nList1: "+list1);
		
		list1.remove(3);//remove the value from index 3
		System.out.println("\n"+list1);
		System.out.println("\nList1: "+list1);
		list1.removeFirst();//remove 1st value
		System.out.println("\n"+list1);
		
		list1.removeLast();
		System.out.println("\n"+list1);
		
//		list1.clear();//empty the list
//		System.out.println("\nEmpty list :----"+list1);
		
		list1.getFirst();//First value
		System.out.println("\n"+list1.getFirst());
		
		System.out.println("\n"+list1.getLast());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

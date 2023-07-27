package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(74);
		hs.add(35);
		hs.add(35);
		hs.add(48);
		hs.add(62);
		hs.add(19);
		
		System.out.println("Hash Set, random order with Unique data:\n"+hs);

		
		LinkedHashSet<Integer>lhs = new LinkedHashSet<Integer>(); 
		lhs.add(71);
		lhs.add(39);
		lhs.add(42);
		lhs.add(68);
		lhs.add(68);
		lhs.add(23);
		
		System.out.println("\nLinked Hash Set,Unique,Inserted data :\n"+lhs);
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(79);
		ts.add(84);
		ts.add(37);
		ts.add(28);
		ts.add(15);
		ts.add(65);
		ts.add(65);
		
		System.out.println("\nTree Set, Unique,Sorted(Ascending) data:\n"+ts);
		
		
		System.out.println("Treeset, Descending order : \n"+ts.descendingSet());
		
		lhs.addAll(ts);
		System.out.println("\nMerge Linkedhashset &treeset :\n  "+lhs);
		
		hs.addAll(ts);
		System.out.println("\nMerge Linkedhashset &treeset :\n  "+hs);
		
		System.out.println("\nNo. of values +ent in set: "+ts.size());
		System.out.println("\nTo check the value is +ent or not: "+ts.contains(65));
		System.out.println("\nPrint the 1st value: "+ts.first());
		System.out.println("\nPrint the last value: "+ts.last());
		
		System.out.println("\n*--------*FOR-LOOP*-------*");
		
		for(Integer a:ts)
		{
			System.out.println(a);
		}
		
		System.out.println("\n*--------*Iterator*--------*");
		
		Iterator<Integer> itr = ts.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}	
		
		
		
		System.out.println("\n*--------*Priority Queue*--------*");
		
		PriorityQueue<Integer> pq= new PriorityQueue();
		pq.add(7);
		pq.add(48);
		pq.add(19);
		pq.add(48);
		pq.add(43);
		System.out.println("\nPriority Queue : "+pq);
		System.out.println("\nTo remove Front value: "+pq.remove());
		System.out.println("\nTo remove Front value: "+pq);
		
//		pq.clear();
//		System.out.println(pq);
		
//		pq.poll();
//		System.out.println("\nPoll on empty pq: "+pq);
		
//		pq.remove();
//		System.out.println("\nRemove on empty pq :"+pq);
		//throws exception unlike Poll.
		
		System.out.println("\nPrints the 1st value: "+pq.peek());
		System.out.println("\nNo.of values : "+pq.size());
		System.out.println("\nTo check the value is +ent or not:"+pq.contains(89));
		
		System.out.println("\n****Print the loop*****\n Enhanced Forloop*****\n");
		
		for (Integer p:pq)
		{
			System.out.println(p);
		}
		
		System.out.println("\n****Print the loop\n Iterators*****\n");
		
		Iterator<Integer> itr1= pq.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

//5) Create a ArrayList and name it as breakfast_list and add three
//values in it.. 
// Create a TreeSet and name it as lunch_list and add three values in 
// it..Create a TreeMap and consider key as String and name it as
//breakfast and for values use the ArrayList as created 
// Create a TreeMap and consider key as String and name it as lunch
//and for values use the TreeSet as created 
//above… Traverse the two maps using for loop.. 
public class Test_Collections {

	public static void main(String[] args) {
		ArrayList<String>breakfast_list= new ArrayList<String>();
		
		breakfast_list.add("Bread");
		breakfast_list.add("Butter");
		breakfast_list.add("Jam");
		System.out.println("\nBreakfast is: "+breakfast_list);
		
		TreeSet<String>lunch_list= new TreeSet<String>();
		lunch_list.add("Rice");
		lunch_list.add("Dal");
		lunch_list.add("Curry");
		System.out.println("\nLunch is: "+lunch_list+"\n");
		
		
		TreeMap<String,String>breakfast=new TreeMap<String,String>();
		breakfast.put("one","Bread");
		breakfast.put("two","Butter");
		breakfast.put("three","Jam");
		
		System.out.println(breakfast);
		
		System.out.println("\n---Print the breakfast map using enchanced for loop--");
		

		for(Map.Entry<String,String> m:breakfast.entrySet())
		{
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
		
		TreeMap<String,String>lunch=new TreeMap<String,String>();
		lunch.put("one","Rice");
		lunch.put("two","Dal");
		lunch.put("three","Curry");
		
		System.out.println(lunch);
		
		System.out.println("\n---Print the lunch map using enchanced for loop--");
		

		for(Map.Entry<String,String> m:lunch.entrySet())
		{
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

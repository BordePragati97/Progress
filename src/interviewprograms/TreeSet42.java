package interviewprograms;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet42 {

	public static void main(String[] args) {

		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
//or Treeset Elements in decending order
		  
		  TreeSet<String> set=new TreeSet<String>();  
	         set.add("Ravi");  
	         set.add("Vijay");  
	         set.add("Ajay");  
	         System.out.println("Traversing element through Iterator in descending order");  
	         Iterator<String> i=set.descendingIterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  

//or  retrieve and remove the highest and lowest Value.

	         TreeSet<Integer> set1=new TreeSet<Integer>();  
	         set1.add(24);  
	         set1.add(66);  
	         set1.add(12);  
	         set1.add(15);  
	         System.out.println("Highest Value: "+set1.pollFirst());  
	         System.out.println("Lowest Value: "+set1.pollLast());  
  
//or perforem NavigableSet operations
	         
	         TreeSet<String> set2=new TreeSet<String>();  
	         set2.add("A");  
	         set2.add("B");  
	         set2.add("C");  
	         set2.add("D");  
	         set2.add("E");  
	         System.out.println("Initial Set: "+set2);  
	           
	         System.out.println("Reverse Set: "+set2.descendingSet());  
	           
	         System.out.println("Head Set: "+set2.headSet("C", true));  
	          
	         System.out.println("SubSet: "+set2.subSet("A", false, "E", true));  
	           
	         System.out.println("TailSet: "+set2.tailSet("C", false));  

//or perforem SortedSet operations
	         
	         TreeSet<String> set3=new TreeSet<String>();  
	         set3.add("A");  
	         set3.add("B");  
	         set3.add("C");  
	         set3.add("D");  
	         set3.add("E");  
	           
	         System.out.println("Intial Set: "+set3);  
	           
	         System.out.println("Head Set: "+set3.headSet("C"));  
	          
	         System.out.println("SubSet: "+set3.subSet("A", "E"));  
	           
	         System.out.println("TailSet: "+set3.tailSet("C"));  


		
	}

}

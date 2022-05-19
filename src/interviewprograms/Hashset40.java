package interviewprograms;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset40 {

	public static void main(String[] args) {

		  //Creating HashSet and adding elements  
	    HashSet<String> set1=new HashSet<String>();  
	           set1.add("One");    
	           set1.add("Two");    
	           set1.add("Three");   
	           set1.add("Four");  
	           set1.add("Five");  
	           Iterator<String> i=set1.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  


	           System.out.println("*********************************");
		//or
	           
	           HashSet<String> set=new HashSet<String>();  
	           set.add("Ravi");  
	           set.add("Vijay");  
	           set.add("Arun");  
	           set.add("Sumit");  
	           System.out.println("An initial list of elements: "+set);  
	           //Removing specific element from HashSet  
	           set.remove("Ravi");  
	     
	           System.out.println("After invoking remove(object) method: "+set);  
	           HashSet<String> set2=new HashSet<String>();  
	           set2.add("Ajay");  
	           set2.add("Gaurav");  
	           set.addAll(set2);  
	           System.out.println("Updated List: "+set);  
	           //Removing all the new elements from HashSet  
	           set.removeAll(set2);  
	           System.out.println("After invoking removeAll() method: "+set);  
	           //Removing elements on the basis of specified condition  
	           set.removeIf(str->str.contains("Vijay"));    
	           System.out.println("After invoking removeIf() method: "+set);  
	           //Removing all the elements available in the set  
	           set.clear();  
	           System.out.println("After invoking clear() method: "+set);  
		
		
	}

}

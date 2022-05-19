package interviewprograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset41 {

	public static void main(String[] args) {
//1
        LinkedHashSet<String> set=new LinkedHashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
//2
        
             LinkedHashSet<String> lhs = new LinkedHashSet<String>();  
          
        lhs.add("Java");  
        lhs.add("T");  
        lhs.add("Point");  
        lhs.add("Good");  
        lhs.add("Website");  
          
        System.out.println("The hash set is: " + lhs);  
          
         // since the element "Good" is present, therefore, the method remove()  
        // returns true  
        System.out.println(lhs.remove("Good"));  
          
        // After removing the element  
        System.out.println("After removing the element, the hash set is: " + lhs);  
          
        // since the element "For" is not present, therefore, the method remove()  
        // returns false  
        System.out.println(lhs.remove("For"));  


		
		
		
		
		
		
	}

}

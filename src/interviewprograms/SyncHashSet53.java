package interviewprograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SyncHashSet53 {

	public static void main(String[] args) {

		 // creating hash set
        Set<Integer> hash_set = new HashSet<Integer>();
        
        // adding the elements to hash set
        hash_set.add(1);
        hash_set.add(2);
        hash_set.add(3);
        hash_set.add(4);
        hash_set.add(5);
        
        // changing hash set to synchronized
        // set and storing in set
        Set synset = Collections.synchronizedSet(hash_set);
        System.out.println("Synchronized Set: " + synset);	
		
	}

}

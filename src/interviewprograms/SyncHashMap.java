package interviewprograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SyncHashMap {

	public static void main(String[] args)throws Exception {

        try {
            // create a HashMap object
            Map<String, String> hMap
                = new HashMap<String, String>();
            
            // add elements into the Map
            hMap.put("1", "Welcome");
            hMap.put("2", "To");
            hMap.put("3", "Geeks");
            hMap.put("4", "For");
            hMap.put("5", "Geeks");
            
            System.out.println("Map : " + hMap);
            
            // Synchronizing the map
            Map<String, String> sMap
                = Collections.synchronizedMap(hMap);
  
            // printing the Collection
            System.out.println("Synchronized map is : "
                               + sMap);
        }
  
        catch (IllegalArgumentException e) 
        {
            System.out.println("Exception thrown : " + e);
        }


		
		
		
		
	}

}

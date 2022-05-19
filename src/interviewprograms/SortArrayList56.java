package interviewprograms;
import java.util.*;   

public class SortArrayList56 {

	public static void main(String[] args) {
		//or String type in Ascending order

		ArrayList<String> list = new ArrayList<String>();   
		list.add("Toyota");   
		list.add("Porsche");   
		list.add("Ferrari");   
		list.add("Mercedes-Benz");   
		list.add("Audi");   
		list.add("Rolls-Royce");  
		list.add("BMW");  
		// printing the unsorted ArrayList   
		System.out.println("Before Sorting: "+ list);   
		// Sorting ArrayList in ascending Order   
		Collections.sort(list);   
		// printing the sorted ArrayList   
		System.out.println("After Sorting: "+ list);  
		
		//or Integer type in Ascending order

		ArrayList<Integer> list1 = new ArrayList<Integer>();  
		list1.add(55);  
		list1.add(34);  
		list1.add(98);  
		list1.add(67);  
		list1.add(39);  
		//printing ArrayList before sorting  
		System.out.println("ArrayList Before Sorting:");  
		for(int marks: list1)  
		{  
		System.out.println(marks);  
		}  
		//sorting ArrayList in ascending order  
		Collections.sort(list);  
		//printing ArrayList after sorting  
		System.out.println("ArrayList After Sorting:");  
		for(int marks: list1)  
		{  
		System.out.println(marks);  
		}  

		//or String type in Decending order
		
		ArrayList<String> list2 = new ArrayList<String>();   
		list2.add("Testing");   
		list2.add("C#");   
		list2.add("UML");   
		list2.add("Algorithms ");   
		list2.add("Computer Networks");  
		list2.add("Python");  
		// printing the unsorted ArrayList   
		System.out.println("Before Sorting: "+ list2);   
		// Sorting ArrayList in ascending Order   
		// using Collection.sort() method   
		Collections.sort(list2, Collections.reverseOrder());   
		// Print the sorted ArrayList   
		System.out.println("After Sorting: "+ list2);   

		//or Integer type in Decending order
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();  
		list3.add(566);  
		list3.add(230);  
		list3.add(123);  
		list3.add(11);  
		//printing ArrayList before sorting  
		System.out.println("ArrayList Before Sorting:");  
		for(int marks: list3)  
		{  
		System.out.println(marks);  
		}  
		//sorting ArrayList in descending order  
		 Collections.sort(list3, Collections.reverseOrder());  
		//printing ArrayList after sorting  
		System.out.println("ArrayList After Sorting:");  
		for(int marks: list3)  
		{  
		System.out.println(marks);  
		}  	
		
	}

}

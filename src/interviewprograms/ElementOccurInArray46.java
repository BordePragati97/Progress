package interviewprograms;

import java.util.Scanner;

public class ElementOccurInArray46 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n; // Declare array size
		System.out.println("Enter the total number of elements ");
		n = sc.nextInt(); // Initialize array size

		int arr[] = new int[n]; // Declare array
		System.out.println("Enter the elements of the array ");
		for (int i = 0; i < n; i++) // Initialize array
		{
			arr[i] = sc.nextInt();
		}

		// Enter the element whose frequency you want to know
		System.out.println("Enter the element whose frequency you want to know");
		int ele = sc.nextInt();
		int occ = 0;

		// Traverse through map and check frequencies
		for (int i = 0; i < n; i++) {
			if (ele == arr[i]) {
				occ++; // Increment the occurrence once the element is found
			}
		}
		// Print the element and its frequency
		System.out.println(ele + " occurred " + occ + " times ");

	}
}

//Enter the total number of elements 10
//Enter the elements of the array 2 7 6 7 7 8 9 5 7 9
//Enter the element whose frequency you want to know 7
//7 occurred 4 times







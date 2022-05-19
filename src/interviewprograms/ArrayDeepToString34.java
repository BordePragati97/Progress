package interviewprograms;

import java.util.Arrays;

public class ArrayDeepToString34 {

	public static void main(String[] args) {
//1		// A Java program to print 2D array using deepToString()
        // Create a 2D array
		int[][] mat = new int[2][2];
		mat[0][0] = 99;
		mat[0][1] = 151;
		mat[1][0] = 30;
		mat[1][1] = 5;
		System.out.println(Arrays.deepToString(mat));

		// Java program to demonstrate that toString works if we
		// want to print single dimensional array, but doesn't work
		// for multidimensional array.
		// Trying to print array of strings using toString
		
//2		
		String[] strs = new String[] { "practice.geeksforgeeks.org", "quiz.geeksforgeeks.org" };
		System.out.println(Arrays.toString(strs));
        // Trying to print multidimensional array using
		// toString
		int[][] mat1 = new int[2][2];
		mat1[0][0] = 99;
		mat1[0][1] = 151;
		mat1[1][0] = 30;
		mat1[1][1] = 50;
		System.out.println(Arrays.toString(mat1));

		// Java program to demonstrate that deepToString(strs))
		// works for single dimensional arrays also, but doesn't
		// work single dimensional array of primitive types.
		
//3
		String[] strs1 = new String[] { "practice.geeksforgeeks.org", "quiz.geeksforgeeks.org" };
		System.out.println(Arrays.deepToString(strs1));

		Integer[] arr1 = { 10, 20, 30, 40 };
		System.out.println(Arrays.deepToString(arr1));

		/*
		 * Uncommenting below code would cause error as deepToString() doesn't work for
		 * primitive types int [] arr2 = {10, 20, 30, 40};
		 * System.out.println(Arrays.deepToString(arr2));
		 */

	}

}

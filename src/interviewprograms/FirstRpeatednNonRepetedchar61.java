package interviewprograms;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRpeatednNonRepetedchar61 {

	static void firstRepeatedNonRepeatedChar(String inputString) {

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		// Converting inputString to char array
		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {// Checking each char of strArray
			if (charCountMap.containsKey(c)) {
				// If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				// If char is not present in charCountMap,
				// adding this char in charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}
		for (char c : strArray) { // checking for first non-repeated character
			if (charCountMap.get(c) == 1) {
				System.out.println("First Non-Repeated Character In '" + inputString + "' is '" + c + "'");
				break;
			}
		}
		for (char c : strArray) { // checking for first repeated charact
			if (charCountMap.get(c) > 1) {
				System.out.println("First Repeated Character In '" + inputString + "' is '" + c + "'");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String input = sc.next();
		firstRepeatedNonRepeatedChar(input);

	}

}

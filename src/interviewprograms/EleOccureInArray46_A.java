package interviewprograms;

public class EleOccureInArray46_A {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 1, 7, 3, 2, 2, 2, 4, 6, 6, 4 };
		int[] count = new int[100];
		/*
		 * i: counter, temp: stock temporarily the value at a certain index of the array
		 * arr[]
		 */
		int i, tmp = 0;
		/*
		 * temp will act as an index value for the count array and will keep track of
		 * the number of occurrences of each number
		 */
		for (i = 0; i < arr.length; i++) {
			tmp = arr[i];
			count[tmp]++;
		}
		for (i = 1; i < count.length; i++) {
			if (count[i] > 0 && count[i] == 1) {
				System.out.printf("%d occurs %d times\n", i, count[i]);
			} else if (count[i] >= 2) {
				System.out.printf("%d occurs %d times\n", i, count[i]);
			}
		}

	}

}

//1 occurs 3 times
//2 occurs 3 times
//3 occurs 1 times
//4 occurs 1 times
//7 occurs 1 times
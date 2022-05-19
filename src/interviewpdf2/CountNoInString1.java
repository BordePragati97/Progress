package interviewpdf2;

public class CountNoInString1 {

	public static void main(String[] args) {

		String s = "coding is easier in Java 1234567890";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				count++;

		}
		System.out.println("the number of digits in the given string is:" + count);

	}

}

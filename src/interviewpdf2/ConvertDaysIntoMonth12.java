package interviewpdf2;

public class ConvertDaysIntoMonth12 {

	public static void main(String[] args) {

		int num = 73;

		int days = num % 30;
		int month = num / 30;
		System.out.println(num + " days = " + month + " Month and " + days + " days");	
		
	}

}

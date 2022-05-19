package interviewpdf2;

public class Triangle_13InvertedTri_14 {

	public static void main(String[] args) {

    int rows = 5, k = 0, count = 0, count1 = 0;

	    for (int i = 1; i <= rows; ++i) {
	      for (int space = 1; space <= rows - i; ++space) {
	        System.out.print("  ");
	        ++count;
	      }
	      while (k != 2 * i - 1) {
	        if (count <= rows - 1) {
	          System.out.print((i + k) + " ");
	          ++count;
	        } else {
	          ++count1;
	          System.out.print((i + k - 2 * count1) + " ");
	        }
	        ++k;
	      }
	      count1 = count = k = 0;
	      System.out.println();
	    }
	    
	     
	    System.out.println("------------------------");

	    //inverted triangle using '*'
	    int rows1 = 5;

	    for(int i = rows1; i >= 1; --i) {
	      for(int space = 1; space <= rows1 - i; ++space) {
	        System.out.print("  ");
	      }

	      for(int j=i; j <= 2 * i - 1; ++j) {
	        System.out.print("* ");
	      }

	      for(int j = 0; j < i - 1; ++j) {
	        System.out.print("* ");
	      }

	      System.out.println();
	    }
	  


		
		
		
	}

}

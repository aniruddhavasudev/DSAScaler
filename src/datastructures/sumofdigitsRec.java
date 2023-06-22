package datastructures;

public class sumofdigitsRec {

	public static void main(String[] args) {
	    int result = sum(42);
	    System.out.println(result);
	   
	  }
	  public static int sum(int k) {
	    if (k > 0 ) {
	      return k % 10 + sum(k/10)   ;
	    } else {
	      return 0;
	    }
	  }
	}

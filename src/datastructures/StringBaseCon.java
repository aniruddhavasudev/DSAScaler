package datastructures;

public class StringBaseCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "A";
		
		
		int result = 0;
	    for (int i = 0; i < A.length(); i++)
	    {
	        result *= 26;
	        result += A.charAt(i) - 'A' + 1;
	    }
	    
	    
	    System.out.println(result);
	}

}

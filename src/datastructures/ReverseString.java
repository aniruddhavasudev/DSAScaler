package datastructures;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "the sky is blue";
		
		String[] arrOfStr = A.split(" ");
		StringBuilder sc = new StringBuilder();
		 for (int i =arrOfStr.length-1 ; i>=0; i--) {
	           sc.append(arrOfStr[i]);
	           if(i !=0) {
	           sc.append(" ");
	    }}
		 
		 
//		 System.out.println(sc);
		 String singleString = sc.toString();
	}
}



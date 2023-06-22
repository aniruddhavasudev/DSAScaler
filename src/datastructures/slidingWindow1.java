package datastructures;

public class slidingWindow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int A =12;
		double logA = Math.log(A);
		double log2 = Math.log(2);
		int pow = (int)(logA/log2);
	
		
		double x = Math.pow(2, pow);
		System.out.println(((int)x));
		
		
	}

}

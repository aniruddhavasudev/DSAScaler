package AdvanceDSA;

public class MAXANDMIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {992387, 932142, 971117, 934674, 988917, 967890, 948508, 970347 };
		
		
		
		long  M = 1000000007;
		int value = 0;
		int sum =0;
		
		for(int i =0; i<A.length ; i++) {
			int max = Integer.MIN_VALUE;
			
			int min = Integer.MAX_VALUE;
			for(int j = i ; j<A.length ; j++ ) {
				max = Math.max(max, A[j]);
				min = Math.min(min, A[j]);
				
				value =  max- min;
				System.out.println(value);
				sum = value + sum;
				
			}
			
			
		}
		
		System.out.println((int) (sum%M));
		
	}

}

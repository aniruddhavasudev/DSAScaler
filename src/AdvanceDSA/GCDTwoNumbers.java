package AdvanceDSA;

import java.util.Arrays;

public class GCDTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {12, 15, 18};
		int [] B = new int [A.length];
		int factor = 1;
		for(int j =0; j<A.length ; j++) {
			int N = A[j];
			
			int SPF =1;

			if (N % 2 == 0) {
				SPF = 2 ;
				
				}
			else {
			// iterate from 3 to sqrt(n)
			for (int i = 3; i * i <= N; i += 2) {
				if (N % i == 0) {
					SPF = i;
				}
			}
			}
			
			int count = 0;
			for(int i = 1; i <= Math.sqrt(N); ++i)
	        {
	            if (N % i == 0){
	                // If both pair of factors are equal then we just print
	                // once, example for 100 : (a, b) : (10, 10)
	                // 10 should be printed just once
	                if(i == N / i) {
	                    count++;}
	                    // else print both the pairs
	                else {
	                	count++;
	                    }
	            }
	        }
			B[j] = count;
		

		}
		
		System.out.println(Arrays.toString(B));

	}
	

}

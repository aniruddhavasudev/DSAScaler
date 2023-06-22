package AdvanceDSA;

import java.util.Arrays;

public class permutationT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {2, 3, 4, 5};
		int []B = new int[4];
		
		
		
		for(int j =0; j< A.length; j++) {
			
			int cnt = 0;
        for(int i = 1; i <= Math.sqrt(A[j]); i++)
        {
            if (A[j] % i == 0) {
                // If divisors are equal,
                // count only one
                if (A[j] / i == i) {
                    cnt++;
                }
                else // Otherwise count both
                    {cnt = cnt + 2;}
            }
        }
        
        B[j] = cnt;
		
	}
		System.out.println(Arrays.toString(B));
		
	}
	

}

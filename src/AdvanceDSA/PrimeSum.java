package AdvanceDSA;

import java.util.Arrays;
import java.util.HashSet; 

public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 10;

		double num = N;
		
		HashSet<Integer> HS = new HashSet<Integer>();
		int [] B = new int[2];
		int count =0;
		 int   i, j, flag;
		for (i = 2; i <= N; i++) {
			 
//			 if(IntMath.isPrime(a1))
		}
		for (int k : HS) {
			if(HS.contains(N-k)){
				B[0] = k;
				B[1] = N-k;
			}
		}

		System.out.println(Arrays.toString(B));

	}

}

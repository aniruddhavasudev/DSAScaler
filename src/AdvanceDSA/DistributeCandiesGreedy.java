package AdvanceDSA;

import java.util.Arrays;

public class DistributeCandiesGreedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {1, 5, 2, 1};
		
		int[] L = new int[A.length];
		
		int[] R = new int[A.length];
		
		int[] Res = new int[A.length];
		
		int count =1;
		for(int i=0; i<A.length ; i++) {
			if(i==0) {
				L[i] = count;
			}
			else {
				if(A[i] > A[i-1]) {
					count++;
					L[i] = count;
				}
				else {
					L[i] = 1;
					count =1;
				}
			}
		}
		
		for(int i=A.length-1; i>=0 ; i--) {
			if(i==A.length-1) {
				R[i] = 1;
			}
			else {
				if(A[i] > A[i+1]) {
					count++;
					R[i] = count;
				}
				else {
					R[i] = 1;
					count =1;
				}
			}
			
		}
		int sum =0;
		for(int i=0; i<A.length ; i++) {
			Res[i] = Math.max(L[i], R[i]);
			sum = sum + Res[i];
		}
		System.out.println(sum);
		System.out.println(Arrays.toString(Res));
	}

}

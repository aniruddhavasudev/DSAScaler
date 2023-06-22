package AdvanceDSA;

import java.util.HashSet;

public class subarraySumzeroHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1,2,-2,4,-4};

		solve(A);
	}


	public static void solve(int[]A){
		Long[] P = new Long[A.length];

		HashSet<Long> set = new HashSet<>();

		set.add(0L);

		P[0] = (long)A[0];

		for(int i=1;i<A.length;i++){

			P[i] = P[i-1]+A[i];
			set.add(P[i]);

		}



		for(int i=0;i<A.length;i++){

			if(set.contains(P[i])) {

				System.out.println(i);
			
		}

			set.add(P[i]);
		
	}
		


	}
}



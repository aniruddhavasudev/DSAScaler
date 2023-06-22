package AdvanceDSA;

import java.util.HashMap;

public class PairswithgivensumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {2, 3, 5, 6, 10};
		int B = 6;
		
		long mod = 100000007;
		

		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i = 0; i < A.length ; i++) {
			if(hm.containsKey(A[i])) {
				hm.put(A[i], hm.get(A[i])+1);
			}
			else {
				hm.put(A[i], 1);
			}
		}

		int count = 0;
		System.out.println(hm);

		for(int i =0 ; i< A.length ; i++) {
			if(hm.containsKey(Math.abs(B-A[i])) && hm.get(B-A[i]) > 1) {
		
				System.out.println(B-A[i]);
				count++;
				count = (int) (count % mod);
				hm.put(A[i],hm.get(A[i]));
			}
		}

		System.out.println(count);

	}

}

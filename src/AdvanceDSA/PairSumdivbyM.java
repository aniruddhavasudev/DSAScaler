package AdvanceDSA;

import java.util.HashMap;

public class PairSumdivbyM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1, 2, 3, 4, 5};
		int B = 2;
		long mod = 1000000007;

		HashMap<Integer,Integer> hm = new HashMap<>();

		int count =0;
		for(int i =0; i<A.length ; i++) {

			int r = A[i] % B;
			int compliment = (B-r) % B;

			if(hm.containsKey(compliment)) {

				count = count + hm.get(compliment) ;
				count = (int) (count % mod);
			}

			hm.put(r, hm.getOrDefault(r, 0)+1);


		}

		System.out.println(count);
	}

}

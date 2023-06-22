package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class paiSumcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		A = [3, 5, 1, 2]
		//				B = 8 [ 9, 18, 17, 17, 6, 16, 13, 11, 15, 7 ]

		ArrayList<Integer> A = new ArrayList<>();
		int B =15;
		A.add(9);
		A.add(18);
		A.add(17);
		A.add(17);
		A.add(6);
		A.add(16);
		A.add(13);
		A.add(11);
		A.add(15);
		A.add(7);

		HashMap<Integer, Integer> hm = new HashMap<>();

		int old = 0;
		int newv = 0;
		for(int i=0; i<A.size(); i++) {
			if(hm.get(A.get(i)) != null) {
				old = hm.get(A.get(i));
				newv = old +1;
				hm.put(A.get(i), newv);
			}
			else {
				hm.put(A.get(i), 1);
			}}

		int count =0;
		System.out.println(hm);
		for(int i=0; i<A.size() ; i++) {

			if(hm.containsKey(B- A.get(i)) ) {
				if( hm.get(B-A.get(i)) > 0 && hm.get(A.get(i)) >0) {
				
					if(A.get(i) == B-A.get(i)) {
						if( hm.get(A.get(i)) > 1) {
							old = hm.get(B-A.get(i));
							newv = old -1;
							hm.put(B-A.get(i), newv);
							hm.getOrDefault(hm, null);
							count++;
						}
					}
					else {	
					old = hm.get(B-A.get(i));
					newv = old -1;
					hm.put(B-A.get(i), newv);
					count++;}

				}

				
			}

		}

		System.out.println(count);

	}

}

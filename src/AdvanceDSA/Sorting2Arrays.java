package AdvanceDSA;

import java.util.ArrayList;
import java.util.HashMap;

public class Sorting2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1, 2, 3, 4, 5};
		int [] B = {5, 4, 2};

		ArrayList<Integer> C = new ArrayList<>();
		ArrayList<Integer> D = new ArrayList<>();
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		

		for(int i =0; i<A.length ; i++) {
			if(hm.containsKey(A[i])) {
				hm.put(A[i], hm.get(A[i]) +1);
			}
			else {
				hm.put(A[i], 1);
			}
		}
		
		for(int j =0; j<B.length ; j++) {
			if(hm.containsKey(B[j])) {
				hm.put(B[j], hm.get(B[j])-1);
				C.add(B[j]);
			}
			else {
				D.add(B[j]);
			}
		}
		
		for(int k =0; k<A.length ; k++) {
			if(hm.containsKey(A[k]) && hm.get(A[k]) > 0) {
				C.add(A[k]);
			}
			else {
				continue;
			}
		}
		
		System.out.println(hm);
		System.out.println(C.toString());
		
	}

}

package AdvanceDSA;

import java.util.Arrays;
import java.util.HashMap;

public class DistinctNumbersinWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {1, 2, 1, 3, 4, 3};
		int B = 3;
		int [] C = new int [A.length-B+1];
		

		HashMap<Integer,Integer> mp = new HashMap<>();
		int j =0;
		int size = 0;
		
		for(int i =0; i<A.length ; i++) {
			if(i+1 <= B) {
				if (mp.containsKey(A[i])) {
					mp.put(A[i], mp.get(A[i])+1);
					size = mp.size();
				}
				else {
					mp.put(A[i], 1);
					size = mp.size();
				}
			}
			if((i+1-B) % B ==0) {
				mp.put(A[i+1-B], mp.get(A[i+1-B])-1);
				if (mp.containsKey(A[i])) {
					mp.put(A[i], mp.get(A[i])+1);
				}
				else {
					mp.put(A[i], 1);
				}
				
				if(mp.containsValue(0)) {
					size = size -1;
				}
				
				mp.put(null, null);
				
				C[j] = mp.size();
				
				j++;
			}
			
			else if (mp.containsKey(A[i])) {
				
				mp.put(A[i], mp.get(A[i])+1);
				
			}
		}
		
		System.out.println(Arrays.toString(C));
	}

}


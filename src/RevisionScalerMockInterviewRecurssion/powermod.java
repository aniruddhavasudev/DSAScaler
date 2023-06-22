package RevisionScalerMockInterviewRecurssion;

import java.util.HashMap;

public class powermod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {3,3,2,2,2,4,5,5,9,9,9};
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		
		for(int i =0; i<A.length ; i++) {
			if(hm.containsKey(A[i])) {
				hm.put(A[i], hm.get(A[i]) + 1);
			}
			else {
				hm.put(A[i], 1);
			}
			
		}
		
		System.out.println(hm);
		
	}
	
	

}

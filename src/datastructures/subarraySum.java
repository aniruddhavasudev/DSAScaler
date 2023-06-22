package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class subarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(1);
		A.add(1);
		
		ArrayList<Integer> B = new ArrayList<>();
		B.add(1);
		B.add(2);
		ArrayList<Integer> C = new ArrayList<>();
		
		int oldfreq =0;
		int newFreq =0;
		
		  for (int i = 0 ; i<A.size() ;i++) {
			  if(hm.containsKey(A.get(i)) == false) {
				  hm.put(A.get(i), 1);
		  }
		  
		  else {
			   oldfreq = hm.get(A.get(i));
			   newFreq = oldfreq +1 ;
	            hm.put(A.get(i), newFreq);
	        }
		  }
		  
		  for(int i =0; i<B.size() ; i++) {
			  C.add(hm.get(B.get(i)));
			  
		  }
		System.out.println(C);
		
	}

}

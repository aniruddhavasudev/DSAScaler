package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class Twoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A = [1, 2, 2, 1]
//		B = [2, 3, 1, 2]
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(1);
		
		
		ArrayList<Integer> B = new ArrayList<>();
		B.add(2);
		B.add(3);
		B.add(1);
		B.add(2);
		
		HashMap<Integer,Integer> C = new HashMap<>();
		ArrayList<Integer> D = new ArrayList<>();
//		HashMap<Integer,Integer> D = new HashMap<>();
		
		   int oldfreq =0;
		   int newFreq =0;
			
			  for (int i = 0 ; i<A.size() ;i++) {
				  if(C.containsKey(A.get(i)) == false) {
					  C.put(A.get(i), 1);
			  }
			  
			  else {
				   oldfreq = C.get(A.get(i));
				   newFreq = oldfreq +1 ;
		            C.put(A.get(i), newFreq);
		        }
			  }
			  
			  int oldfreq2 =0;
			  int newFreq2 =0;
		
			for(int j =0; j<B.size(); j++) {
			if(C.containsKey(B.get(j))) {			
				if(C.get(B.get(j)) > 0) {
//					System.out.println(B.get(j));
//					System.out.println(C.get(B.get(j)));
					D.add(B.get(j));
					oldfreq2 = C.get(B.get(j));
					System.out.println(oldfreq2);
					newFreq2 = oldfreq2 -1 ;
			        C.put(B.get(j), newFreq2);
				}
			}
			  }
			
//			System.out.println(D);
		
	}

}



package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class missingnumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Input:[3 1 2 5 3] 
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(2);
		A.add(2);
//		A.add(2);
//		A.add(5);
//		A.add(3);
		
		System.out.println(A);
		
		HashMap<Integer, Integer> hm = new HashMap();
		
		
		
		Collections.sort(A);
		ArrayList<Integer> E = new ArrayList<>();
		int B = 1;
		if(A.get(0) ==1) {
		for(int i =0; i<A.size()-1 ; i++) {
			int D = A.get(i);
			if(D == A.get(i+1)) {
				E.add(0,A.get(i));
			}
			else if(D+1 != A.get(i+1)) {
				E.add(D+1);
			}
		
		}
			
			
		}
			else {
				for(int i =0; i<A.size()-1 ; i++) {
					int G =A.get(i);
				
				if(G == A.get(i+1)) {
					E.add(0,A.get(i));
					E.add(1);
				}
				
				}
				
			}
		
		
		
		
		if(E.size() ==1) {
			E.add(A.get(A.size()-1) +1);
		}
		
		System.out.println(E);
	}

}

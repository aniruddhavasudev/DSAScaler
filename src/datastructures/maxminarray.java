package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class maxminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 A = [-2, 1, -4, 5, 3]
		
//		[1,2,0]
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(0);
		
		ArrayList<Integer> B = new ArrayList<>();
	
		Collections.sort(A);
		
		
		
		int count =0;
		for(int i =0; i<A.size() ; i++) {
		
			if(A.get(i) < A.size() && A.get(i) >0 ) {
				B.add(A.get(i));
			}
		}
		
		
		System.out.println(B);
		int num =0;
		for(int i =0 ; i<B.size(); i++) {
			if(B.get(i) == i+1) {
				continue;
			}
			else {
				num = B.get(i);
			}
		}
		if(num == 0) {
			if(A.size() !=B.size()) {
				
			}
		}
		
	}

}

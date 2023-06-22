package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class tesndigitsorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A = [15, 11, 7, 19]
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(15);
		A.add(11);
		A.add(7);
		A.add(19);
		
		Collections.sort(A);
		
		ArrayList<Integer> B = new ArrayList<>();
		B.addAll(A);
		int D =0;
//		System.out.println(7/10);
		for(int i =0; i<A.size() ; i++) {
			if(A.get(i)/10 == 0) {
				continue;
			}
			else {
				 D = (A.get(i)/10)%10;
				
			}
		for(int j=0; j<A.size() ; j++) {
			if(B.get(j)/10 == 0) {
				continue;
			}
			else {
				int C = (B.get(j)/10)%10;
				if(C == D && A.get(i) > A.get(j)) {
					B.set(i, A.get(j));
					System.out.println(B.set(i, A.get(j)));
				}
				
			}
			
		}
		
		}
		
		System.out.println(B);
	}
}



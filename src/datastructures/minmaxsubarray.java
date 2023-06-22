package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class minmaxsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		ArrayList<Integer> C = new ArrayList<>();
		ArrayList<Integer> D = new ArrayList<>();
		
		

		A.add(4);
		A.add(4);
		A.add(4);
		A.add(4);
		A.add(4);
		
		B.addAll(A);
		Collections.sort(B);
		int Max = B.get(B.size()-1);
		int Min = B.get(0);
		int diff = Integer.MAX_VALUE;
 if(Max == Min ) {
	 
 }
 else {
		for(int i=0; i<A.size(); i++){
			if(A.get(i) == Max) {
				C.add(i);
				
			}
			else if( A.get(i) == Min) {
				D.add(i);
			}
		}
		System.out.println(C);
		System.out.println(D);
		
			for(int j = 0 ; j<C.size() ; j++) {
				for(int k = 0; k <D.size(); k++) {
					if(C.get(j) > D.get(k) ){
						if( C.get(j) - D.get(k) < diff) {
					
						diff = C.get(j) - D.get(k) +1;
						System.out.println(diff);
					}}
					else {
						if( D.get(j) - C.get(k) < diff) {
							diff = D.get(j)-C.get(k)+1;
							
						}
						
					}
				}
			}
			System.out.println(diff);
	
}}

}

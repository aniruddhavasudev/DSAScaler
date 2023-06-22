package datastructures;

import java.util.ArrayList;

public class bitone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		B = [1, 0, 1]
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(0);
		A.add(1);
		ArrayList<ArrayList<Integer>> B = new ArrayList<>();
		for(int L=0; L<A.size(); L++) {
			ArrayList<Integer> BL = new ArrayList<>();
			
		
			for(int R = L ; R<A.size() ; R++) {
				ArrayList<Integer> BR = new ArrayList<>();
				if(L==0) {
					BR.add(A.get(R));
					B.add(BR);
					BL.add(A.get(R));
				}
				else {
					
					BL.add(A.get(R));
				}
				
			}
			B.add(BL);
			
		}
		System.out.println(B);
	}

}

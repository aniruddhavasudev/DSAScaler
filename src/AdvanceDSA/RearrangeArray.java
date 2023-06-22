package AdvanceDSA;

import java.util.ArrayList;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int A[] = {0, 2, 1, 3};
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(0);
		A.add(2);
		A.add(1);
		A.add(3);
		
		ArrayList<Integer> B = new ArrayList<>();
		B.addAll(A);
		
		for(int i =0 ; i < A.size() ; i++) {
			
			A.set(i,B.get(B.get(i)));
			
		}
		
		System.out.println(A);
	}

}

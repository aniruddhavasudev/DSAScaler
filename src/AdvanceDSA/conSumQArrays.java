package AdvanceDSA;

import java.util.ArrayList;

public class conSumQArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int A = 3;
//				B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]
		
		ArrayList<ArrayList<Integer>> B = new ArrayList<>();
		
		ArrayList<Integer> C = new ArrayList<>();
		C.add(1);
		C.add(2);
		C.add(10);
		
		ArrayList<Integer> D = new ArrayList<>();
		D.add(2);
		D.add(3);
		D.add(20);
		
		ArrayList<Integer> E = new ArrayList<>();
		E.add(2);
		E.add(5);
		E.add(25);
		
		B.add(C);
		B.add(D);
		B.add(E);
		ArrayList<Integer> F = new ArrayList<>();
		
		for(int k=0; k<A; k++) {
			F.add(0);
		}
		
		for(int i =0; i<B.size(); i++) {
				int sum =0;
				for(int l =B.get(i).get(0) -1; l< B.get(i).get(1) ; l++) {
					
					
					F.set(l,F.get(l) + (B.get(i).get(2)));
				}
		}
		System.out.println(F);
		

	}

}

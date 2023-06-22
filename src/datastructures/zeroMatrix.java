package datastructures;

import java.util.ArrayList;

public class zeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		A.add(a1);
		
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(3);
		a2.add(0);
		A.add(a2);
		ArrayList<ArrayList<Integer>> Bs = new ArrayList<>();
		Bs.addAll(A);
		ArrayList<Integer> col = new ArrayList<>();
		int m  = Integer.MIN_VALUE;
		int n = Integer.MIN_VALUE;
		
		Bs.forEach((s) -> System.out.println(s.indexOf(s.get	(0))));
		
		
		for(int i = 0; i< A.size() ; i++) {
			for(int j =0 ; j< A.get(i).size() ; j++) {
				if(A.get(i).get(j) == 0 && m!=i && n!=j) {
					m = i;
					n =j;
					i = 0;
					j = 0;
				}
				else if(m==i){
					Bs.get(i).set(j, 0);
				}
				else if(n==j) {
					Bs.get(i).set(j, 0);
				}
			}
		}
		
//		System.out.println(B);
	
	}

}

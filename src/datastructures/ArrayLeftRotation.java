package datastructures;

import java.util.ArrayList;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	    A = [1, 2, 3, 4, 5]
//		5, 17, 100, 11
		//	    	    B = [2, 3]

		ArrayList<Integer> A = new ArrayList<>();
		A.add(5);
		A.add(17);
		A.add(100);
		A.add(11);
		

		ArrayList<ArrayList<Integer>> C = new ArrayList<>();



		ArrayList<Integer> B = new ArrayList<>();
		B.add(1);
	
		for(int j=0; j<B.size() ; j++) {
			ArrayList<Integer> Cj = new ArrayList<>();
			Cj.addAll(A);
			C.add(Cj);
		}


		for(int j=0; j<B.size() ; j++) {
			int e = B.get(j);
			for(int i =0; i<A.size() ; i++) {
				if(i>=e) {
					C.get(j).set(i-e, A.get(i));
				}
				else {
					C.get(j).set(A.size()-e +i, A.get(i));
				}
			}
		}
		System.out.println(C);

	}

}

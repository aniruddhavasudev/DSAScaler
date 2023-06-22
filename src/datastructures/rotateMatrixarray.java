package datastructures;

import java.util.ArrayList;

public class rotateMatrixarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		[
//		    [1, 2],
//		    [3, 4]
//		]
//		
		
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		
		ArrayList<Integer> B = new ArrayList<>();
		B.add(3);
		B.add(4);
		
		ArrayList<ArrayList<Integer>> C = new ArrayList<>();
		C.add(A);
		C.add(B);
		
		ArrayList<ArrayList<Integer>> D = new ArrayList<>();
		
		
		for(int i=0; i<C.size(); i++ ) {
			ArrayList<Integer> Ei = new ArrayList<>();
			for(int j = C.get(i).size()-1; j>=0; j--) {
				Ei.add(C.get(j).get(i));
				System.out.println();
			}
			D.add(Ei);
		}
		
		System.out.println(D);
		
		C.clear();
		C.addAll(D);
		System.out.println(C);
		
	}

}

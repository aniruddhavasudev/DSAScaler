package datastructures;

import java.util.ArrayList;

public class testBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A = new ArrayList<>();
		A.add(2);
		A.add(3);
		A.add(1);

		ArrayList<Integer> B = new ArrayList<>();

		//		A=[2,3,1]

		int X=1;



		for(int i=0; i < A.size() ; i++) {
			int num = A.get(i);
			for(int j =0; j<A.size() ; j++) {
				if(A.get(j) == A.get(i)) {
					B.add(A.get(j));
					continue;
				}
				else if(A.get(j) -X == A.get(i)) {
					B.add(A.get(j));
					continue;
				}
				else if(A.get(j) +X == A.get(i)) {
					B.add(A.get(j));
					continue;
				}
				else {
					B.clear();
					break;
				}
			}
			if(A.size() == B.size()) {
				System.out.println(1);
				break;
			}

		}
		
		


	} 

}

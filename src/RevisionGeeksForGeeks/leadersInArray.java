package RevisionGeeksForGeeks;

import java.util.ArrayList;import java.util.Arrays;

public class leadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {16,17,4,3,5,2};

		ArrayList<Integer> B = new ArrayList<>();
		ArrayList<Integer> C = new ArrayList<>();

		if(A.length ==1) {
			//			return A[0];
			System.out.println(A[0]);
		}

		B.add(0);

		for(int i = A.length-1; i>=0; i--) {

			if( A[i] > B.get(B.size()-1)) {
				B.add(A[i]);
			}
		}

		for(int j = B.size()-1; j>0; j--) {

			C.add(B.get(j));
		}
		System.out.println(C);

	}

}

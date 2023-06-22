package datastructures;

import java.util.ArrayList;

public class maxunsortedSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		A = [1, 3, 2, 4, 5]

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(3);
		A.add(2);
		A.add(4);
		A.add(5);
		ArrayList<Integer> B = new ArrayList<>();

		ArrayList<Integer> C = new ArrayList<>();

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i =0; i<A.size()-1; i++) {

			int d1 = A.get(i);
			int d2 = A.get(i+1);

			// Comparing the ascii code.
			if (d1 > d2) {
				min = Math.min(min, i);
				max = Math.max(max, i+1);
				// Swapping of the characters
				int temp = A.get(i);
				A.set(i, A.get(i+1));
				A.set(i+1, temp);
				i = -1;

			}}

		//		C.add(B.get(0));
		//		C.add(B.get(B.size()-1));
		if(B.isEmpty())

		B.add(min);
		B.add(max);
		System.out.println(B);

	}

}

package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		[1, 2, 3, 4]

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);

		Collections.sort(A);

		for(int i=0; i<A.size(); i++) {

			if((i+1)% 2 ==0) {
				int temp = A.get(i);
				A.set(i, A.get(i-1));
				A.set(i-1,temp);
				System.out.println(temp);
			}
		}
		System.out.println(A);

	}

}

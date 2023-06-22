package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class maxGapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A = [3, 5, 4, 2]
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(3);
		A.add(5);
		A.add(4);
		A.add(2);
		
		Collections.sort(A);
		
		int maxgap =0;
		int val =A.get(0);
		int count =0;
		for(int i =0; i<A.size() ; i++) {
			int max =0;
			if(val <= A.get(i)) {
				max = i-count;
				maxgap = Math.max(maxgap, max);
			}
			else {
				val = A.get(i);
				count =0;
			}
		}
		System.out.println(maxgap);
		
	}

}

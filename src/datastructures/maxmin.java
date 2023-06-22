package datastructures;

import java.util.ArrayList;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A = new ArrayList<>();
		A.add(-6);
		int max = 0 ;
		
		for(int i = 0; i<A.size() ; i++) {
			max = A.get(i);
			if(max < A.get(i)) {
				max = A.get(i);
			}
		}
		System.out.println(max);
	}

}

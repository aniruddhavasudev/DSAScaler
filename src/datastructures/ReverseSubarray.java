package datastructures;

import java.util.ArrayList;

public class ReverseSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
//		A.add(1);
//		A.add(2);
//		A.add(3);
//		A.add(4);
//		A.add(5);
		ArrayList<Integer> D = new ArrayList<>();
//		D.addAll(A);
		
		int j = 2;
		for(int i= 4 ; i>=2 ; i-- ) {
			if(j > 4) {
				break;
			}
			else {
//				D.set(j, A.get(i));
				j++;
			}
			
		}
		
		System.out.println(A);
	}

}

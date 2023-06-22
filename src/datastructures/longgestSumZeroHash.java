package datastructures;

import java.util.ArrayList;

public class longgestSumZeroHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A = [1, -2, 1, 2]

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(-2);
		A.add(1);
		A.add(2);
		
		ArrayList<Integer> PS = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		int sum =0;
		for(int i =0; i<A.size() ; i++) {
			sum = sum + A.get(i);
			PS.add(sum);
		}
		
		System.out.println(PS);
		
		for(int L = 0; L<PS.size()-1 ;L++) {
			if(PS.get(L) == 0) {
				B.add(L+1);
			}
			for(int R = L+1; R <PS.size() ; R++) {
				if(L>0) {
					if(PS.get(L-1) == PS.get(R)) {
						B.add(R-(L-1));
				}
					
				}
			}
		}
		if(B == null)
		System.out.println(B);
	}

}

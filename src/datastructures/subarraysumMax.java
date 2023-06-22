package datastructures;

import java.util.ArrayList;

public class subarraysumMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		A = [1, 2, 3, 4, -10]

		ArrayList<Integer> A = new ArrayList<>();
		A.add(-500);
	
		ArrayList<Integer> B = new ArrayList<>();
		int sum =Integer.MIN_VALUE;
		for(int i =0; i<A.size(); i++) {
			
			int sum2 =0;
			for(int j=i ; j<A.size() ; j++) {
				sum2 = sum2 +A.get(j);

				if(sum2 > sum ){
					sum = sum2;
					B.clear();
					B.add(sum);
				}
				
			}
		}

		
		System.out.println(B.get(0));

	}

}

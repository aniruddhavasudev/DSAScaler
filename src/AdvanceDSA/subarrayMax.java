package AdvanceDSA;

import java.util.ArrayList;

public class subarrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A = [1, 2, 3, 4, -10] 
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(-10);
		int max = Integer.MIN_VALUE;
		for(int i =0; i<A.size(); i++) {
			int sum =0;
			for(int j= i ; j<A.size(); j++) {
				sum = sum + A.get(j);
				max = Math.max(max, sum);
			}
		}
		
		System.out.println(max);
		
	}

}

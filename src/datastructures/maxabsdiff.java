package datastructures;

import java.util.ArrayList;

public class maxabsdiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A=[1, 3, -1]
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(3);
		A.add(-1);
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<A.size() ; i++) {
			
			for(int j =0; j<A.size(); j++) {
			int	num = Math.abs(A.get(i)- A.get(j)) + Math.abs(i-j);
				max = Math.max(max, num);
			}
		}
		
		System.out.println(max);
	

		
		
	}

}

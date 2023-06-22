package AdvanceDSA;

import java.util.ArrayList;

public class MaxAbsDifArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A = [1, 3, -1]
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(3);
		A.add(-1);
		
		int Xmax= Integer.MIN_VALUE;
		int Xmin = Integer.MAX_VALUE;
		int Ymax= Integer.MIN_VALUE;
		int Ymin = Integer.MAX_VALUE;
		for(int i=0; i<A.size() ; i++) {
			int X = A.get(i)-i;
			int Y = A.get(i)+i;
			
			Xmax = Math.max(Xmax, X);
			Ymax = Math.max(Ymax, Y);
			Ymin = Math.min(Ymin, Y);
			Xmin = Math.min(Xmin, X);
		}
		
		int Ans = Math.max(Xmax-Xmin, Ymax-Ymin);
		
		System.out.println(Ans);
	}

}

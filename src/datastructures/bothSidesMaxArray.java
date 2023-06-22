package datastructures;

import java.util.ArrayList;

public class bothSidesMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stubA

		ArrayList<Integer> A = new ArrayList<>();
		A.add(5);
		A.add(-2);
		A.add(3);
		A.add(1);
		A.add(2);
		int B = 3;
		ArrayList<Integer> PS = new ArrayList<>();
		ArrayList<Integer> SS = new ArrayList<>();
		int prefix = 0;
		int suffix = 0;
		int j = A.size()-1;
		for(int i =0 ; i<A.size() ; i++) {
			prefix = prefix + A.get(i);
			suffix = suffix + A.get(j);
			PS.add(prefix);
			SS.add(suffix);
			j--;
		}
		System.out.println(PS);
		System.out.println(SS);

		int d = 0;
		int c = B;
		int Max = Integer.MIN_VALUE;

		for(int k = 0 ; k < B+1 ; k++ ) {
			if(c==B && d ==0) {
				Max = Math.max(Max, PS.get(c-1));	}

			else if(d==B && c ==0) {
				Max = Math.max(Max, SS.get(d-1));	

			}
			else {
				
				Max = Math.max(Max, PS.get(c-1) + SS.get(d-1));
				SS.get(d-1);
				PS.get(c-1);
			}

			d++;
			c--;
			System.out.println(c+" "+d);
		}
		System.out.println(Max);
		
	}
}

package datastructures;

import java.util.ArrayList;

public class modTWO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(4);
		A.add(2);
		A.add(1);
		A.add(9);
		A.add(5);
		A.add(6);
		A.add(3);
		A.add(4);
		A.add(4);
		A.add(8);
		double res =0;
		
		for(int i =0, exp = A.size()-1; i<A.size() ; i++,exp--) {
			
			
			res = res + (A.get(i)* Math.pow(10, exp));
			res = res % 5;
			
		}
		System.out.println((int)res);
		
//		long m = 4219563448;
	}

}

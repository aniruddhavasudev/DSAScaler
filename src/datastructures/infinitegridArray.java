package datastructures;

import java.util.ArrayList;

public class infinitegridArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<Integer> A = new ArrayList<>();
		A.add(-7);
		A.add(-13);
	


		ArrayList<Integer> B = new ArrayList<>();
		B.add(1);
		B.add(-5);
		
	

		
		int count =0;

		for(int i =0; i<A.size()-1 ; i++) {
			int x1 = A.get(i);
			int y1 = B.get(i);
			
			int x2 = A.get(i+1);
			int y2 = B.get(i+1);
			int m = x2-x1;
			int n = y2-y1;
			int x = (int) Math.pow(m,2);
			int y = (int) Math.pow(n,2);
			
			count = (int) (count + Math.sqrt(x+y));
			
		}
		System.out.println(count);
		
		

	}

}

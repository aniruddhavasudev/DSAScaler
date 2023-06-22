package datastructures;

import java.util.ArrayList;

public class modArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(4);
		A.add(3);
        String N =Integer.toString(A.get(0)) ; 
		
		
		for(int i =1; i<A.size() ; i++) {
			 N = N + Integer.toString(A.get(i)) ;
		}
		
		
		int q = Integer.parseInt(N);
		System.out.println(q);
		
		
	}

}

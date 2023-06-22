package AdvanceDSA;

import java.util.Arrays;
import java.util.HashMap;

public class Bclosestpointtooriginsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[][] A = { 
				{48, 18},
						  {17 ,44 },
						  {31, 40},
						  {20, 14},
						  {50, 45},
						  {48, 28},
						  {17, 44},
						  {19, 2},
						  {34, 41},
						  {44, 47},
						  {25, 14},
						  {44, 7}
		};
		
		int[] C = new int[A.length];
		
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		
		int B = 5;
		int[][] D = new int[B] [A[0].length];
		for(int i=0; i<A.length ; i++) {
			
				int x1 = A[i][0];
				int y1 = A[i][1];
				int x2 = 0;
				int y2 = 0;
				int P1 = (int) Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
				C[i] = P1;
				hm.put(i,P1);
				
			
		}

		
		Arrays.sort(C);
	
		 System.out.println(Arrays.toString(C));
		 System.out.println(hm);
		for(int i =0; i< B ; i++) {
			
			for (java.util.Map.Entry<Integer, Integer> entry : hm.entrySet()) {
	            if (entry.getValue().equals(C[i])) {
	            	D[i][0] = A[entry.getKey()][0];
	   			 System.out.println(D[i][0]);
	   			D[i][1] = A[entry.getKey()][1];
	   			 System.out.println(D[i][1]);
	            }
	        }
			
		}
		
		
		

	}

}

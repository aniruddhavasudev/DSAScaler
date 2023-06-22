package AdvanceDSA;

import java.util.Arrays;
import java.util.HashMap;

public class FinishMaxJobsGreedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]A = {1, 5, 7, 1 };
		int[]B = {7, 8, 8, 8};
		HashMap<Integer,Integer> hm = new HashMap<>();
		HashMap<Integer,Integer> hm2 = new HashMap<>();
		

		for (int i = 0; i < B.length; i++)   
		{  
		hm.put(i,B[i]);
		hm2.put(i,A[i]);
		}  
	
		Arrays.sort(B);
		Arrays.sort(A);
		
		for (int i = 0; i < B.length; i++)   
		{  
			/* A[i] == */
		}  
		
		int count = 1;
		for(int k =0; k<B.length ; k++) {
				if(hm2.containsValue(B[k])) {
					System.out.println(B[k]+ " " +A[k]);
					count++;
//					k=l-1;
					break;
				}
			}
			
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		System.out.println(count);
	}
	
}



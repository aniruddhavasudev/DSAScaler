package AdvanceDSA;

import java.util.Arrays;

public class ConsecElementsHshing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = { 6, 4, 5, 2, 3 };
		
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		
		int count =0;
		int maxvalue = 0;
		
		for(int i =1 ; i<A.length ; i++) {
			
			if(A[i-1] - A[i] == 1 || A[i-1] -A[i] == -1) {
				
				count++;
				System.out.println(count);
				maxvalue = Math.max(maxvalue,count);
			}
			else {
				
				maxvalue = Math.max(maxvalue,count);
				System.out.println(maxvalue);
				count = 0;
			}
		}
		System.out.println(maxvalue);
	}

}

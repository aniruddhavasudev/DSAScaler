package AdvanceDSA;

import java.util.Arrays;

public class Arraywithconsecutiveelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] A = {5, 17, 100, 11};
		
		Arrays.sort(A);
	       int j = A[0];
	        for(int i = 1; i<A.length ; i++){
	            if(A[i] == A[0]+i ){
	                continue;
	            }
	            else{
	                System.out.println("0");
	            }

	        }

	        System.out.println("1");
	    
		
	}

}

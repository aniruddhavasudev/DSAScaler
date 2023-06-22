package AdvanceDSA;

import java.util.Arrays;

public class MaxModSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {1, 2, 3, 3};
		
		Arrays.sort(A);
		
		for(int i = A.length-2 ; i >=0 ; i--) {
			if(A[i] != A[A.length-1]){
				System.out.println((A[i] % A[A.length-1]));}
		}
		
		
		
	}

}

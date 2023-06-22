package AdvanceDSA;

import java.util.Arrays;

public class MergeTwoArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [] A = {4, 7, 9 };
		int [] B = {2, 11, 19 };
		int length = A.length + B.length;
		int[] C = new int[length];
//		ArrayList<Integer> C = new ArrayList<>();



		int j =0;
		for(int i = 0; i < length ; i++) {
			if(i < A.length) {
				C[i] = A[i];}
			else {

				C[i] = B[j];
				j++;
			}

		}
		Arrays.sort(C);
		
		System.out.println(Arrays.toString(C));
	}

}

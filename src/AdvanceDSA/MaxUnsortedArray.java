package AdvanceDSA;

import java.util.Arrays;

public class MaxUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {1, 3, 2, 4, 5};

		System.out.println(Arrays.toString(subUnsort(A)));


	}

	public static int[] subUnsort(int[] A) {

		

		int [] C = new int[2];
		int B[] = new int[A.length];
	
		System.arraycopy(A, 0, B, 0, A.length);
		Arrays.sort(A);
		
//		System.out.println(Arrays.toString(A));
//		System.out.println(Arrays.toString(B));


		for(int i =0; i <A.length ; i++) {
			if(A[i] != B[i]) {
				C[0] = i;
				break;
			}
		}

		for(int i =C[0]; i <A.length ; i++) {
			if(A[i] == B[i]) {
				C[1] = i;
				break;
			}
		}

		
		return C;
	}

}

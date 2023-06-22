package AdvanceDSA;
import java.util.ArrayList;
import java.util.Arrays;

public class SubmatrixSumQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] A = {{5, 17, 100, 11},
					  {0, 0, 2, 8}};

		int[] B = {1, 1};
		int[] C = {1, 4};
		int[] D = {2, 2};
		int[] E = {2, 4};

		int [][] PS = new int[A.length][A[0].length];

		ArrayList<Integer> arr = new ArrayList<>();


		for (int i =0 ; i < A.length ; i++) {	
			for (int j =0 ; j < A[0].length; j++) {
				if (j == 0) {
					PS[i][j] = A[i][j];


				} else {
					PS[i][j] = (PS[i][j-1] + A[i][j]) % (int)(1e9 + 7);


				}
			}
		}




		//		 (B[i], C[i]) represents the top left corner of the i'th query.
		//		 (D[i], E[i]) represents the bottom right corner of the i'th query.

		for(int i = 0; i<B.length ; i++) {

			arr.add(submatrixSum(PS,B[i]-1,C[i]-1,D[i]-1,E[i]-1));

		}

		System.out.println(arr);
	}




	public static int submatrixSum(int[][] PS, int b, int c, int d, int e) {

		int sum = 0;
		System.out.println("b="+b+" c="+c+" d="+d+" e="+e);
		// Compute prefix sums for each row

		for (int i = b; i <= d; i++) {
			int row_sum = 0;
			if(c <= 0 && e-2 < 0) {
				row_sum = PS[i][e];
				sum = sum + row_sum;
			}
           else if(e-2 >= 0  ) {
				row_sum = PS[i][e] - PS[i][c-1];
				sum = sum + row_sum;
			}

		}


		// Compute submatrix sum using prefix sums

		return sum;
	}
}
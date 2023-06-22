package AdvanceDSA;

import java.util.Arrays;

public class RowtoColumnZero2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = {{97, 18, 55, 1, 50, 17, 16, 0, 22, 14},
				{58, 14, 75, 54, 11, 23, 54, 95, 33, 23},
				{73, 11, 2, 80, 6, 43, 67, 82, 73, 4},
				{61, 22, 23, 68, 23, 73, 85, 91, 25, 7},
				{6, 83, 22, 81, 89, 85, 56, 43, 32, 89},
				{0, 6, 1, 69, 86, 7, 64, 5, 90, 37},
				{10, 3, 11, 33, 71, 86, 6, 56, 78, 31},
				{16, 36, 66, 90, 17, 55, 27, 26, 99, 59},
				{67, 18, 65, 68, 87, 3, 28, 52, 9, 70},
				{41, 19, 73, 5, 52, 96, 91, 10, 52, 21}};

		int B[][] = new int[A[0].length][A.length];
		
		for (int[] row : B) {
		    Arrays.fill(row, 0);
		}
		
		

		for(int i =0; i<A.length ; i++) {
			for(int j =0; j<A[i].length ; j++) {
				
				if(A[i][j] == 0) {
					
					B = updateRows(B,i);
					B = updateColumns(B,j);
				}
				
			}
		}

		

	}

	public static int[][] updateRows(int[][]B , int i){


		for(int j =0; j<B[i].length ; j++) {
			B[i][j] = 0;
		}
		System.out.println(Arrays.toString(B[i]));
		return B;
	}

	public static int[][] updateColumns(int[][]B , int j){

		for(int i =0; i<B.length ; i++) {
			for( int k = j; k<j+1 ; k++) {
				B[i][k] = 0;
			}
		}

		return B;
	}

}

package AdvanceDSA;

import java.util.Arrays;

public class CsumQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 5;
		int [][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
		int [] C = new int[A];

		for(int i =0; i<A ; i++) {
			C[i] = 0;
		}
		
		
		 
		 for(int j=0; j<B.length ; j++) {
			 int sum = B[j][2];
			
			 for(int k =B[j][0] -1; k<B[j][1]  ; k++) {
				 sum = sum + C[k];
				 C[k] = sum;
				 sum =B[j][2];
			 }
			 
		 }
		 System.out.println(Arrays.toString(C));

	}

}

package AdvanceDSA;

import java.util.ArrayList;

public class primeSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {8, 7, 5, 6, 8, 1};
		int count =0;

		ArrayList<ArrayList<Integer>> ar = new ArrayList<>();

		for(int i= 0; i<A.length ; i++) {


			outerloop:
				for(int j =i; j<A.length ; j++) {
					ArrayList<Integer> mj = new ArrayList<>();
					int flag =0;
					for( int l=i; l<=j; l++ ) {
						if(A[l] ==1) {
							break;
						}
						else if (A[l] == 2) {
							flag = 0;
							mj.add(A[l]);
						}

						// Check if n is a multiple of 2
						else if (A[l] % 2 == 0) {
							flag =1;
							break outerloop;
						}

						else {
							// If not, then just check the odds

							for (int k = 3; k <= Math.sqrt(A[l]); k += 2) {
								if(A[l] % k == 0) {

									flag = 1;
									break outerloop;
								}
								else {

								}
							}
							if(flag ==0) {
								mj.add(A[l]);
							}
						}
						flag =0;
					}
					
					if(mj.size() >0) {
						count++;
					}

				}
			

		}
		System.out.println(count);


	}

}

package RevisionGeeksForGeeks;

import java.util.Arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,3,5,2,2};

		int PS[] = new int[A.length];

		PS[0] = A[0];

		int sum = 0;

		for(int i=0; i<A.length ; i++) {
			
			sum = sum + A[i];
			PS[i] = sum;
		}

		System.out.println(Arrays.toString(PS));

		for(int j =1; j<PS.length-1 ; j++) {

			if( (PS[PS.length-1] - PS[j-1]) - PS[j] ==0) {
				System.out.println(j+1);
				break;
			}
		}

	}
}

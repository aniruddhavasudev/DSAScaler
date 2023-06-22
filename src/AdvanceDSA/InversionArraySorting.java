package AdvanceDSA;

public class InversionArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] A = {3, 2, 1};
		int count =0;
		
	
		for(int i =0 ; i < A.length ; i++) {
			for(int j =i+1 ; j <A.length ; j++) {
			if(A[i] > A[j]) {
				count = ( count +1) % 1000000007;
			}
			
		}
		}
		System.out.println(count);
	}

}

package AdvanceDSA;

public class Binaryadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {1, 3, 5};
		int sum =0;

		for(int i =0; i<A.length ; i++) {

			for(int j=0; j<A.length ; j++) {
				sum = Integer.bitCount((A[i] ^ A[j])) + sum ;
				
			}
		}
		System.out.println(sum);
		System.out.println(sum%(int)Math.pow(10, 3));
		
		
	



	}

}

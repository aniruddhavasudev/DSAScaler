package AdvanceDSA;

public class SingleNumber3Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		A = [1, 2, 3, 1, 2, 4]

		int A = 1;
		int B = 2;
		
		int min = Math.min(A, B);
		int max = Integer.MIN_VALUE;
		
		for(int i =1 ; i<=min; i++) {
			if(A%i ==0 && B%i ==0) {
				max = Math.max(max, i);
			}
		}
		
		System.out.println(max);

	}

}

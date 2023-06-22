package AdvanceDSA;

public class PairSumdivisiblebyM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {1, 2, 3, 4, 5};
		int B = 2;
		int count =0;
		for(int i =0; i<A.length ; i++) {
			int sum = 0;
			for(int j = i+1; j< A.length ; j++) {
				sum = A[i] + A[j];
				if(sum % B ==0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

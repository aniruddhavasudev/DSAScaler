package AdvanceDSA;

public class SUBARRAYORBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [] A = {1, 2, 3, 4, 5};

		int right = 0;
		int left = 0;
		int val =0;
		while(right == A.length-1 && left ==A.length-1) {
			int sum = 0;
			while(left <= right ) {
				sum = A[left] | sum;
				System.out.println(sum);
				left++;
			}

			right++;
		}


	}

}

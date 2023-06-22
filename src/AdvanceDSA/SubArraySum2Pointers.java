package AdvanceDSA;

import java.util.Arrays;

public class SubArraySum2Pointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A= {1, 2, -2, 4, -4 };
		int B =0;
		int left =0;
		int right =0;
		int sum = 0;
		int maxarr =0;
		int r = 0;
		int l =0;
		
		while(right < A.length){

			sum = sum + A[right];

			while(sum > B && left < right){
				sum = sum - A[left];
				left++;
			}
			if(sum == B){
				if(maxarr < right+1-left) {
					maxarr = right + 1 - left;
					r = right;
					l = left;
					System.out.println(l + " "+ r + " " +maxarr);
				}
//				maxarr = Math.max(maxarr, right+1 - left);
				
			}
			right++;
		}
		int [] C = new int[maxarr];
		C = Arrays.copyOfRange(A, l, r + 1);
		System.out.println(Arrays.toString(C));
	}
}



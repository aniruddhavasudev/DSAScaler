package AdvanceDSA;

import java.util.ArrayList;
import java.util.Collections;

public class AddOnetonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		[1, 2, 3]
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(9);
		A.add(9);
		A.add(9);
		ArrayList<Integer> B = new ArrayList<>();
		
		String s = "";
		int carry =1;
		for(int i = A.size()-1; i>=0 ; i--) {
			int sum = 0;
			if(A.get(i) < 9 && i ==A.size()-1 ) {
				sum = A.get(i)+ carry;
				carry =0;
				B.add(sum);
			}
			else if (A.get(i) < 9) {
				sum = A.get(i)+ carry;
				carry =0;
				B.add(sum);
				for(int j = A.size()-2 ; j>=0; j--) {
					sum = A.get(j)+ carry;
					carry =0;
					B.add(sum);
				}
				Collections.reverse(B);
//				return B;
			}
			else if(A.get(i) >=9 && i==A.size()-1) {
				B.add(0);
				carry = 1;
			}
			
			else if(A.get(i) >=9 && i>0) {
				B.add(0);
				carry = 1;
			}
			
			else if(i ==0 && A.get(i) ==9) {
				B.add(0);
				
				B.add(1);
			}
		}

		Collections.reverse(B);
		System.out.println(B);
	}

}

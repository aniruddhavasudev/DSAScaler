package AdvanceDSA;

import java.math.BigInteger;
import java.util.ArrayList;

public class DeleteoneGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(12);
		A.add(15);
		A.add(18);
		ArrayList<Integer> B = new ArrayList<>();
		B.addAll(A);
		
		int maxvalue = Integer.MIN_VALUE;

		for(int i =0; i<A.size() ; i++) {
			int del = i;
			maxvalue = Math.max(maxvalue, delete(A,del,B));
			
			

		}
		System.out.println(maxvalue);
	}


	public static int delete(ArrayList<Integer> A,int del, ArrayList<Integer> B) {
		B.remove(del);

		
		int minvalue = Integer.MAX_VALUE;
		
		for(int i = 0; i<B.size()-1 ; i++) {
				
				BigInteger num1 = BigInteger.valueOf(B.get(i));
				BigInteger num2 = BigInteger.valueOf(B.get(i+1));

				BigInteger gcd = num1.gcd(num2);
				int intValue = gcd.intValue();
				minvalue = Math.min(intValue, minvalue);
			
			}
		B.clear();
		B.addAll(A);
		
		return minvalue;

	}

}

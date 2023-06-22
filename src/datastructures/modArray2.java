package datastructures;

import java.math.BigInteger;
import java.util.ArrayList;

public class modArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		A : [ 4, 2, 1, 9, 5, 6, 3, 4, 4, 8 ]
		int B = 5;

		ArrayList<Integer> A = new ArrayList<>();
		A.add(4);
		A.add(2);
		A.add(1);
		A.add(9);
		A.add(5);
		A.add(6);
		A.add(3);
		A.add(4);
		A.add(4);
		A.add(8);
		
		String N =Integer.toString(A.get(0)) ; 


		for(int i =1; i<A.size() ; i++) {
			N = N + Integer.toString(A.get(i)) ;
			
		}

		BigInteger bi = new BigInteger(N);
		BigInteger d = BigInteger.valueOf(B);
		BigInteger result = bi.mod(d); 
		int intValueOfb1 = result.intValue();
		System.out.println(result);



	}

}

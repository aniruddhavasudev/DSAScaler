package AdvanceDSA;

import java.math.BigInteger;

public class NCR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int A = 41;
		int  B = 27;
		int C = 143;

		BigInteger factn = BigInteger.ONE;
	    for (long i = 2; i <= A; i++) {
	    	factn = factn.multiply(BigInteger.valueOf(i));}
		
		BigInteger factr = BigInteger.ONE;
		for (long j = 2; j <= B; j++) {
			factr = factr.multiply(BigInteger.valueOf(j));}
		
	
		BigInteger factnr = BigInteger.ONE;
		for (long k = 2; k <= A-B; k++) {
			factnr = factnr.multiply(BigInteger.valueOf(k));}
		
//		 factnr = factnr.mod(BigInteger.valueOf(C));
//		 factn = factn.mod(BigInteger.valueOf(C));
//		 factr = factr.mod(BigInteger.valueOf(C));
//		 
//		 System.out.println(factn.divide(factnr.multiply(factr)));
		factn = factn.mod(BigInteger.valueOf(C));
		factnr = factnr.mod(BigInteger.valueOf(C));
		factr = factr.mod(BigInteger.valueOf(C));
		
//		 BigInteger m = factn.divide(factnr.multiply(factr));
		 int n = factn.intValue();
		 
		 
//		fact(n) / (fact(r) *
//                fact(n - r));
		
		
		System.out.println(n);

	}

}

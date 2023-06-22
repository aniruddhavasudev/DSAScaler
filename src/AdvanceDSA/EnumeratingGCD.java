//package AdvanceDSA;
//
//import java.math.BigInteger;
//
//public class EnumeratingGCD {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String  A = "678728391838182039102";
//		String 	B = "678728391838182039103";
//		BigInteger M=new BigInteger(A);
//		BigInteger N=new BigInteger(B);
//
//		int GCD = findGCD(M,N);
//		String G = String.valueOf(GCD);
//		System.out.println(G);
//	}
//
//	public static int findGCD(BigInteger m, BigInteger n) {
//		while(n != 0){
//			Biginteger temp = n;
//			n = m % n;
//			m = temp;
//		}
//		return (int)m;
//	}
//}

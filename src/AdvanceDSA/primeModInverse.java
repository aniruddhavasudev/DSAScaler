package AdvanceDSA;

public class primeModInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 3;
		int B = 5;
//		AB-1 ≡ 1 (mod B)
		int C = (int) Math.pow(A, B)-A;
		System.out.println(C%B);
	}

}

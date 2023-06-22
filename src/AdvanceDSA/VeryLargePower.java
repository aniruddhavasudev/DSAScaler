package AdvanceDSA;

public class VeryLargePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 2;
		int B = 27;

		System.out.println(calculatePowerModulo(A,B));

	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static long calculatePowerModulo(int A, int B) {
		
		long MOD = 1000000007;
		int f = factorial(B);
		long result = 1;
		
		System.out.println(f);

		long calc = (long) (Math.pow(A,f));
		
		System.out.println(calc % MOD);

		return calc;
	}
}

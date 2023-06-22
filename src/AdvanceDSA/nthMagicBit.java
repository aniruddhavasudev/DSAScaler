package AdvanceDSA;

public class nthMagicBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 10;

		System.out.println(solve(A));
	}

	public static int solve(int A) {
		int result = 0;
		int power = 1;
		while (A > 0) {
			power *= 5;
			if ((A & 1) == 1) {
				result += power;
			}
			System.out.println(Integer.toBinaryString(A) + " " + result);
			A >>= 1;
			
			
		}
		return result;
	}

}

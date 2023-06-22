package AdvanceDSA;

public class VeryLargePowJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A = 2;
		int B = 27;
		
		long mod = 100000007;
		
		int C = factorial(B);
		System.out.println(C);
		
		System.out.println((int)(Math.pow(A,C) % mod));
	}

	public static int factorial(int n) {
		int num = 1;
		long mod = 100000007;
		for (int i = 2; i <= n; i++) {
			num = num * i;
			num = (int)(num % mod);
		}
		return num;
	}

}

package AdvanceDSA;

import java.util.ArrayList;

public class PrimeSubsequencesJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = { 2, 2 };

		System.out.println(printSubsequences(A));


	}

	public static boolean isPrime(int n) {

		if (n < 2) return false;
		if(n==2) {
			return true;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) return false;
		}
		return true;

	}

	public static int printSubsequences(int[] arr) {

		int n = arr.length;
		int count =0;
		int primes =0;

		// Generate all possible binary strings of length n
		int numSubsequences = (int) Math.pow(2, n);
		for (int i = 0; i < numSubsequences; i++) {
			ArrayList<Integer> subsequence = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					subsequence.add(arr[j]);
					if (isPrime(arr[j]) == true) {
//						System.out.println(subsequence.get(k));
						count++;
					}
					else {
						count = 0;
					}
					
					if(count == subsequence.size() && count!=0) {
						
						primes++;
					}

				}
			}

			count =0;
			subsequence.clear();

		}

		return primes;
	}

}



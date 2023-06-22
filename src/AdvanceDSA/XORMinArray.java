package AdvanceDSA;

import java.util.Arrays;
import java.io.*;

public class XORMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {0, 2, 5, 7};
		int max = Arrays.stream(A).max().getAsInt();

		// Sort given array
		Arrays.parallelSort(A);

		int minXor = Integer.MAX_VALUE;
		int val = 0;

		// calculate min xor of consecutive pairs
		for (int i = 0; i < A.length- 1; i++) {

			val = A[i] ^ A[i + 1];

			
			System.out.println(Integer.toBinaryString(A[i]));
			System.out.println(Integer.toBinaryString(A[i+1]));
			System.out.println(Integer.toBinaryString(val));
			System.out.println("**************");

			minXor = Math.min(minXor, val);
		}

		System.out.println(minXor);
	}

}

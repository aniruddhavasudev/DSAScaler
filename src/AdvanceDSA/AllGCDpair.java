package AdvanceDSA;

import java.util.Arrays;

public class AllGCDpair {
    public static int[] solve(int[] A) {
    
       return findOriginalNumbers(A);
    
    
    }

    public static int[] findOriginalNumbers(int[] arr) {
        int n = arr.length;
        int gcd = arr[0];

        // Find the GCD of the first two elements
        for (int i = 1; i < n; i++) {
            gcd = gcd(gcd, arr[i]);
        }

        // Calculate the original numbers
        int[] original = new int[n / 2];
        int idx = 0;
        for (int i = 0; i < n/2; i++) {
        	 System.out.println(idx);
            original[idx] = 0;
            	int g= 	arr[i]/gcd;
            idx++;
            i++;
        }

        return original;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    
    public static void main(String[] args) {
    	int [] A = { 1, 31, 1, 1, 1, 1, 14, 2, 1, 1, 1, 2, 22, 1, 11, 1, 1, 1, 1, 23, 1, 1, 11, 1, 11 };
    	
    System.out.println(Arrays.toString(solve(A)));
    }
}



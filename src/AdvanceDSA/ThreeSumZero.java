package AdvanceDSA;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [] A = {1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3};

		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		Arrays.sort(A);

		for (int i = 0; i < A.length - 2; i++) {
			if (i > 0 && A[i] == A[i-1]) continue; // Skip duplicates
			int left = i + 1, right = A.length - 1;
			int j =0;
			while (left < right) {
				int sum = A[i] + A[left] + A[right];
				if (sum == 0) {
					ArrayList<Integer> aj = new ArrayList<>();
					aj.add(A[i]);
					aj.add(A[left]);
					aj.add(A[right]);
					res.add(aj);
					left++;
					right--;
					while (left < right && A[left] == A[left-1]) left++; // Skip duplicates
					while (left < right && A[right] == A[right+1]) right--; // Skip duplicates
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
				j++;
			}
		}

		

		System.out.println(res);

	}
}



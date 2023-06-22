package AdvanceDSA;

public class SubarraySum0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1, 2, 3, 4, 5};
		System.out.println(solve(A));
	}

	public static int solve(int [] A) {
		int left = 0;
		int right = 0;
		int sum = 0;
		int target = 0;

		while (right < A.length) {
			// move right pointer and add element to sum
			sum += A[right];
			right++;
			if (sum == target) {
				return 1;
			}
			// if sum exceeds target, move left pointer and subtract element from sum
			while (sum > target && left < right) {
				sum -= A[left];
				left++;
				if (sum == target) {
					return 1;
				}
			}

			}


		return 0;
	}
}

package AdvanceDSA;

import java.util.ArrayList;
import java.util.List;

public class backTRackingexample {

	public static List<List<Integer>> findSubsets(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		backtrack(nums, target, 0, new ArrayList<>(), result);
		return result;
	}

	private static void backtrack(int[] nums, int target, int start, List<Integer> subset, List<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<>(subset));
			return;
		}

		for (int i = start; i < nums.length; i++) {
			if (nums[i] > target) {
				continue;
			}

			subset.add(nums[i]);
			backtrack(nums, target - nums[i], i + 1, subset, result);
			System.out.println(subset);
			subset.remove(subset.size() - 1);
		}
	} 

	public static void main(String[] args) {
		int[] nums = {2, 3, 6, 7};
		int target = 7;

		List<List<Integer>> subsets = findSubsets(nums, target);

		for (List<Integer> subset : subsets) {
			System.out.println(subset);
		}
	}
}

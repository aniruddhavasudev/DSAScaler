package AdvanceDSA;

import java.util.ArrayList;
import java.util.HashSet;

public class PermutaionsBacktracking {

	public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		backtrack(result, new ArrayList<>(), nums);
		return result;
	}

	private static void backtrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> tempList, ArrayList<Integer> nums) {
		if (tempList.size() == nums.size()) {
			result.add(new ArrayList<>(tempList));
		} else {
			for (int i = 0; i < nums.size(); i++) {
				//	                if (tempList.contains(nums.get(i))) continue;
				tempList.add(nums.get(i));
				backtrack(result, tempList, nums);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(1);
		A.add(2);
		System.out.println(permute(A));
		HashSet<ArrayList<Integer>> hashSet = new HashSet<>();



		hashSet.addAll(permute(A));
		System.out.println(hashSet);
	}
}

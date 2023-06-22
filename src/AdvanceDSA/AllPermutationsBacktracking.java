package AdvanceDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AllPermutationsBacktracking {


	    public static List<List<Integer>> permuteUnique(int[] nums) {
	        Arrays.sort(nums); // Sort the array to handle duplicates
	        List<List<Integer>> result = new ArrayList<>();
	        backtrack(nums, new boolean[nums.length], new ArrayList<>(), result);
	        return result;
	    }

	    private static void backtrack(int[] nums, boolean[] used, List<Integer> permutation, List<List<Integer>> result) {
	        if (permutation.size() == nums.length) {
	            result.add(new ArrayList<>(permutation));
	            return;
	        }

	        for (int i = 0; i < nums.length; i++) {
	            if (used[i] || (i > 0 && nums[i] == nums[i-1] && !used[i-1])) {
	                continue; // Skip duplicates and already used elements
	            }
	            used[i] = true;
	            permutation.add(nums[i]);
	            backtrack(nums, used, permutation, result);
	            used[i] = false;
	            permutation.remove(permutation.size() - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 1, 2};

	        List<List<Integer>> permutations = permuteUnique(nums);

	        for (List<Integer> permutation : permutations) {
	            System.out.println(permutation);
	        }
	    }
	}

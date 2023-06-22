package AdvanceDSA;

import java.util.ArrayList;
import java.util.HashSet;

public class AllUniqePermutationsbacktracking {
	
	public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A ){
		ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
		backtrack(subsets, new ArrayList<>(), A);
		
		return subsets;
	}

	private static void backtrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> tempList, ArrayList<Integer> nums) {
        if (tempList.size() == nums.size()) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.size(); i++) {
                if (tempList.contains(nums.get(i))) continue;
                tempList.add(nums.get(i));
                backtrack(result, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(1);
		nums.add(2);
		
		HashSet<ArrayList<Integer>> hashSet = new HashSet<>();
        
		System.out.println(permute(nums));
		
//		hashSet.addAll(permute(nums));
		System.out.println(hashSet);
	}

}

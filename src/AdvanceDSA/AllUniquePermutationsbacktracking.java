package AdvanceDSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AllUniquePermutationsbacktracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(1);
		A.add(2);
		ArrayList<ArrayList<Integer>> uniqueList = removeDuplicates(permute(A));
		System.out.println(uniqueList);
	}
	
	public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {

    	ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    	 
        backtrack(result, new ArrayList<>(), A);
        return result;
    }
    
    private static void backtrack(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> tempList, ArrayList<Integer> nums) {
        if (tempList.size() == nums.size()) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.size(); i++) {
//                if (tempList.contains(nums.get(i))) continue;
                tempList.add(nums.get(i));
                backtrack(result, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
    
    public static ArrayList<ArrayList<Integer>> removeDuplicates(ArrayList<ArrayList<Integer>> list) {
        Set<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for (ArrayList<Integer> subList : list) {
            if (!set.contains(subList)) {
                set.add(subList);
                result.add(subList);
            }
        }
        
        return result;
    }

}




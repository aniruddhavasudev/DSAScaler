package AdvanceDSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SubSetBacktracking {
	
	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A ){
		ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
		generatesets(0,A,new ArrayList<>(),subsets);
		
		return subsets;
	}

	 static void generatesets(int idx, ArrayList<Integer> a, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> subsets) {
		// TODO Auto-generated method stub
		 Collections.sort(current);
		subsets.add(new ArrayList<>(current));
		
		for(int i=idx; i<a.size(); i++) {
			current.add(a.get(i));
			generatesets(i+1,a,current,subsets);
			current.remove(current.size()-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(1);
		nums2.add(2);
		nums2.add(4);
		
		HashSet<ArrayList<Integer>> hs = new HashSet<>();
		hs.add(nums);
		hs.add(nums2);
		
		if(nums.containsAll(nums2)) {
			System.out.println(nums);
		}
		
		System.out.println(hs);
		
//		System.out.println(subsets(nums));
		
	}

}

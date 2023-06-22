package AdvanceDSA;

import java.util.ArrayList;
import java.util.Collections;

public class subsetBacktrackingjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		System.out.println(subsets(A));
	}
	
	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	    ArrayList<Integer> subset = new ArrayList<>();
	    
	    Collections.sort(A);
	    backtrack(A, 0, subset, result);
	    
	    return result;
	}

	private static void backtrack(ArrayList<Integer> A, int start, ArrayList<Integer> subset, ArrayList<ArrayList<Integer>> result) {
	    result.add(new ArrayList<>(subset));
	    
	    for (int i = start; i < A.size(); i++) {
	        if (i > start && A.get(i).equals(A.get(i-1))) {
	            continue; // skip duplicates
	        }
	        
	        subset.add(A.get(i));
	        System.out.println(subset);
	        backtrack(A, i+1, subset, result);
	        System.out.println(subset);
	        subset.remove(subset.size() - 1);
	    }
	}
}


package AdvanceDSA;
import java.util.ArrayList;
import java.util.Collections;

public class SumtheDifferenceSorting3 {


	public static void main(String[] args)
	{
		int[] nums = {1, 2};
		int sum =0;
		long mod = 100000007;
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		res.add(new ArrayList<>());
		for (int num : nums) {
			int size = res.size();
			int diff =0;
			for (int i = 0; i < size; i++) {
				ArrayList<Integer> newSubseq = new ArrayList<>();
				newSubseq.add(num);
				Collections.sort(newSubseq);
				diff = newSubseq.get(newSubseq.size()-1)- newSubseq.get(0);
				System.out.println(diff);
				sum = sum + diff;
				sum = (int) (sum % mod);
			}
		}
		System.out.println(sum);
	}



}



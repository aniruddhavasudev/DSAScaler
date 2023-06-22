package AdvanceDSA;

import java.util.ArrayList;
import java.util.List;

public class SubarraySumHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {5, 10, 20, 100, 105};
		int	 B = 110;
		
		List<List<Integer>> result2 = subArraySum(A,B);
		
		if(result2.size() != 0) {
			System.out.println(subArraySum(A,B));
		}
		
		else {
			System.out.println(-1);
		}

		
	}


	public static List<List<Integer>> subArraySum(int[] arr,int B) {
		List<List<Integer>> result = new ArrayList<>();
		int n = arr.length;
		int k = 0;
		int [] C = null;
		outerloop:
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = i; j < n; j++) {
					sum = sum + arr[j];
					List<Integer> subArray = new ArrayList<>();
					if(sum == B) {
						for (int l = i; l <= j; l++) {
							subArray.add(arr[l]);
						}
						result.add(subArray);
						break outerloop;
					}
				}
			}

		return result;
	}


}

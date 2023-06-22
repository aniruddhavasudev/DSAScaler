package AdvanceDSA;

import java.util.HashMap;

public class uniqueElementsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {17, 89, 75, 42, 33, 14, 65, 2, 41, 22, 43, 2, 92, 67, 83, 51, 19, 54, 84, 73, 37, 62, 45, 79, 99, 49, 26, 33, 88, 55, 24, 50, 44, 46, 92, 64, 70, 89, 29, 66, 43, 52, 36, 93, 29, 29, 53, 98, 67, 100, 76, 24, 91, 58, 21, 12, 55, 62, 57, 19, 96, 84, 14, 57, 42, 38, 61, 79, 11, 100, 39, 29, 24, 64, 90, 99, 8, 1, 15, 92, 78, 3, 32, 45, 34, 43, 1, 33, 34, 27, 1, 50, 31, 86, 76};
		HashMap<Integer,Integer> hm = new HashMap<>();
		int count =0;
		
		for(int i =0; i<A.length ; i++) {
			if(hm.containsKey(A[i])== true) {
				
				hm.replace(A[i], hm.get(A[i]) +1);
//				hm.put(hm.size(), A[i]+1);
				count++;
				i--;
				
			}
			else {
				hm.put(A[i],1);
			}
		}
		System.out.println(count);
	}

}

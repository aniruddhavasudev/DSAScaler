package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class duplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		[3 4 1 4 1]
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(3);
		A.add(4);
		A.add(1);
		A.add(4);
		A.add(1);
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		int sum = 0;
		int oldv =0;
		int newv =0;
		for(int i =0;i<A.size() ;i++) {
			if(hm.containsKey(A.get(i)) ) {
				sum =A.get(i);
			}
			else {
				hm.put(A.get(i), 1);
			}
		}
		
		System.out.println(sum);
	}

}

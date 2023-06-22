package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class factorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<Integer> A = new ArrayList<>();
		A.add(6);
		A.add(8);
		A.add(9);
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i =0; i< A.size() ; i++) {
			
		int count =0;
		for (int j = 1; j <= (A.get(i)/2) ; ++j) {
			if (A.get(i) % j == 0) {
				count++;
			}
		}
		
		hm.put(A.get(i), count);		
		}

		System.out.println(hm);
		
		
	}
}


package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class firstrepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		 A = [10, 5, 3, 4, 3, 5, 6]

		ArrayList<Integer> A = new ArrayList<>();
		A.add(10);
		A.add(5);
		A.add(3);
		A.add(4);
		A.add(3);
		A.add(5);
		A.add(6);

		HashMap<Integer, Integer> hm = new HashMap<>();
		int oldfreq =0;
		int newFreq =0;
		int repeat = Integer.MAX_VALUE;
		int ele =0;

		for (int i = 0 ; i<A.size() ;i++) {
			if(hm.containsKey(A.get(i)) == false) {
				hm.put(A.get(i), 1);
			}
			else {
				oldfreq = hm.get(A.get(i));
				newFreq = oldfreq +1 ;
				hm.put(A.get(i), newFreq);
			}
		}
		
		for(int i =0; i<A.size() ; i++) {
			 if(hm.get(A.get(i)) >1){
				 System.out.println(hm.get(A.get(i)));
				 if(repeat > i) {
					 repeat = i;
					 ele = A.get(i);
				 }
			 }
		}
		
//		if(ele == 0) {
//			return -1;
//		}
//		else {
//			return ele;
//		}
		System.out.println(ele);
	}
	
}



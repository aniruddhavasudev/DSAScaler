package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class bitmalcountnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		A = [1, 2, 2, 3, 1]
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(3);
		A.add(1);
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		int oldv =0;
		int newv =0;
		
		for(int i=0; i<A.size() ; i++) {
			if(hm.containsKey(A.get(i))) {
				oldv = hm.get(A.get(i));
				newv = oldv +1;
				hm.put(A.get(i), newv);
			}
			else {
				hm.put(A.get(i), 1);
			}
		}
		for(Entry<Integer, Integer> entry: hm.entrySet()) {

		      // if give value is equal to value from entry
		      // print the corresponding key
		      if(entry.getValue() == 1) {
		        System.out.println(entry.getKey());
		        break;
		      }
	}

	}
}

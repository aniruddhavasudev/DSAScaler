package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;



public class maxcountarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A =new ArrayList<>();
		A.add(4);
		A.add(1);
		A.add(3);
		A.add(3);
		A.add(3);
		ArrayList<Integer> C =new ArrayList<>();
		HashMap<Integer, Integer> B = new HashMap<>();
		
		for(int i =0 ; i< A.size() ; i++) {
			 Integer count = B.get(A.get(i));
			if (count == null) {
	            B.put(A.get(i), 1);
	        }
	        // else increment the found value by 1
	        else {
	            B.put(A.get(i), count + 1);
	        }
			
			
		}
		int maxValueInMap=(Collections.max(B.values()));
		int maxkey = 0;
		if(maxValueInMap >= A.size() /2) {
			for (HashMap.Entry<Integer, Integer> entry : B.entrySet()) {
			    if(maxValueInMap == entry.getValue()) {
			    	maxkey = entry.getKey();
			    }
			}
		}
		
//		int max
		

		System.out.println(maxkey);
	
	}

}

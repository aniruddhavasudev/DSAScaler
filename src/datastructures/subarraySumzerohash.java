package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class subarraySumzerohash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		//		 A = [1, 0, 1]
		ArrayList<Integer> A = new ArrayList<>();
		A.add(-1);
		A.add(-8);
		A.add(-13);
		A.add(5);
		A.add(-4);
		A.add(13);
		A.add(10);
		A.add(13);
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		int B = 4;
		int sum =0;
		int count =0;
		int oldv =0;
		int newv =0;
//		for(int i=0; i<A.size(); i++) {
//			if(hm.containsKey(A.get(i))){
//			oldv = hm.get(A.get(i));
//			newv = oldv +1;
//			hm.put(A.get(i), newv);
//			}
//			else {
//				hm.put(A.get(i), 1);
//		}
//		}
		
		for(int i=0; i<A.size(); i++) {
			sum = sum + A.get(i);
		
				 int removeSum=sum-B;
				 
		           //get count of occurrences of that sum that
		          //have to removed and add it to res value
		            if (hm.containsKey(removeSum)) {
		                count += hm.get(removeSum);
		 
		            // Add currsum value to count of
		            // different values of sum.
		            hm.put(sum,hm.getOrDefault(sum,0)+1);}
		 
		}
		System.out.println(count);
	}

}

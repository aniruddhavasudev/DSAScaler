package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class freqhash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		A : [ 2, 1, 2, 1, 2, 1, 2, 1, 2 ]
		
		int B =1;
		ArrayList<Integer> A = new ArrayList<>();
		A.add(2);
		A.add(1);
		A.add(2);
		A.add(1);
		A.add(2);
		A.add(1);
		A.add(2);
		A.add(1);
		A.add(2);
		
		 Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
	        final int mod = (int)(1e9 + 7);
	        long ans = 0;
	        int oldv =0;
	        int newv =0;
	        
	        for(int i = 0 ; i < A.size() ; i++){
	            if(freq.containsKey(A.get(i))){
	                oldv = freq.get(A.get(i));
	                newv = oldv +1;
	                freq.put(A.get(i), newv);
	            }
	            else {
	            freq.put(A.get(i), freq.getOrDefault(A.get(i), 0) + 1);}
	        }
	        
	        for(int i = 0 ; i < A.size() ; i++){
	            if(freq.containsKey(A.get(i) -B )){
	                ans = (ans + freq.get(A.get(i)-B )) ;
	            }
	        }
	        System.out.println(ans);
		
	}

}

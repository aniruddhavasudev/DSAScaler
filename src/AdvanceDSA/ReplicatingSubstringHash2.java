package AdvanceDSA;

import java.util.HashMap;
import java.util.Map;

public class ReplicatingSubstringHash2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 2;
		String B = "bbaabb";

		HashMap<Character,Integer> hm = new HashMap<>();


		for(int i = 0; i<B.length() ; i++) {
			if(hm.containsKey(B.charAt(i))) {
				hm.put(B.charAt(i), hm.get(B.charAt(i))+1);
			}
			else {
				hm.put(B.charAt(i), 1);
			}
		}
		
		System.out.println(hm);
		
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
		    char key = entry.getKey();
		    int value = entry.getValue();
		    if(value % A ==0) {
		    	continue;
		    }
		    else {
		    	System.out.println("****");
		    	break;
		    }
		}
	}

}

package AdvanceDSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class nonrepeatingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {1, 2, 2, 3, 1};
		HashMap<Integer,Integer> hm = new HashMap<>();


		Arrays.sort(A);


		int count =0;
		int old =0;
		int newc =0;

		for(int i=0; i<A.length ; i++) {

			hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);

		}
	
	System.out.println(hm);
	if(hm.containsValue(1)) {
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
			if(entry.getValue() ==1) {
				System.out.println("Key = " + entry.getKey() );
			}

		}}


}

}

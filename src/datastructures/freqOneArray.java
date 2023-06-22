package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class freqOneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		A = [3, 4, 3, 6, 6]

		ArrayList<Integer> A = new ArrayList<>();
		A.add(3);
		A.add(4);
		A.add(3);
		A.add(6);
		A.add(6);

		HashMap<Integer,Integer> hm = new HashMap<>();
		int oldfreq =0;
		int newFreq =0;
		for(int i=0; i<A.size(); i++) {
			if(hm.containsKey(A.get(i)) == false) {
				hm.put(A.get(i), 1);
			}

			else {
				oldfreq = hm.get(A.get(i));
				newFreq = oldfreq +1 ;
				hm.put(A.get(i), newFreq);
			}
		}
		int count =0;
		for (HashMap.Entry<Integer,Integer> entry : hm.entrySet()) {
			if(entry.getValue() == 1) {
				count++;
			}}
		System.out.println(count);
	}

}

package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class zeroSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		A = [1, -1, -2, 2]
		//		A : [ -1, 8, -4, 7, -4, 0, -8, -2, -7 ]
		//		A : [ -10, 2, 2, 9, -5, 2, 4, 2, -4, -8 ]

		ArrayList<Integer> A = new ArrayList<>();

		A.add(30);
		A.add(-30);
		A.add(30);
		A.add(-30);

		HashMap<Integer, Integer> hm = new HashMap<>();

		ArrayList<Integer> PS = new ArrayList<>();
		int sum =0;
		int oldv =0;
		int newv =0;
		for(int i=0; i<A.size() ; i++) {
			sum = sum + A.get(i);
			PS.add(sum);

		}
		System.out.println(PS);
		for(int i=0; i<PS.size() ; i++)  {
			if(hm.containsKey(PS.get(i)) == true) {
				oldv = hm.get(PS.get(i));
				newv = oldv +1;
				hm.put(PS.get(i), newv);}
			else {
				hm.put(PS.get(i), 1);

			}

		}


		int count =0;
		int count2 =0;
		if(hm.containsKey(0)) {
			 count2 =hm.get(0);
		}
		count = count + count2;
		for (Map.Entry<Integer, Integer> set :
			hm.entrySet()) {
			//			System.out.println(set.getKey());

			if(hm.containsKey(set.getKey()) && set.getValue() >0) {

				oldv = set.getValue();
				newv = oldv -1;
				hm.put(set.getKey(), newv);
				count++;
			}

		}



		System.out.println(count);
	}

}

package AdvanceDSA;

import java.util.HashMap;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm = new HashMap<>();

		int []  A = {1, 1, 3};
		int count =0;

		for(int i : A) {
			if(hm.containsKey(i)) {
				int j = hm.get(i);
				while(hm.containsKey(i)) {
					hm.put(i+1, 1);
					count++;
				}
			}
			else {
				hm.put(i, 1);
			}
		}

		System.out.println(count);



	}

}

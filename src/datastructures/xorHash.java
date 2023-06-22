package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class xorHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		A = [5, 4, 10, 15, 7, 6]
		int B = 5;

		ArrayList<Integer> A = new ArrayList<>();
		A.add(5);
		A.add(4);
		A.add(10);
		A.add(15);
		A.add(7);
		A.add(6);

		HashMap<Integer, Integer> hm = new HashMap<>();
		int oldv =0;
		int newv =0;
		for(int i=0; i<A.size(); i++) {
			if(hm.containsKey(A.get(i))){
				oldv = hm.get(A.get(i));
				newv = oldv +1;
				hm.put(A.get(i), newv);
			}
			else {
				hm.put(A.get(i), hm.getOrDefault(A.get(i), 0) + 1);}
		}
		
		System.out.println(hm);
		int count =0;
		for(int i=0; i<A.size(); i++) {
			if(hm.containsKey(A.get(i) ^ B)){
				count++;
			}
		}
		System.out.println(count/2);
	}

}

package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class subarraysumhash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		 A = [5, 10, 3, 2, 50, 80]
		int B = 5;

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		ArrayList<Integer>H = new ArrayList<>();
		ArrayList<Integer> PS = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		int oldv =0;
		int newv =0;
		int count =0;
		int sum =0;
		for(int i=0; i<A.size(); i++) {
			sum = sum + A.get(i);
			PS.add(sum);
		}
		 outerloop:
		for(int L =1; L <PS.size() ; L++) {
			
			for(int R =L; R<PS.size() ; R++) {
				int b = PS.get(L-1);
				int e = PS.get(R);
				H.add(A.get(R));
				if( PS.get(R)- PS.get(L-1) ==B) {
					count++;
					break  outerloop;
				}
				else {
					continue;
				}
			}
		}
		 
		
		System.out.println(H);




}

}

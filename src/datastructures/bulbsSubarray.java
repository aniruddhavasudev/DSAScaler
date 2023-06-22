package datastructures;

import java.util.ArrayList;

public class bulbsSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		A = [0, 1, 0, 1]
		ArrayList<Integer> A = new ArrayList<>();
		A.add(0);
		A.add(1);
		A.add(0);
		A.add(1);
		int count =0;
		
		for(int i =0 ; i<A.size() ; i++) {
			if(A.get(i) == 0) {
				count++;
				for(int j =i; j<A.size() ; j++) {
					if(A.get(j) ==0) {
						A.set(j, 1);
					}
					else {
						A.set(j, 0);
					}
					
					
				}
			}
		}
		System.out.println(count);
		
		
	}

}

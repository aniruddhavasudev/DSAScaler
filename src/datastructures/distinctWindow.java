package datastructures;

import java.util.ArrayList;
import java.util.HashSet;

public class distinctWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		A = [1, 2, 1, 3, 4, 3]
		ArrayList<Integer> A = new ArrayList<>();

		A.add(1);
		A.add(2);
		A.add(1);
		A.add(3);
		A.add(4);
		A.add(3);
		ArrayList<Integer> C = new ArrayList<>();
		ArrayList<Integer> D = new ArrayList<>();
		int B = 3;
		HashSet<Integer> hs = new HashSet<>();
		int R = B-1;
		for(int L = 0; L<A.size() ; L++) {
				
				if(L==R) {
					D.add(A.get(L));
					hs.addAll(D);
					C.add(hs.size());
					hs.clear();
					D.remove(0);
					R = R + 1;
					
				}
				else {
					D.add(A.get(L));
				}
				
			
		}
		
		System.out.println(C);
	}

}

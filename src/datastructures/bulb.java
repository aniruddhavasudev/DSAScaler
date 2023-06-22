package datastructures;

import java.util.ArrayList;

public class bulb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		 A = [0, 1, 0, 1]

		ArrayList<Integer> A = new ArrayList<>();
		A.add(0);
		A.add(1);
		A.add(0);
		A.add(1);


		int ans =0;
		for(int i=0; i<A.size(); i++) {
			if(i+1 <A.size()) {
				if(A.get(i) ==0) {
					A.set(i, 1);
					ans++;
					A.get(i+1);
					if(A.get(i+1) == 0) {
						A.set(i+1, 1);}
					else {
						A.set(i+1, 0);
					}
				}
				}
			else {
				if(A.get(i) ==0) {
					A.set(i, 1);
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}

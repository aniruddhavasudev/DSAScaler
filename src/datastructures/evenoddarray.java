package datastructures;

import java.util.ArrayList;

public class evenoddarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A =new ArrayList<>();
		A.add(1);
		A.add(1);
		A.add(1);
		
		ArrayList<Integer> B =new ArrayList<>();

		int count =0;
		int[] index = {0};
		int[] evensum = {0};
		int[] oddsum = {0};
		for(int i = 0 ; i<A.size() ; i++) {
			B.addAll(A);
			B.remove(i);
			B.forEach((e) -> {
				if(index[0] % 2 ==0) {
					evensum[0] = evensum[0] + e;
					index[0] = index[0] + 1;
				}
				else {
					oddsum[0] = oddsum[0] + e;
					index[0] = index[0] + 1;
				}
			});
			index[0] = 0;
			if(evensum[0] == oddsum[0] ) {
				count++;
			}
			evensum[0] = 0;
			oddsum[0] =0;
			B.clear();
		}
		System.out.println(count);
	}

}




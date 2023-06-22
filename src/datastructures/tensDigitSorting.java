package datastructures;

import java.util.ArrayList;

public class tensDigitSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		[15, 11, 7, 19]
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(15);
		A.add(11);
		A.add(7);
		A.add(19);
		
		int count =0;
		for(int i =0; i<A.size() ; i++) {
			
			if(A.get(i)/10 >0) {
				count = A.get(i) % 10;
			}
			else {
				count =0;
			}
		}
		System.out.println(count);
		
	}

}
